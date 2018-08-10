
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
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.*;
import org.graphstream.algorithm.Dijkstra;
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
        jLabel3 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jd_CreateNewRute = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jc_newhere = new javax.swing.JComboBox<>();
        jc_newthere = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_newnode = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
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

        jp_show.setBackground(new java.awt.Color(0, 0, 0));
        jp_show.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jp_show.setPreferredSize(new java.awt.Dimension(800, 750));

        javax.swing.GroupLayout jp_showLayout = new javax.swing.GroupLayout(jp_show);
        jp_show.setLayout(jp_showLayout);
        jp_showLayout.setHorizontalGroup(
            jp_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jp_showLayout.setVerticalGroup(
            jp_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jLabel3.setText("tiempo estimado:");

        lbl_time.setText("N/A");

        jButton2.setText("Iniciar Recorrido");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jMenu2.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");

        jMenuItem2.setText("Crear Ruta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jd_Graph.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_GraphLayout = new javax.swing.GroupLayout(jd_Graph.getContentPane());
        jd_Graph.getContentPane().setLayout(jd_GraphLayout);
        jd_GraphLayout.setHorizontalGroup(
            jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_GraphLayout.createSequentialGroup()
                .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_GraphLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_GraphLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc_there, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jc_here, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_GraphLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jp_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addGap(23, 23, 23)
                        .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jc_there, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_time))
                        .addGap(39, 39, 39)
                        .addComponent(jButton2))
                    .addComponent(jp_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(461, Short.MAX_VALUE))
        );

        jLabel4.setText("Desde");

        jLabel5.setText("Hasta");

        jButton4.setText("crear");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jc_newhere, 0, 217, Short.MAX_VALUE)
                    .addComponent(jc_newthere, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jc_newhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_newthere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addComponent(jButton4)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Arista", jPanel1);

        jLabel6.setText("Crear Nodo");

        jButton5.setText("Crear");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(txt_newnode, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton5)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_newnode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Nodo", jPanel2);

        javax.swing.GroupLayout jd_CreateNewRuteLayout = new javax.swing.GroupLayout(jd_CreateNewRute.getContentPane());
        jd_CreateNewRute.getContentPane().setLayout(jd_CreateNewRuteLayout);
        jd_CreateNewRuteLayout.setHorizontalGroup(
            jd_CreateNewRuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CreateNewRuteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jd_CreateNewRuteLayout.setVerticalGroup(
            jd_CreateNewRuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CreateNewRuteLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Empezar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jd_Graph.pack();
        jd_Graph.setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds());
        jd_Graph.show(true);


    }//GEN-LAST:event_jButton1MouseClicked

    private void jc_hereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_hereActionPerformed

    }//GEN-LAST:event_jc_hereActionPerformed

    private void jc_hereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_hereItemStateChanged
        SetDefault();
         graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");
    }//GEN-LAST:event_jc_hereItemStateChanged

    private void jc_thereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_thereItemStateChanged
        SetDefault();
         graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");
    }//GEN-LAST:event_jc_thereItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Dikstra(jc_here.getSelectedItem().toString(), jc_there.getSelectedItem().toString());
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (graph.getNode(jc_newhere.getSelectedItem().toString()) != null && graph.getNode(jc_newhere.getSelectedItem().toString()) != null) {
            Random ran = new Random();
            Node nodexTo = graph.getNode(jc_newhere.getSelectedItem().toString());
            Node nodexFrom = graph.getNode(jc_newthere.getSelectedItem().toString());
            String name = nodexTo.getId() + nodexFrom.getId();
            graph.addEdge(name, nodexTo, nodexFrom).addAttribute("length", ran.nextInt(15) + 1);
            LoadCombo();
            SetDefault();
        }


    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        graph.addNode(txt_newnode.getText());
        graph.getNode(txt_newnode.getText()).setAttribute("estate", false);
        LoadCombo();
        SetDefault();
        txt_newnode.setText("");

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jp_show.removeAll();
        starGraph();
        display();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_CreateNewRute.show();
        jd_CreateNewRute.pack();
        jd_CreateNewRute.setLocationRelativeTo(jd_Graph);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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

    public void starGraph() {
        graph = CreateGraph(ReadFile());
        LoadCombo();
        GenerateCrash();
        SetDefault();

        graph.addAttribute("ui.stylesheet", styleSheet);

        jp_show.repaint();

    }

    private void display() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout()) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(800, 650);
            }
        };
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = viewer.addDefaultView(false);
        panel.add(viewPanel);
        frame.add(panel);
        frame.pack();
        jp_show.add(viewPanel);

    }

    public File ReadFile() {
        JFileChooser fileChooseer = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivos", "txt", "csv", "docx");
        fileChooseer.addChoosableFileFilter(filter);
        int op = fileChooseer.showOpenDialog(this);
        String extension = fileChooseer.getSelectedFile().getPath();
        if (op == JFileChooser.APPROVE_OPTION) {
            return fileChooseer.getSelectedFile();
        }
        return null;
    }

    public void LoadCombo() {
        DefaultComboBoxModel modelHere = new DefaultComboBoxModel();
        DefaultComboBoxModel modelThere = new DefaultComboBoxModel();
        DefaultComboBoxModel modelNewThere = new DefaultComboBoxModel();
        DefaultComboBoxModel modelNewHere = new DefaultComboBoxModel();
        for (Node node : graph) {
            modelHere.addElement(node);
            modelThere.addElement(node);
            modelNewThere.addElement(node);
            modelNewHere.addElement(node);
        }
        jc_here.setModel(modelHere);
        jc_there.setModel(modelThere);
        jc_newhere.setModel(modelNewHere);
        jc_newthere.setModel(modelNewThere);
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

                        if (i == 2) {

                            if (!(graph.getEdge(data[2]) != null)) {
                                Random ran = new Random();
                                graph.addEdge(data[2], data[0], data[1]).addAttribute("length", ran.nextInt(15) + 1);
                                graph.getNode(data[0]).setAttribute("estate", false);
                                graph.getNode(data[1]).setAttribute("estate", false);
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
            sc.close();
        }//Fin del if 

        return graph;
    }

    public void GenerateCrash() {
        Random ranCrash = new Random();
        Random ranLucky = new Random();
        int lucky = ranLucky.nextInt(6) + 1;

        for (int i = 0; i < lucky; i++) {
            int crash = ranCrash.nextInt(graph.getEdgeCount() - 1);
            graph.getNode(crash).setAttribute("ui.class", "marked_closed");
            graph.getNode(crash).setAttribute("estate", true);

        }
    }

    public void Dikstra(String from, String to) {
        Graph graph1 = graph;
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, "result", "length");
        dijkstra.init(graph1);
        dijkstra.setSource(graph1.getNode(from));
        dijkstra.compute();
        SetDefault();
        ArrayList<Node> vertex = new ArrayList<Node>();
        int timeTotal = 0;
        for (Node node : dijkstra.getPathNodes(graph1.getNode(to))) {
            node.addAttribute("ui.class", "marked_visited");

            vertex.add(0, node);
        }

        for (int i = 0; i < vertex.size(); i++) {
            if (i != vertex.size() - 1) {
                timeTotal += (int) vertex.get(i).getEdgeBetween(vertex.get(i + 1)).getAttribute("length");
            }
        }
        lbl_time.setText(timeTotal + "");
        admHilo hilo1 = new admHilo(lbl_time, true, true, timeTotal, vertex);
        hilo1.start();
        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");

    }

    void SetDefault() {
         for (Node node : graph) {
            if (!((boolean) node.getAttribute("estate"))) {
                node.setAttribute("ui.class", "marked_defult");
            }
        }
         for (Edge edge : graph.getEachEdge()) {
            edge.addAttribute("ui.style", "fill-color: black;");
        }
        for (Node node : graph) {//Agrega las etiquetas
            node.addAttribute("ui.label", node.getId());
        }
        for (Edge edge : graph.getEachEdge()) {
            edge.addAttribute("ui.label", (Object) edge.getAttribute("length"));
        }

    }
    Graph graph;
    protected String styleSheet
            = "node {"
            + "	fill-color: blue;"
            + "text-size: 10px;"
            + "}"
            + "node.marked {"
            + "	fill-color: green;"
            + "shape: box;"
            + "text-size: 20px;"
            + "}"
            + "node.marked_defult {"
            + "	fill-color: blue;"
            + "text-size: 10px;"
            + "}"
            + "node.marked_visited{"
            + "	fill-color: yellow;"
            + "text-size: 10.5px;"
            + "}"
            + "node.marked_closed{"
            + "	fill-color: red;"
            + "text-size: 10px;"
            + "}"
            + "graph {\n"
            + " fill-color: gray;\n"
            + "  fill-mode: plain;"
            + "}";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jc_here;
    private javax.swing.JComboBox<String> jc_newhere;
    private javax.swing.JComboBox<String> jc_newthere;
    private javax.swing.JComboBox<String> jc_there;
    private javax.swing.JDialog jd_CreateNewRute;
    private javax.swing.JDialog jd_Graph;
    private javax.swing.JPanel jp_show;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField txt_newnode;
    // End of variables declaration//GEN-END:variables
}
