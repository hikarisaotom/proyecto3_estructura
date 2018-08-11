
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import org.graphstream.graph.Node;
import javax.swing.JOptionPane;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;

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

    void Dikstra(String from, String to) {
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, "result", "length");
        dijkstra.init(graph);
        dijkstra.setSource(graph.getNode(from));
        dijkstra.compute();
        SetDefault();
        vertex = new ArrayList<Node>();
        timeTotal = 0;
        HideElements();
        for (Node node : dijkstra.getPathNodes(graph.getNode(to))) {
            node.addAttribute("ui.class", "marked_visited");

            vertex.add(0, node);
        }
        for (int i = 0; i < vertex.size(); i++) {
            if (i != vertex.size() - 1) {
                timeTotal += (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
            }
        }
        lbl_time.setText(timeTotal + "");
        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");

    }

    @Override
    public void run() {
        jc_here.disable();
        jc_there.disable();
        btn_iniciar.show(false);
        if (!(vertex.size() == 0)) {
            while (avance) {
                if (live) {
                    if (Integer.parseInt(lbl_time.getText()) == 0) {
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
                                    vertex.get(i).getEdgeBetween(vertex.get(i + 1)).addAttribute("ui.class", "highlight_black");

                                    Thread.sleep(3000);
                                    vertex.get(i).getEdgeBetween(vertex.get(i + 1)).addAttribute("ui.class", "highlight");
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
        }
    }
}
