/* Titulo: Proyecto #3 Resolución de problemas aplicando teoría de Grafos.
 Proposito: Crear una aplicación útil para la resolución de problemas relaciohados con el transito
            dentro de una ciudad implementando la teoria de grafos.
 Clase: CCC209 – Q3 – 2018
 Author: Claudia Cortés*/
import java.awt.Color;
import java.awt.GridLayout;
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
import org.graphstream.ui.view.Viewer;
import org.graphstream.algorithm.Prim;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.graphstream.algorithm.BetweennessCentrality;

public class Menu extends javax.swing.JFrame {

    /* 
Descripción: Constructor de la Clase Menu, se encargara de inicializar el Frame
Params: N/A
Retorna: N/A
Errores: N/A*/
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        admNews threadStart = new admNews(lbl_showNewsStart, "hello", jp_newStart);
        threadStart.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Graph = new javax.swing.JDialog();
        jp_show = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jc_here = new javax.swing.JComboBox<>();
        jc_there = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_articulation = new javax.swing.JTextArea();
        jc_diagnostic = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        jp_showNews = new javax.swing.JPanel();
        lbl_showNews = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmi_Open = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmi_Create = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jd_CreateNewRute = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_newnode = new javax.swing.JTextField();
        btn_CreateVertex = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jc_newhere = new javax.swing.JComboBox<>();
        jc_newthere = new javax.swing.JComboBox<>();
        btn_CreateRute = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_Start = new javax.swing.JButton();
        jp_newStart = new javax.swing.JPanel();
        lbl_showNewsStart = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jd_Graph.setTitle("Rutas");
        jd_Graph.setBackground(new java.awt.Color(51, 51, 51));
        jd_Graph.setBounds(new java.awt.Rectangle(0, 0, 100000, 100000));
        jd_Graph.setFont(new java.awt.Font("AR BLANCA", 0, 14)); // NOI18N
        jd_Graph.setLocation(new java.awt.Point(0, 0));
        jd_Graph.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_show.setBackground(new java.awt.Color(255, 255, 255));
        jp_show.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jp_show.setPreferredSize(new java.awt.Dimension(800, 750));

        javax.swing.GroupLayout jp_showLayout = new javax.swing.GroupLayout(jp_show);
        jp_show.setLayout(jp_showLayout);
        jp_showLayout.setHorizontalGroup(
            jp_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jp_showLayout.setVerticalGroup(
            jp_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jd_Graph.getContentPane().add(jp_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 790, 640));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Locación");

        jc_here.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jc_here.setOpaque(false);
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

        jc_there.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jc_there.setOpaque(false);
        jc_there.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_thereItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Destino");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Tiempo estimado de viaje");

        lbl_time.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lbl_time.setText("N/A");

