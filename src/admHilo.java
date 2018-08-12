
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import org.graphstream.graph.Node;
import javax.swing.JOptionPane;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class admHilo extends Thread {

    private JLabel lbl_time;
    private boolean avance;
    private boolean live;
    private int timeTotal;
    private ArrayList<Node> vertex;
    private JComboBox jc_here;
    private JComboBox jc_there;
    private JButton btn_iniciar;
    private Graph graph;

    public admHilo(JLabel lbl_time, JComboBox jc_here, JComboBox jc_there, JButton btn_iniciar, Graph graph) {
        this.lbl_time = lbl_time;
        this.jc_here = jc_here;
        this.jc_there = jc_there;
        this.btn_iniciar = btn_iniciar;
        this.graph = graph;
        live = true;
        avance = true;
    }

    void SetDefault() {
        for (Node node : graph) {
            if (!((boolean) node.getAttribute("estate"))) {
                node.setAttribute("ui.class", "marked_defult");
            } else {
                node.setAttribute("ui.class", "marked_closed");
            }
        }
        for (Edge edge : graph.getEachEdge()) {
            edge.addAttribute("ui.class", "highlight_black");
        }
        for (Node node : graph) {//Agrega las etiquetas
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge edge : graph.getEachEdge()) {
            edge.addAttribute("ui.label", (Object) edge.getAttribute("length"));
        }

    }

    void HideElements() {
        for (Node node : graph) {
            node.addAttribute("ui.class", " hide");
        }
        for (Edge edge : graph.getEachEdge()) {
            edge.addAttribute("ui.class", " hide");
        }
    }

    public Graph CopyGraph() {
        Graph tempGraph = new SingleGraph("Temporal Graph");
        for (Node node : graph) {
            if (!(boolean) node.getAttribute("estate")) {
                tempGraph.addNode(node.getId());
                tempGraph.getNode(node.getId()).addAttribute("ui.label", node.getId());
            }
        }
        for (Edge edge : graph.getEachEdge()) {
            Node nodeLeft = edge.getNode0();
            Node nodeRight = edge.getNode1();
            if (tempGraph.getNode(nodeLeft.getId()) != null && tempGraph.getNode(nodeRight.getId()) != null) {
                tempGraph.addEdge(edge.getId(), nodeLeft.getId(), nodeRight.getId());
                tempGraph.getEdge(edge.getId()).addAttribute("ui.label", (Object) edge.getAttribute("length"));
            } else {
                System.out.println("LOS QUE NO SE AGREGARON: ");
                System.out.println("ARISTA" + edge.getId());
                System.out.println("NODO IZQUIERDA" + nodeLeft.getId());
                System.out.println("NODO DERECHA" + nodeRight.getId());
            }
        }
        return tempGraph;
    }

    public ArrayList<Node> getVertex() {
        return vertex;
    }

    public void setVertex(ArrayList<Node> vertex) {
        this.vertex=vertex;
        System.out.println("nuevo vertice"+vertex);
        PaintVertex("highlight_alternative");
        CalculateTime();
    }

    public void CalculateTime() {
        timeTotal=0;
        for (int i = 0; i < vertex.size(); i++) {
            if (i != vertex.size() - 1) {
                timeTotal += (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
            }
        }
        lbl_time.setText(timeTotal + "");
    }

    public void PaintVertex(String style) {
        for (int i = 0; i < vertex.size(); i++) {
            if (i != vertex.size() - 1) {
                vertex.get(i).getEdgeBetween(vertex.get(i + 1)).addAttribute("ui.class", style);
            }
        }

    }

    void Dikstra(String from, String to) {
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, "result", "length");
        dijkstra.init(graph);
        dijkstra.setSource(graph.getNode(from));
        dijkstra.compute();
        vertex = new ArrayList<Node>();
        timeTotal = 0;
        for (Node node : dijkstra.getPathNodes(graph.getNode(to))) {
            node.addAttribute("ui.class", "marked_visited");

            vertex.add(0, node);
        }
        CalculateTime();
        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        PaintVertex("highlight_original");
    }

    @Override
    public void run() {
        jc_here.disable();
        jc_there.disable();
        btn_iniciar.show(false);
        if (!(vertex.size() == 0)) {
            while (avance) {
                if (live) {
                    if (Integer.parseInt(lbl_time.getText()) <= 0) {
                        live = false;
                        avance = false;

                        try {
                            JOptionPane.showMessageDialog(null, "Usted ha llegado a su destino", "llegando al Destino ", JOptionPane.INFORMATION_MESSAGE);
                            jc_here.enable();
                            jc_there.enable();
                            btn_iniciar.show(true);
                            SetDefault();
                            Thread.sleep(0);

                        } catch (InterruptedException ex) {
                        }
                    } else {
                        for (int i = 0; i < vertex.size(); i++) {
                            if (i != vertex.size() - 1) {
                                try {
                                    Thread.sleep(3000);
                                    vertex.get(i).getEdgeBetween(vertex.get(i + 1)).addAttribute("ui.class", "highlight");
                                    System.out.println((int)vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length"));
                                    timeTotal -= (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
                                    
                                    lbl_time.setText(timeTotal + "");
                                } catch (InterruptedException ex) {

                                }
                            }
                        }

                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe conexión entre los destinos", "No se puede calcular la ruta", JOptionPane.ERROR_MESSAGE);
            jc_here.enable();
            jc_there.enable();
            btn_iniciar.show(true);
            lbl_time.setText("N/A");
            SetDefault();
        }
    }
}
//
//import java.awt.List;
//import java.util.ArrayList;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JLabel;
//import org.graphstream.graph.Node;
//import javax.swing.JOptionPane;
//import org.graphstream.algorithm.Dijkstra;
//import org.graphstream.graph.Edge;
//import org.graphstream.graph.Graph;
//import org.graphstream.graph.implementations.SingleGraph;
//
//public class admHilo extends Thread {
//
//    private JLabel lbl_time;
//    private boolean avance;
//    private boolean live;
//    private int timeTotal;
//    private ArrayList<Node> vertex;
//    private ArrayList<Node> vertexOriginal;
//    private JComboBox jc_here;
//    private JComboBox jc_there;
//    private JButton btn_iniciar;
//    private Graph graphOriginal;
//    private Graph alternativeRuteGraph;
//    private Graph graph;
//
//    public admHilo(JLabel lbl_time, JComboBox jc_here, JComboBox jc_there, JButton btn_iniciar, Graph graphOriginal) {
//        this.lbl_time = lbl_time;
//        this.jc_here = jc_here;
//        this.jc_there = jc_there;
//        this.btn_iniciar = btn_iniciar;
//        this.graphOriginal = graphOriginal;
//      //  this.alternativeRuteGraph = CopyGraph();
//        graph = graphOriginal;
//        live = true;
//        avance = true;
//        vertexOriginal = Dikstra(jc_here.getSelectedItem().toString(), jc_there.getSelectedItem().toString(), graphOriginal);
//    }
//
//    public Graph getGraphOriginal() {
//        return graphOriginal;
//    }
//
//    public void setGraphOriginal(Graph graphOriginal) {
//        this.graphOriginal = graphOriginal;
//    }
//
//    public Graph getAlternativeRuteGraph() {
//        return alternativeRuteGraph;
//    }
//
//    public void setAlternativeRuteGraph(Graph alternativeRuteGraph) {
//        this.alternativeRuteGraph = alternativeRuteGraph;
//    }
//
//    void SetDefault() {
//        for (Node node : graph) {
//            if (!((boolean) node.getAttribute("estate"))) {
//                node.setAttribute("ui.class", "marked_defult");
//            } else {
//                node.setAttribute("ui.class", "marked_closed");
//            }
//        }
//        for (Edge edge : graph.getEachEdge()) {
//            edge.addAttribute("ui.class", "highlight_black");
//        }
//        for (Node node : graph) {//Agrega las etiquetas
//            node.addAttribute("ui.label", node.getId());
//        }
//        for (Edge edge : graph.getEachEdge()) {
//            edge.addAttribute("ui.label", (Object) edge.getAttribute("length"));
//        }
//
//    }
//
//    void HideElements() {
//        for (Node node : graph) {
//            node.addAttribute("ui.class", " hide");
//        }
//        for (Edge edge : graph.getEachEdge()) {
//            edge.addAttribute("ui.class", " hide");
//        }
//    }
//
//    public Graph CopyGraph() {
//        Graph tempGraph = new SingleGraph("Temporal Graph");
//        for (Node node : graphOriginal) {
//            if (!(boolean) node.getAttribute("estate")) {
//                tempGraph.addNode(node.getId());
//                tempGraph.getNode(node.getId()).addAttribute("ui.label", node.getId());
//            }
//        }
//        for (Edge edge : graphOriginal.getEachEdge()) {
//            Node nodeLeft = edge.getNode0();
//            Node nodeRight = edge.getNode1();
//            if (tempGraph.getNode(nodeLeft.getId()) != null && tempGraph.getNode(nodeRight.getId()) != null) {
//                tempGraph.addEdge(edge.getId(), nodeLeft.getId(), nodeRight.getId());
//                tempGraph.getEdge(edge.getId()).addAttribute("ui.label", (Object) edge.getAttribute("length"));
//            }
//        }
//        return tempGraph;
//    }
//
//    public void SetTime() {
//        timeTotal = 0;
//        for (int i = 0; i < vertex.size(); i++) {
//            if (i != vertex.size() - 1) {
//                timeTotal += (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
//            }
//        }
//        lbl_time.setText(timeTotal + "");
//        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
//        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");
//    }
//
//    public boolean DeterminateRuteToFollow(ArrayList<Node> closed) {
//        boolean useAlternativeRute = false;
//        Node nodeFrom = graph.getNode(jc_here.getSelectedItem().toString());
//        Node nodeTo = graph.getNode(jc_there.getSelectedItem().toString());
//
//        for (Node node : vertexOriginal) {
//            if (closed.contains(node) && node != nodeFrom && node != nodeTo) {
//                JOptionPane.showMessageDialog(null, "Lo sentimos, la ruta mas corta tiene una o mas calles cerradas, trataremos de calcular una ruta alterna", "Calle cerrada en el camino", JOptionPane.ERROR_MESSAGE);
//                useAlternativeRute = true;
//                
//                break;
//            }
//        }
//        if (!useAlternativeRute) {
//            if (closed.contains(nodeTo)) {
//                JOptionPane.showMessageDialog(null, "Tu destino se encuentra bloqueado, pero el camino esta libre, puedes caminar hasta el final de esa ruta", "Malas noticias", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//        return useAlternativeRute;
//    }
//
//    public void SetGraphToDikstra(boolean flag, String from, String to) {
//        if (flag) {
//            ArrayList<Node> vertexAlternative = Dikstra(from, to, alternativeRuteGraph);
//            System.out.println(vertexAlternative);
//            vertex = vertexAlternative;
//           
//            /*Pintamos la ruta Alternativa*/
//            for (int i = 0; i < vertexAlternative.size(); i++) {
//                if (i != vertexAlternative.size() - 1) {
//                    vertexAlternative.get(i).getEdgeBetween(vertexAlternative.get(i + 1)).addAttribute("ui.class", "highlight_alternative");
//                }
//            }
//        } else {
//            vertex = vertexOriginal;
//        }
//        SetTime();
//
//
//        /*Pintamos la ruta originas*/
//        for (int i = 0; i < vertexOriginal.size(); i++) {
//            if (i != vertexOriginal.size() - 1) {
//                vertexOriginal.get(i).getEdgeBetween(vertexOriginal.get(i + 1)).addAttribute("ui.class", "highlight_original");
//            }
//        }
//
//    }
//
//    public ArrayList<Node> Dikstra(String from, String to, Graph graph) {
//        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, "result", "length");
//        dijkstra.init(graph);
//        dijkstra.setSource(graph.getNode(from));
//        dijkstra.compute();
//        ArrayList<Node> vertex = new ArrayList<Node>();
//        for (Node node : dijkstra.getPathNodes(graph.getNode(to))) {
//            node.addAttribute("ui.class", "marked_visited");
//            vertex.add(0, node);
//        }
//        return vertex;
//    }
//
//    @Override
//    public void run() {
//        jc_here.disable();
//        jc_there.disable();
//        btn_iniciar.show(false);
//        if (!(vertex.size() == 0)) {
//            while (avance) {
//                if (live) {
//                    if (Integer.parseInt(lbl_time.getText()) == 0) {
//                        live = false;
//                        avance = false;
//                        jc_here.enable();
//                        jc_there.enable();
//                        try {
//                            JOptionPane.showMessageDialog(null, "Usted ha llegado a su destino", "llegando al Destino ", JOptionPane.INFORMATION_MESSAGE);
//                            jc_here.enable();
//                            jc_there.enable();
//                            btn_iniciar.show(true);
//                            SetDefault();
//                            Thread.sleep(0);
//
//                        } catch (InterruptedException ex) {
//                        }
//                    } else {
//                        for (int i = 0; i < vertex.size(); i++) {
//                            if (i != vertex.size() - 1) {
//                                try {
//                                    Thread.sleep(3000);
//                                    vertex.get(i).getEdgeBetween(vertex.get(i + 1)).addAttribute("ui.class", "highlight");
//                                    timeTotal -= (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
//                                    lbl_time.setText(timeTotal + "");
//                                } catch (InterruptedException ex) {
//
//                                }
//                            }
//                        }
//
//                    }
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "No existe conexión entre los destinos", "No se puede calcular la ruta", JOptionPane.ERROR_MESSAGE);
//             jc_here.enable();
//                        jc_there.enable();
//            SetDefault();
//        }
//    }
//}
