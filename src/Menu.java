
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.graph.*;

import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swingViewer.ViewPanel;

/*view*/
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.View;
/**/
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swingViewer.*;
import org.graphstream.ui.view.*;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Graph = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jc_here = new javax.swing.JComboBox<>();
        jc_there = new javax.swing.JComboBox<>();
        jp_show = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jd_Graph.setTitle("Rutas");
        jd_Graph.setBounds(new java.awt.Rectangle(0, 0, 100000, 100000));
        jd_Graph.setLocation(new java.awt.Point(0, 0));

        jLabel1.setText("Locacion Actual");

        jLabel2.setText("destino");

        jc_here.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_hereItemStateChanged(evt);
            }
        });
        jc_here.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_hereActionPerformed(evt);
            }
        });

        jc_there.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_thereItemStateChanged(evt);
            }
        });

        jp_show.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jp_showLayout = new javax.swing.GroupLayout(jp_show);
        jp_show.setLayout(jp_showLayout);
        jp_showLayout.setHorizontalGroup(
            jp_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        jp_showLayout.setVerticalGroup(
            jp_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_GraphLayout = new javax.swing.GroupLayout(jd_Graph.getContentPane());
        jd_Graph.getContentPane().setLayout(jd_GraphLayout);
        jd_GraphLayout.setHorizontalGroup(
            jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_GraphLayout.createSequentialGroup()
                .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_GraphLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jc_here, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jc_there, 0, 185, Short.MAX_VALUE)))
                    .addGroup(jd_GraphLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jp_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_GraphLayout.setVerticalGroup(
            jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_GraphLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_GraphLayout.createSequentialGroup()
                        .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_here, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_there, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jp_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Empezar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        starGraph();
        display();
        jd_Graph.pack();
        jd_Graph.setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds()); 
        jd_Graph.show(true);
      


    }//GEN-LAST:event_jButton1MouseClicked

    private void jc_hereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_hereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_hereActionPerformed

    private void jc_hereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_hereItemStateChanged
        for (Node node : graph) {//Agrega las etiquetas
            node.setAttribute("ui.class", "marked_defult");
        }
        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");

    }//GEN-LAST:event_jc_hereItemStateChanged

    private void jc_thereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_thereItemStateChanged
        for (Node node : graph) {//Agrega las etiquetas
            node.setAttribute("ui.class", "marked_defult");
        }
        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");

    }//GEN-LAST:event_jc_thereItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });

    }
    protected String styleSheet
            = "node {"
            + "	fill-color: blue;"
            + "}"
            + "node.marked {"
            + "	fill-color: red;"
            + "}"
            + "node.marked_defult {"
            + "	fill-color: blue;"
            + "}";

    public void starGraph() {

        graph = CreateGraph(ReadFile());
        DefaultComboBoxModel modelHere = new DefaultComboBoxModel();
        DefaultComboBoxModel modelThere = new DefaultComboBoxModel();
        for (Node node : graph) {
            modelHere.addElement(node);
            modelThere.addElement(node);
        }
        jc_here.setModel(modelHere);
        jc_there.setModel(modelThere);
        graph.addAttribute("ui.stylesheet", styleSheet);

    }

    private void display() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout()) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(600, 600);
            }
        };
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = viewer.addDefaultView(false);
        panel.add(viewPanel);
        
        jd_Graph.add(panel);
        frame.add(panel);
        frame.pack();
        jp_show.add(panel, BorderLayout.CENTER);
    }

    public File ReadFile() {
        JFileChooser fileChooseer = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivos", "txt", "csv", "docx");
        fileChooseer.addChoosableFileFilter(filter);
        int op = fileChooseer.showOpenDialog(this);

        String extension = fileChooseer.getSelectedFile().getPath();

        System.out.println(extension);
        if (op == JFileChooser.APPROVE_OPTION) {
            return fileChooseer.getSelectedFile();
        }
        return null;
    }

    public Graph CreateGraph(File toCreate) {
        Graph graph = new SingleGraph("Principal Graph");
        graph.setNullAttributesAreErrors(true);//para evitar elementos en nulo 
        graph.setStrict(false);
        graph.setAutoCreate(true);
        if (toCreate.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(toCreate);
                while (sc.hasNext()) {
                    String data[] = sc.next().split(",");
                    for (int i = 0; i < 3; i++) {//el largo deberia ser 3                         
                        if (i != 2) {
                            if (!(graph.getNode(data[i]) != null)) {
                                Node node = graph.addNode(data[i]);

                            }
                        } else {
                            if (!(graph.getEdge(data[2]) != null)) {
                                graph.addEdge(data[2], data[0], data[1]);
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
            sc.close();
        }//Fin del if 
        for (Node node : graph) {//Agrega las etiquetas
            node.addAttribute("ui.label", node.getId());
        }

        return graph;
    }

    public void Dikstra() {

    }

    Graph graph;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jc_here;
    private javax.swing.JComboBox<String> jc_there;
    private javax.swing.JDialog jd_Graph;
    private javax.swing.JPanel jp_show;
    // End of variables declaration//GEN-END:variables
}
