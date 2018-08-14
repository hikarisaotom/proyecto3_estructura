/* Titulo: Proyecto #3 Resolución de problemas aplicando teoría de Grafos.
 Proposito: Crear una aplicación útil para la resolución de problemas relaciohados con el transito
            dentro de una ciudad implementando la teoria de grafos.
 Clase: CCC209 – Q3 – 2018
 Author: Claudia Cortés*/
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
    private int distanceTotal;
    private ArrayList<Node> vertex;
    private JComboBox jc_here;
    private JComboBox jc_there;
    private JButton btn_iniciar;
    private Graph graph;
    private JLabel lbl_showKMS;

    /* 
Descripción: Constructor de la clase que administra el hilo del recorrido.
Params: JLabel lbl_time, sera la etiqueta en la que mostraremos el tiempo total/el tiempo que falta para llegar al destino
    JComboBox jc_here, comboBox que contiene nuestro punto de partida.
    JComboBox jc_there, comboBox que contiene nuestro destino.
    JButton btn_iniciar, Boton que inicializara el hilo.
    Graph graph, Grafo que contiene nuestra ruta a seguir
Retorna: N/A
Errores: N/A*/
    public admHilo(JLabel lbl_time, JComboBox jc_here, JComboBox jc_there, JButton btn_iniciar, Graph graph, JLabel lbl_showKMS) {
        this.lbl_time = lbl_time;
        this.jc_here = jc_here;
        this.jc_there = jc_there;
        this.btn_iniciar = btn_iniciar;
        this.graph = graph;
        live = true;
        avance = true;
        this.lbl_showKMS = lbl_showKMS;
    }

    /* 
Descripción: Devuelve  todos los elementos del grafo a su estado original 
Params: N/A
Retorna: N/A
Errores: N/A*/
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

    /* 
Descripción: Retorna el arreglo de vertices que forman la ruta mas cercana entre dos puntos del grafo. 
Params: N/A
Retorna: ArrayList<Node> vertex, el arreglo de vertices de la ruta mas corta
Errores: N/A*/
    public ArrayList<Node> getVertex() {
        return vertex;
    }

    /* 
Descripción: Actualiza el valor el arreglo de vertices que forman la ruta mas cercana entre dos puntos del grafo. 
Params: ArrayList<Node> vertex, será la nueva ruta a seguir dentro del grafo.
Retorna: N/A
Errores: */
    public void setVertex(ArrayList<Node> vertex) {
        this.vertex = vertex;
        PaintVertex("highlight_alternative");
        CalculateTime();
    }

    /* 
Descripción: Calcula el tiempo total que se tardara el usuario en transportarse desde e únto A hasta el punto B
Params: N/A
Retorna: N/A
Errores: N/A*/
    public void CalculateTime() {
        timeTotal = 0;
        distanceTotal = 0;
        for (int i = 0; i < vertex.size(); i++) {
            if (i != vertex.size() - 1) {
                timeTotal += (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
                distanceTotal += (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("kilometers");
            }
        }
        lbl_time.setText(timeTotal + "");
        lbl_showKMS.setText(distanceTotal + "");
    }

    /* 
Descripción: Cambiara el diseño de los vertices que forman el camino de la ruta mas corta dependiendo de su recorrido
Params: String style, sera el estilo que se aplicara a los vertices
Retorna: N/A
Errores: N/A*/
    public void PaintVertex(String style) {
        for (int i = 0; i < vertex.size(); i++) {
            if (i != vertex.size() - 1) {
                vertex.get(i).getEdgeBetween(vertex.get(i + 1)).addAttribute("ui.class", style);
            }
        }

    }

    /* 
Descripción: Determina la ruta mas corta entre dos puntos y genera un arreglo con los mismos
Params: String from, el nombre del vertice el que se encuentra actualmente
        String to, nombre del vertice al cual se desea mobilizar 
Retorna: N/A
Errores: El manejo de errores del metodo que determina la ruta mas corta se encuentra ya validado en la clase Dikstra*/
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

    /* 
 Descripción: Ejecuta el movimiento animado del recorrido dentro del grafo 
 Params: N/A
Retorna: N/*A
 Errores: N/A*/
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
                                    timeTotal -= (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
                                    distanceTotal -= (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("kilometers");
                                    lbl_showKMS.setText(distanceTotal + "");
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
            lbl_showKMS.setText("N/A");
            SetDefault();
        }
    }
}