        btn_iniciar.setBackground(new java.awt.Color(255, 255, 255));
        btn_iniciar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_iniciar.setForeground(new java.awt.Color(0, 153, 153));
        btn_iniciar.setText("Start");
        btn_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarMouseClicked(evt);
            }
        });
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setText("Mins.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jc_there, 0, 246, Short.MAX_VALUE)
                            .addComponent(jc_here, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btn_iniciar)
                .addGap(0, 161, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_here, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_there, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_time)
                    .addComponent(jLabel8))
                .addGap(61, 61, 61)
                .addComponent(btn_iniciar)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Particular", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);

        txta_articulation.setColumns(20);
        txta_articulation.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txta_articulation.setRows(5);
        txta_articulation.setEnabled(false);
        jScrollPane1.setViewportView(txta_articulation);

        jc_diagnostic.setBackground(new java.awt.Color(0, 153, 0));
        jc_diagnostic.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jc_diagnostic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posibles calles que dejaran incomunicadas la ciudad", "Calles Cerradas el dia de hoy", "Mapa de Estaciones de Tren de la ciudad ", "Comparacion calles cerradas-calles que causan incomunicacion" }));
        jc_diagnostic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_diagnosticItemStateChanged(evt);
            }
        });
        jc_diagnostic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_diagnosticActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Detalles del Diagnostico");

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Opciones");

        lbl_description.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_diagnostic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel12))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbl_description, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(13, 13, 13)
                .addComponent(jc_diagnostic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("General", jPanel4);

        jd_Graph.getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, -1));

        jp_showNews.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp_showNews.setOpaque(false);
        jp_showNews.setPreferredSize(new java.awt.Dimension(162, 162));

        lbl_showNews.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lbl_showNews.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp_showNewsLayout = new javax.swing.GroupLayout(jp_showNews);
        jp_showNews.setLayout(jp_showNewsLayout);
        jp_showNewsLayout.setHorizontalGroup(
            jp_showNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_showNewsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_showNews, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jp_showNewsLayout.setVerticalGroup(
            jp_showNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_showNewsLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lbl_showNews, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jd_Graph.getContentPane().add(jp_showNews, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 370, 200));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Las calles cerradas el dia de hoy son: ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jd_Graph.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 370, 30));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/background1small.jpg"))); // NOI18N
        jLabel10.setFocusTraversalPolicyProvider(true);
        jLabel10.setOpaque(true);
        jd_Graph.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 390, 750));

        jLabel11.setText("jLabel11");
        jd_Graph.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        jmi_Open.setText("Archivo");
        jmi_Open.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jmi_Open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_OpenMouseClicked(evt);
            }
        });
        jmi_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_OpenActionPerformed(evt);
            }
        });

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jMenuItem1.setText("Abrir");
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmi_Open.add(jMenuItem1);

        jMenuBar1.add(jmi_Open);

        jmi_Create.setText("Crear");
        jmi_Create.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jMenuItem2.setText("Crear Ruta");
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmi_Create.add(jMenuItem2);

        jMenuBar1.add(jmi_Create);

        jd_Graph.setJMenuBar(jMenuBar1);

        jd_CreateNewRute.setBackground(new java.awt.Color(255, 255, 255));
        jd_CreateNewRute.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPane1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Nombre ");

        txt_newnode.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        btn_CreateVertex.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn_CreateVertex.setForeground(new java.awt.Color(0, 153, 153));
        btn_CreateVertex.setText("Crear");
        btn_CreateVertex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CreateVertexMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Crear un vertice.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_CreateVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_newnode, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel14)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_newnode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btn_CreateVertex)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nodo", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Desde");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("Hasta");

        jc_newhere.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jc_newthere.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        btn_CreateRute.setBackground(new java.awt.Color(255, 255, 255));
        btn_CreateRute.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn_CreateRute.setForeground(new java.awt.Color(0, 153, 153));
        btn_CreateRute.setText("crear");
        btn_CreateRute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CreateRuteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CreateRuteMouseEntered(evt);
            }
        });
        btn_CreateRute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateRuteActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Crear una arista.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jc_newhere, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_newthere, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btn_CreateRute, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel15)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_newhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jc_newthere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btn_CreateRute)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Arista", jPanel1);

        jd_CreateNewRute.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 370, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/background1small.jpg"))); // NOI18N
        jLabel13.setOpaque(true);
        jd_CreateNewRute.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 320));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto#3_ClaudiaCortes");
        setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Start.setBackground(new java.awt.Color(255, 255, 255));
        btn_Start.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_Start.setForeground(new java.awt.Color(0, 153, 153));
        btn_Start.setText("Empezar");
        btn_Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_StartMouseClicked(evt);
            }
        });
        btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 153, -1));

        jp_newStart.setBackground(new java.awt.Color(0, 204, 204));
        jp_newStart.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        lbl_showNewsStart.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        javax.swing.GroupLayout jp_newStartLayout = new javax.swing.GroupLayout(jp_newStart);
        jp_newStart.setLayout(jp_newStartLayout);
        jp_newStartLayout.setHorizontalGroup(
            jp_newStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_newStartLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lbl_showNewsStart)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jp_newStartLayout.setVerticalGroup(
            jp_newStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_newStartLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lbl_showNewsStart)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        getContentPane().add(jp_newStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 410));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 640, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /* 
Descripción: Evento click que desplegara el JDialog que contiene el grafo 
Params: N/A
Retorna: N/A
Errores: N/A*/
    private void btn_StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_StartMouseClicked
        jd_Graph.pack();
        this.jd_Graph.setLocationRelativeTo(this);
        jd_Graph.show(true);
    }//GEN-LAST:event_btn_StartMouseClicked

    private void jc_hereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_hereActionPerformed

    }//GEN-LAST:event_jc_hereActionPerformed
    /* 
Descripción: Evento state change que cambiara de color el vertice de partida y el vertice de origen dentro del grafo
Params: N/A
Retorna:N/A
Errores: N/A*/
    private void jc_hereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_hereItemStateChanged
        SetDefault();
        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");
    }//GEN-LAST:event_jc_hereItemStateChanged

    /* 
Descripción: Evento state change que cambiara de color el vertice de partida y el vertice de origen dentro del grafo
Params: N/A
Retorna:N/A
Errores: N/A*/
    private void jc_thereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_thereItemStateChanged
        SetDefault();
        graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");
    }//GEN-LAST:event_jc_thereItemStateChanged

    private void btn_CreateRuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateRuteActionPerformed

    }//GEN-LAST:event_btn_CreateRuteActionPerformed
    /* 
Descripción: Crea una nueva ruta para los vertices del grafo 
Params: N/A
Retorna: N/A
Errores: N/A*/
    private void btn_CreateRuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreateRuteMouseClicked
        if (graph.getNode(jc_newhere.getSelectedItem().toString()) != null && graph.getNode(jc_newhere.getSelectedItem().toString()) != null) {
            Random ran = new Random();

            Node nodexTo = graph.getNode(jc_newhere.getSelectedItem().toString());
            Node nodexFrom = graph.getNode(jc_newthere.getSelectedItem().toString());
            String name = nodexTo.getId() + nodexFrom.getId();
            String name2 = nodexFrom.getId() + nodexTo.getId();
            if (graph.getEdge(name) == null && graph.getEdge(name2) == null && nodexTo != nodexFrom) {
                graph.addEdge(name, nodexTo, nodexFrom).addAttribute("length", ran.nextInt(15) + 1);
                LoadCombo();
                SetDefault();
                JOptionPane.showMessageDialog(null, "Ruta Creada Exitosamente", "Ruta Creada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La ruta deseada ya existe, o hace referencia a si misma", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_CreateRuteMouseClicked
    /* 
Descripción: Crea un nuevo vertice y lo agrega al grafo 
Params: N/A
Retorna:N/A
Errores: N/A*/
    private void btn_CreateVertexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreateVertexMouseClicked
        if (graph.getNode(txt_newnode.getText()) == null) {
            graph.addNode(txt_newnode.getText());
            graph.getNode(txt_newnode.getText()).setAttribute("estate", false);
            LoadCombo();
            SetDefault();
            txt_newnode.setText("");
            JOptionPane.showMessageDialog(null, "Calle creada exitosamente", "Calle Creada", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "La calle  deseada ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            SetDefault();
            txt_newnode.setText("");
        }

    }//GEN-LAST:event_btn_CreateVertexMouseClicked

    private void btn_CreateRuteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreateRuteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CreateRuteMouseEntered
    /* 
Descripción: Evento click que ejecuta el metodo que abre y carga el archivo al sistema
Params: N/A
Retorna:N/A
Errores: N/A*/
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jp_show.removeAll();
        starGraph();
        display();
        btn_iniciar.show();
        ArrayList<Node> closed = CrashGenerated(false);
        String closed01 = "";
        for (int i = 0; i < closed.size(); i++) {
            closed01 += closed.get(i).getId() + "<br>";
        }

        try {
            if (theradNews.isAlive() != true) {
                String Datos = "<html><body><center>" + closed01 + "<br></center></body></html>";
                theradNews.SetMessage(Datos);
            }

        } catch (Exception e) {
            String Datos = "<html><body><center>" + closed01 + "<br></center></body></html>";
            theradNews = new admNews(lbl_showNews, Datos, jp_showNews);
            theradNews.start();

        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /* 
Descripción: Evento click que ocultara el boton de incializar el recorrido
Params: N/A
Retorna: N/A
Errores: N/A*/
    private void btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartActionPerformed
        btn_iniciar.show(false);
    }//GEN-LAST:event_btn_StartActionPerformed
    /* 
Descripción: Evento que desplagara una nueva ventana para crear nuevas rutas y vertices
Params: N/A
Retorna:N/A
Errores: N/A*/
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_CreateNewRute.show();
        jd_CreateNewRute.pack();
        jd_CreateNewRute.setLocationRelativeTo(jd_Graph);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jc_diagnosticItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_diagnosticItemStateChanged

    }//GEN-LAST:event_jc_diagnosticItemStateChanged
    /* 
Descripción: Actualizara el textarea informativo segun la opcion que seleccione el usuario
Params: N/A
Retorna:N/A
Errores: N/A*/
    private void jc_diagnosticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_diagnosticActionPerformed
        if (jc_diagnostic.getSelectedIndex() == 0) {
            ArrayList<Node> articulation = Articulation(true);
            SetDefault();
            for (Node node : articulation) {
                node.setAttribute("ui.class", "marked_articulation");
            }
            lbl_description.setText("Puntos de articulación de la ciudad: ");
        } else if (jc_diagnostic.getSelectedIndex() == 1) {
            CrashGenerated(true);
            SetDefault();
            lbl_description.setText("Calles cerradas de la ciudad: ");
        } else if (jc_diagnostic.getSelectedIndex() == 3) {
            lbl_description.setText("Puntos de articulación cerados el dia de hoy: ");
            ArrayList<Node> articulation = Articulation(false);
            SetDefault();
            for (Node node : articulation) {
                node.setAttribute("ui.class", "marked_articulation");
            }
            Comparative(Articulation(false), CrashGenerated(false));

        } else {
            lbl_description.setText("Estaciones de tren de la ciudad: ");
            txta_articulation.setText("Estaciones de tren más cortas\n que conectan toda la ciudad");
            SetDefault();
            Prim();
            try {
                DFS();
            } catch (InterruptedException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jc_diagnosticActionPerformed

    private void jmi_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_OpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_OpenActionPerformed

    private void jmi_OpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_OpenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_OpenMouseClicked

    /* 
Descripción: Evento click que ejecutara el llamado al metodo que genera las rutas optimas para el recorrido
Params: N/A
Retorna: N/A
Errores: N/A*/
    private void btn_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarMouseClicked
        Dikstra(jc_here.getSelectedItem().toString(), jc_there.getSelectedItem().toString());
    }//GEN-LAST:event_btn_iniciarMouseClicked

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_iniciarActionPerformed

    /* 
Descripción: Main del programa 
Params: N/A
Retorna:N/A
Errores: N/A*/
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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

    /* 
Descripción: Inicializara el grafico y lo cargara al sistema
Params: N/A
Retorna:N/A
Errores: N/A*/
    public void starGraph() {
        graph = CreateGraph(ReadFile());
        LoadCombo();
        GenerateCrash();
        SetDefault();
        graph.addAttribute("ui.stylesheet", styleSheet);
        jp_show.repaint();

    }

    /* 
Descripción: Cargara el grafo generado a un panel en el Jdialog principal.
Params: N/A
Retorna:N/A
Errores: N/A*/
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

    /* 
Descripción: Creara un archivo del se leeran los datos del grafo
Params: N/A
Retorna: File file, sera el archivo que contiene los datos dle grafo
Errores: N/A*/
    public File ReadFile() {
        JFileChooser fileChooseer = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Archivos", "txt", "csv", "docx");
        fileChooseer.addChoosableFileFilter(filter);
        int op = fileChooseer.showOpenDialog(this.jd_Graph);
        String extension = fileChooseer.getSelectedFile().getPath();
        if (op == JFileChooser.APPROVE_OPTION) {
            return fileChooseer.getSelectedFile();
        }
        return null;
    }

    /* 
Descripción: Cargara los combobox con los datos actuales del grafo.
Params: N/A
Retorna:N/A
Errores: N/A*/
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

    /* 
Descripción: Se encragara de crear el grafo con el cual el sistema realizara las operaciones
Params: File toCreate, es el archivo del cual leeremos los datos del grafo 
Retorna: Graph graph, sera el grafo creado con los datos del archivo
Errores:N/A */
    public Graph CreateGraph(File toCreate) {
        Graph graph = new SingleGraph("Principal Graph");
        graph.setNullAttributesAreErrors(true);//para evitar elementos en nulo 
        graph.setStrict(false);
        graph.setAutoCreate(true);
        BetweennessCentrality bcb = new BetweennessCentrality();
        bcb.setWeightAttributeName("weight");

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
                                int weigth = ran.nextInt(15) + 1;
                                graph.addEdge(data[2], data[0], data[1]).addAttribute("length", weigth);
                                graph.getNode(data[0]).setAttribute("estate", false);
                                graph.getNode(data[1]).setAttribute("estate", false);
                                Node nodea = graph.getNode(data[0]);
                                Node nodeb = graph.getNode(data[1]);
                                bcb.setWeight(nodea, nodeb, weigth);
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
            sc.close();
        }//Fin del if 
        bcb.init(graph);
        bcb.compute();

        return graph;
    }

    /* 
Descripción: Genera aleatoriamente una lista de vertices que estaran cerrados en el grafo 
Params: N/A
Retorna: N/A
Errores: N/A*/
    public void GenerateCrash() {
        int totNodes = 0;
        for (Node node : graph) {
            totNodes++;
        }
        Random ranCrash = new Random();
        Random ranLucky = new Random();
        int lucky = ranLucky.nextInt(totNodes) + 1;
        for (int i = 0; i < lucky && i < totNodes; i++) {
            int crash = ranCrash.nextInt(totNodes);
            graph.getNode(crash).setAttribute("ui.class", "marked_closed");
            graph.getNode(crash).setAttribute("estate", true);
        }

    }

    /* 
Descripción: Retorna la lista con los vertices cerrados dentro del grafo, 
    puede actualizar o no la textArea donde se mostraran cual vertices estan cerrados el dia de hoy 
Params: boolean showText, dtermina si se desea o no actualizar los datos en el textarea informativo
Retorna: ArrayList<Node> CrashGenerated, con los vertices cerrados del nodo
Errores: N/A*/
    ArrayList<Node> CrashGenerated(boolean showText) {
        ArrayList<Node> closed = new ArrayList();
        String isClosed = "";
        for (int i = 0; i < graph.getNodeCount(); i++) {

            if ((boolean) graph.getNode(i).getAttribute("estate")) {
                isClosed += "\n" + graph.getNode(i).getId();
                closed.add(graph.getNode(i));
            }
        }
        if (showText) {
            txta_articulation.setText(isClosed);
        }
        return closed;
    }

    /* 
Descripción: Ejecutara la instanciación de los objetos que se encragaran de recorrer el grafo segun la ruta mas corta 
Params: String from, el nombre del vertice actual.
    String to, el nombre del vertice destino.
Retorna:N/A
Errores: N*A*/
    public void Dikstra(String from, String to) {
        SetDefault();
        ArrayList<Node> closed = CrashGenerated(false);
        ArrayList<Node> alternativeRute = new ArrayList();
        admHilo threadGraph = new admHilo(lbl_time, jc_here, jc_there, btn_iniciar, graph);
        threadGraph.Dikstra(from, to);
        if (closed.contains(graph.getNode(from))) {
            JOptionPane.showMessageDialog(null, "La posicion de partida se encuentra cerrada, no se puede calcular la ruta ", "Punto sin salida.", JOptionPane.ERROR_MESSAGE);
            SetDefault();
        } else {
            boolean useAlternativeRute = false;
            Node nodeFrom = graph.getNode(from);
            Node nodeTo = graph.getNode(to);
            ArrayList<Node> tempVertex = threadGraph.getVertex();
            for (Node node : tempVertex) {
                if (closed.contains(node) && node != nodeFrom && node != nodeTo) {
                    JOptionPane.showMessageDialog(null, "Lo sentimos, la ruta mas corta tiene una o mas calles cerradas, trataremos de calcular una ruta alterna", "Calle cerrada en el camino", JOptionPane.ERROR_MESSAGE);
                    useAlternativeRute = true;
                    break;
                }
            }

            if (!useAlternativeRute) {
                if (closed.contains(nodeTo)) {
                    JOptionPane.showMessageDialog(null, "Tu destino se encuentra bloqueado, pero el camino esta libre, puedes caminar hasta el final de esa ruta", "Malas noticias", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                ArrayList<Node> tempVertexcopy = CopyGraph();
                if (tempVertexcopy.size() > 0) {
                    for (Node node : tempVertexcopy) {
                        alternativeRute.add(graph.getNode(node.getId()));
                        threadGraph.setVertex(alternativeRute);
                    }
                } else {
                    threadGraph.setVertex(alternativeRute);
                }
            }
            threadGraph.start();
            graph.getNode(jc_here.getSelectedItem().toString()).setAttribute("ui.class", "marked");
            graph.getNode(jc_there.getSelectedItem().toString()).setAttribute("ui.class", "marked");
        }

    }

    /* 
Descripción: Ejecuta una busqueda en profundidad dentro del grafo
Params: N/A
Retorna: N/A
Errores: N/A*/
    public void DFS() throws InterruptedException {
        int level = 0;
        DepthFirstIterator it = new DepthFirstIterator(graph.getNode(jc_here.getSelectedItem().toString()));
        graph.getNode(0).setAttribute("level", level);
        while (it.hasNext()) {
            Node n = it.next();
            level += 1;
            n.setAttribute("level", level);
            n.addAttribute("ui.label", n.getId());
        }
    }

    /* 
Descripción: Determina la ruta más corta dque conecta a todos los vertices del grafo
Params: N/A
Retorna: N/A
Errores: N/A*/
    public void Prim() {

        Prim prim = new Prim("ui.class", "intree", "notintree");
        prim.init(graph);
        prim.compute();
    }

    /* 
Descripción: Devuelve todos los vertices y aristas del grafo a su estado original
Params: N/A
Retorna: N/A
Errores: N/A*/
    public void SetDefault() {
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
Descripción: Determina cuales son los puntos que pueden dejar incomunicadas a ciertas zonas de la ciudad, 
               puede además mostrar o no en un textarea informativa cuales son estos puntos 
Params: boolean showText, determina si se quiere o no actualizar los datos del textarea
Retorna: ArrayList<Node> articulations, que contiene los nodos que pueden dejar incomunicada a la ciudad 
Errores: N/A*/
    ArrayList<Node> Articulation(boolean showText) {
        ArrayList<Node> articulations = new ArrayList();
        String dangerIfIsClosed = "";
        for (int i = 0; i < graph.getNodeCount(); i++) {
            if ((Double) graph.getNode(i).getAttribute("Cb") > 2.0) {
                dangerIfIsClosed += "\n" + graph.getNode(i).getId();
                articulations.add(graph.getNode(i));
            }
        }
        if (showText) {
            txta_articulation.setText(dangerIfIsClosed);
        }
        return articulations;
    }

    /* 
Descripción: Comparara a los puntos de articulacion y los puntos cerrados e 
        informara si hoy hay partes de la ciudad que son inaccesibles.
Params: ArrayList<Node> articulations, contiene los puntos de articulacion del grafo
        ArrayList<Node> closed, contiene los puntos cerrados del grafo 
Retorna: N/A
Errores: N/A*/
    public void Comparative(ArrayList<Node> articulations, ArrayList<Node> closed) {
        String noAcces = "";
        for (Node node : closed) {
            if (articulations.contains(node)) {
                noAcces += "\n" + node.getId();
            }
        }
        if (noAcces.length() > 0) {
            noAcces = "\n\n NO HAY ACCESO A CIERTAS\n PARTES DE LA CIUDAD HOY" + noAcces;
            txta_articulation.setText(noAcces);
        } else {
            noAcces += "\n\n Ninguna calle que deje incomunicada\n la ciudad se encuentra cerrada hoy";
            txta_articulation.setText(noAcces);
        }
    }

    /* 
Descripción: se encragara de copiar el grafo y generara una ruta alterna desde un punto A hasta un punto B sin tomar en cuenta los caminos cerrados
Params: N/A
Retorna: ArrayList<Node> threadCopy.getVertex(),que contiene los nodos en la ruta más corta sin los caminos cerrados
Errores: N/A*/
    public ArrayList<Node> CopyGraph() {
        Graph tempGraph = new SingleGraph("Temporal Graph");
        tempGraph.addAttribute("ui.stylesheet", styleSheet);
        for (Node node : graph) {
            if (!(boolean) node.getAttribute("estate")) {

                tempGraph.addNode(node.getId());
                tempGraph.getNode(node.getId()).addAttribute("ui.label", node.getId());
                tempGraph.getNode(node.getId()).addAttribute("estate", (Object) node.getAttribute("estate"));
            }
        }
        for (Edge edge : graph.getEachEdge()) {
            Node nodeLeft = edge.getNode0();
            Node nodeRight = edge.getNode1();
            if (tempGraph.getNode(nodeLeft.getId()) != null && tempGraph.getNode(nodeRight.getId()) != null) {
                tempGraph.addEdge(edge.getId(), nodeLeft.getId(), nodeRight.getId());
                tempGraph.getEdge(edge.getId()).addAttribute("ui.label", (Object) edge.getAttribute("length"));
                tempGraph.getEdge(edge.getId()).addAttribute("length", (Object) edge.getAttribute("length"));
            }
        }
        admHilo threadCopy = new admHilo(lbl_time, jc_here, jc_there, btn_iniciar, tempGraph);
        try {
            threadCopy.Dikstra(jc_here.getSelectedItem().toString(), jc_there.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La ruta pasa por uno o mas puntos  bloqueados", "Ruta alterna invalida", JOptionPane.ERROR_MESSAGE);
            SetDefault();
        }
        return threadCopy.getVertex();
    }
    private Graph graph;
    admNews theradNews;
    protected String styleSheet
            /*Graph*/
            = "graph {\n"
            + " fill-color: white;\n"
            + "fill-mode: plain;"
            + "}"
            /*Nodes*/
            + "node {"
            + "	fill-color: blue;"
            + "text-size: 15px;"
            + "}"
            + "node.marked {"
            + "	fill-color: green;"
            + "text-color: green;"
            + "shape: box;"
            + "text-size: 20px;"
            + "}"
            + "node.marked_defult {"
            + "fill-color: blue;"
            + "text-color: black;"
            + "text-size: 15px;"
            + "}"
            + "node.marked_visited{"
            + "	fill-color: yellow;"
            + "text-size: 10.5px;"
            + "}"
            + "node.marked_closed{"
            + "fill-color: red;"
            + "text-color: black;"
            + "text-size: 15px;"
            + "}"
            + "node.marked_articulation{"
            + "	fill-color: orange;"
            + "text-size: 15px;"
            + "}"
            + "node.hide {"
            + "	fill-color: gray;"
            + "text-size: 0px;"
            + "}"
            /*Edges*/
            + "edge.highlight {  "
            + "fill-color: rgb(200,39,65);\n"
            + "text-color: black;"
            + "text-size: 15px;"
            + "size: 3px;"
            + "}"
            + "edge.highlight_black {  "
            + " fill-color: black;\n"
            + "text-color: black;"
            + "text-size: 15px;"
            + "   size: 3px;"
            + "}"
            + "edge.highlight_original {  "
            + "   fill-color: green;\n"
            + "text-color: black;"
            + "text-size: 15px;"
            + "   size: 3px;"
            + "}"
            + "edge.highlight_alternative {  "
            + "fill-color: yellow;\n"
            + "text-color: black;"
            + "text-size: 15px;"
            + "   size: 3px;"
            + "}"
            + "edge .notintree {"
            + "size:1px;fill-color:black;"
            + "} "
            + "edge .intree {"
            + "size:3px;"
            + "fill-color:orange;"
            + "}"
            + "edge.hide {"
            + "	fill-color: gray;"
            + "text-size: 0px;"
            + "}";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateRute;
    private javax.swing.JButton btn_CreateVertex;
    private javax.swing.JButton btn_Start;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JComboBox<String> jc_diagnostic;
    private javax.swing.JComboBox<String> jc_here;
    private javax.swing.JComboBox<String> jc_newhere;
    private javax.swing.JComboBox<String> jc_newthere;
    private javax.swing.JComboBox<String> jc_there;
    private javax.swing.JDialog jd_CreateNewRute;
    private javax.swing.JDialog jd_Graph;
    private javax.swing.JMenu jmi_Create;
    private javax.swing.JMenu jmi_Open;
    private javax.swing.JPanel jp_newStart;
    private javax.swing.JPanel jp_show;
    private javax.swing.JPanel jp_showNews;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_showNews;
    private javax.swing.JLabel lbl_showNewsStart;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField txt_newnode;
    private javax.swing.JTextArea txta_articulation;
    // End of variables declaration//GEN-END:variables
}
