
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Claudia Cortes
 */
public class admNews extends Thread {

    private JLabel lbl_showNews;
    private JPanel jp_showNews;
    private String message;
    private boolean live;
    private boolean avance;
    private int x = 20, y = 10;

    public admNews(JLabel lbl_lbl_showNews, String Message, JPanel jp_showNews) {
        this.lbl_showNews = lbl_lbl_showNews;
        this.message = Message;
        this.jp_showNews = jp_showNews;
        live = true;
        avance = true;
        x = (jp_showNews.getWidth() / 2) - 30;
        y=0;
        lbl_showNews.setText(Message);
    }

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
