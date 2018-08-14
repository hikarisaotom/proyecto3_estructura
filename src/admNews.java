/* Titulo: Proyecto #3 Resolución de problemas aplicando teoría de Grafos.
 Proposito: Crear una aplicación útil para la resolución de problemas relaciohados con el transito
            dentro de una ciudad implementando la teoria de grafos.
 Clase: CCC209 – Q3 – 2018
 Author: Claudia Cortés*/
import javax.swing.JLabel;
import javax.swing.JPanel;

public class admNews extends Thread {

    private JLabel lbl_showNews;
    private JPanel jp_showNews;
    private String message;
    private int x = 0, y = 0;
    /* 
 Descripción: Constructor de la clase admNews, reservara un espacio en memoria para el objeto que se esta instanciando.
 Params:JLabel lbl_showNews, sera la etiqueta/label en la cual mostraremos el texto informativo.
    String Message, sera el texto que se mostrara en la etiqueta .
    JPanel jp_showNews representa el panel contenedor de la etiqueta.
 Retorna: 
 Errores: */
    public admNews(JLabel lbl_showNews, String Message, JPanel jp_showNews) {
        this.lbl_showNews = lbl_showNews;
        this.message = Message;
        this.jp_showNews = jp_showNews;
        x = lbl_showNews.getX();
        y = 0;
        lbl_showNews.setLocation(x, y);
        lbl_showNews.setText(this.message);
    }

    /* 
 Descripción:Actualiza el mensaje que se mostrara en la etiqueta 
 Params: String message, que sera el nuevo texto que se mostrara en la etiqueta informativa 
Retorna:N/A
 Errores: N/A */
    public void SetMessage(String message) {
        this.message = message;
        lbl_showNews.setText(message);
    }

    /* 
 Descripción: Ejecuta el movimiento animado de la etiqueta dentro del panel 
 Params: N/A
Retorna: N/*A
 Errores: N/A*/
    @Override
    public void run() {
        while (true) {
            if (true) {
                lbl_showNews.setLocation(x, y);

                try {
                    Thread.sleep(1000);
                    y = y + 10;
                } catch (Exception e) {
                }
                if (y > jp_showNews.getHeight()) {
                    y = 0;
                }
            }
        }
    }

}
