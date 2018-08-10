
import java.util.ArrayList;
import javax.swing.JLabel;
import org.graphstream.graph.Node;
import javax.swing.JOptionPane;

public class admHilo extends Thread {

    private JLabel etiqueta;
    private boolean avance;
    private boolean live;
    private int time;
    private ArrayList<Node> vertex;

    public admHilo(JLabel etiqueta, boolean avance, boolean live, int time, ArrayList<Node> vertex) {
        this.etiqueta = etiqueta;
        this.avance = avance;
        this.live = live;
        this.time = time;
        this.vertex = vertex;
    }

    public void run() {
        if (!(vertex.size() == 0)) {
            while (avance) {
                if (live) {
                    if (Integer.parseInt(etiqueta.getText()) == 0) {
                        live = false;
                        avance = false;
                        try {
                            JOptionPane.showMessageDialog(null, "Usted ha llegado a su destino", "llegando al Destino ", JOptionPane.INFORMATION_MESSAGE);
                            Thread.sleep(0);
                        } catch (InterruptedException ex) {
                        }
                    } else {
                        for (int i = 0; i < vertex.size(); i++) {
                            if (i != vertex.size() - 1) {
                                try {
                                    Thread.sleep(3000);
                                    vertex.get(i).getEdgeBetween(vertex.get(i + 1)).addAttribute("ui.style", "fill-color: red;");
                                    time -= (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
                                    etiqueta.setText(time + "");
                                } catch (InterruptedException ex) {

                                }
                            }
                        }

                    }
                }
            }

        } else {
JOptionPane.showMessageDialog(null,"No existe conexión entre los destinos","No se puede calcular la ruta",JOptionPane.ERROR_MESSAGE);
        }
    }
}
