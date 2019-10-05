package Falcon.Graph;
/**
 *
 * @author Falcon -> Pubudu,Achintha,Nethmi,Rajitha,Mano(Team Falcon)
 */
import Falcon.Calculator.Calculator;
import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;

public class G_UI extends JFrame
{
    //Initializes Gui_Graph
    public G_UI()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e)
        {}
        initComponents();
        setType(true);        
        setCenterScreen();
    }    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        GraphPanel = new javax.swing.JPanel();
        graph_screen = new javax.swing.JPanel();
        cColor = new javax.swing.JLabel();
        fColor = new javax.swing.JLabel();
        gColor = new javax.swing.JLabel();
        aColor = new javax.swing.JLabel();
        bColor = new javax.swing.JLabel();
        dColor = new javax.swing.JLabel();
        eColor = new javax.swing.JLabel();
        drawAxis = new javax.swing.JRadioButton();
        drawGrid = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        ControlPanel = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        divider1 = new javax.swing.JSeparator();
        clear = new javax.swing.JButton();
        graph = new javax.swing.JButton();
        XminPanel = new javax.swing.JPanel();
        Xmin = new javax.swing.JTextField();
        XmaxPanel = new javax.swing.JPanel();
        Xmax = new javax.swing.JTextField();
        YminPanel = new javax.swing.JPanel();
        Ymin = new javax.swing.JTextField();
        YmaxPanel = new javax.swing.JPanel();
        Ymax = new javax.swing.JTextField();
        Equation = new javax.swing.JComboBox();
        divider3 = new javax.swing.JSeparator();
        drawFuncCheckBox = new javax.swing.JCheckBox();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graph Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        setName("GraphCalc"); // NOI18N
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        GraphPanel.setBackground(new java.awt.Color(255, 153, 0));
        GraphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Graph"));
        GraphPanel.setPreferredSize(new java.awt.Dimension(356, 356));

        graph_screen.setBackground(new java.awt.Color(255, 255, 255));
        graph_screen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        graph_screen.setToolTipText("");
        graph_screen.setPreferredSize(new java.awt.Dimension(392, 392));
        graph_screen.setRequestFocusEnabled(false);
        graph_screen.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                graph_screenMouseWheelMoved(evt);
            }
        });
        graph_screen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                graph_screenMouseReleased(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                graph_screenMousePressed(evt);
            }
        });
        graph_screen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                graph_screenMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                graph_screenMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout graph_screenLayout = new javax.swing.GroupLayout(graph_screen);
        graph_screen.setLayout(graph_screenLayout);
        graph_screenLayout.setHorizontalGroup(
            graph_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        graph_screenLayout.setVerticalGroup(
            graph_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        cColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cColor.setText("j(x):");

        fColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fColor.setText("f(x):");

        gColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gColor.setText("g(x):");

        aColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        aColor.setText("h(x):");

        bColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bColor.setText("i(x):");

        dColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dColor.setText("k(x):");

        eColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        eColor.setText("l(x):");

        drawAxis.setBackground(new java.awt.Color(255, 153, 0));
        drawAxis.setSelected(true);
        drawAxis.setText("Draw Axes");
        drawAxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawAxisActionPerformed(evt);
            }
        });

        drawGrid.setBackground(new java.awt.Color(255, 153, 0));
        drawGrid.setSelected(true);
        drawGrid.setText("Draw Grid");
        drawGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawGridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GraphPanelLayout = new javax.swing.GroupLayout(GraphPanel);
        GraphPanel.setLayout(GraphPanelLayout);
        GraphPanelLayout.setHorizontalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraphPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawGrid)
                    .addComponent(drawAxis)
                    .addComponent(fColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graph_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        GraphPanelLayout.setVerticalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraphPanelLayout.createSequentialGroup()
                .addGroup(GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GraphPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(drawAxis)
                        .addGap(8, 8, 8)
                        .addComponent(drawGrid)
                        .addGap(18, 18, 18)
                        .addComponent(fColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(graph_screen, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        ControlPanel.setBackground(new java.awt.Color(255, 153, 0));
        ControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Control Panel"));
        ControlPanel.setPreferredSize(new java.awt.Dimension(300, 300));

        display.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        display.setToolTipText("");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        display.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                displayKeyReleased(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.setToolTipText("Clear");
        clear.setPreferredSize(new java.awt.Dimension(42, 10));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        graph.setBackground(new java.awt.Color(255, 255, 255));
        graph.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        graph.setText("GRAPH");
        graph.setToolTipText("Plot the function");
        graph.setPreferredSize(new java.awt.Dimension(42, 10));
        graph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphActionPerformed(evt);
            }
        });

        XminPanel.setBackground(new java.awt.Color(255, 153, 0));
        XminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Xmin"));
        XminPanel.setToolTipText("Graph bounds");

        Xmin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Xmin.setText("-10");
        Xmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                XminKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout XminPanelLayout = new javax.swing.GroupLayout(XminPanel);
        XminPanel.setLayout(XminPanelLayout);
        XminPanelLayout.setHorizontalGroup(
            XminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Xmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        XminPanelLayout.setVerticalGroup(
            XminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XminPanelLayout.createSequentialGroup()
                .addComponent(Xmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        XmaxPanel.setBackground(new java.awt.Color(255, 153, 0));
        XmaxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Xmax"));
        XmaxPanel.setToolTipText("Graph bounds");

        Xmax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Xmax.setText("10");
        Xmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                XmaxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout XmaxPanelLayout = new javax.swing.GroupLayout(XmaxPanel);
        XmaxPanel.setLayout(XmaxPanelLayout);
        XmaxPanelLayout.setHorizontalGroup(
            XmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XmaxPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Xmax, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        XmaxPanelLayout.setVerticalGroup(
            XmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XmaxPanelLayout.createSequentialGroup()
                .addComponent(Xmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        YminPanel.setBackground(new java.awt.Color(255, 153, 0));
        YminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ymin"));
        YminPanel.setToolTipText("Graph bounds");

        Ymin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Ymin.setText("-10");
        Ymin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                YminKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout YminPanelLayout = new javax.swing.GroupLayout(YminPanel);
        YminPanel.setLayout(YminPanelLayout);
        YminPanelLayout.setHorizontalGroup(
            YminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ymin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        YminPanelLayout.setVerticalGroup(
            YminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YminPanelLayout.createSequentialGroup()
                .addComponent(Ymin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        YmaxPanel.setBackground(new java.awt.Color(255, 153, 0));
        YmaxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ymax"));
        YmaxPanel.setToolTipText("Graph bounds");

        Ymax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Ymax.setText("10");
        Ymax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                YmaxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout YmaxPanelLayout = new javax.swing.GroupLayout(YmaxPanel);
        YmaxPanel.setLayout(YmaxPanelLayout);
        YmaxPanelLayout.setHorizontalGroup(
            YmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YmaxPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ymax, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        YmaxPanelLayout.setVerticalGroup(
            YmaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YmaxPanelLayout.createSequentialGroup()
                .addComponent(Ymax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Equation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "f(x)", "g(x)", "h(x)", "i(x)", "j(x)", "k(x)", "l(x)" }));
        Equation.setToolTipText("Choose a function");
        Equation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquationActionPerformed(evt);
            }
        });

        drawFuncCheckBox.setSelected(true);
        drawFuncCheckBox.setToolTipText("Draw this function");
        drawFuncCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawFuncCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divider1)
                    .addComponent(divider3)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(drawFuncCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(display)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(XminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(XmaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(YminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YmaxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(divider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drawFuncCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divider1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(XminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XmaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YmaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Equation.getAccessibleContext().setAccessibleDescription("");
        drawFuncCheckBox.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    //Opening actions
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setSize(1000, 500);
        this.setTitle("Graph Calculator");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowOpened

    //Show coordinates with mouse movement
    private void graph_screenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMouseMoved
        drawCoordinates(evt);
    }//GEN-LAST:event_graph_screenMouseMoved

    //Zoom in/out with mouse wheel
    private void graph_screenMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_graph_screenMouseWheelMoved
        zoom(evt);
    }//GEN-LAST:event_graph_screenMouseWheelMoved

    //Draw Axis/Grid buttons
    private void drawAxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawAxisActionPerformed
        Axis = !Axis;
        isZooming=true;
        plot();
        isZooming=false;
}//GEN-LAST:event_drawAxisActionPerformed

    private void drawGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawGridActionPerformed
        Grid = !Grid;
        isZooming=true;
        plot();
        isZooming=false;
}//GEN-LAST:event_drawGridActionPerformed

    //Redraw if mouse exits the graph
    //Let user drag the graph around
    private void graph_screenMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMouseDragged
        translateGraph(evt);
    }//GEN-LAST:event_graph_screenMouseDragged

    private void graph_screenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMousePressed
        isTranslating=true;
        x1=evt.getX();
        y1=evt.getY();
        xminimumClicked=Double.parseDouble(Xmin.getText());
        xmaximumClicked=Double.parseDouble(Xmax.getText());
        yminimumClicked=Double.parseDouble(Ymin.getText());
        ymaximumClicked=Double.parseDouble(Ymax.getText());
    }//GEN-LAST:event_graph_screenMousePressed

    private void graph_screenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph_screenMouseReleased
        isTranslating=false;
    }//GEN-LAST:event_graph_screenMouseReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
 
    }//GEN-LAST:event_formWindowLostFocus

    private void drawFuncCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawFuncCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drawFuncCheckBoxActionPerformed

    //change equation
    private void EquationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquationActionPerformed
        display.setText(getSelectedExpression());
    }//GEN-LAST:event_EquationActionPerformed

    private void YmaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YmaxKeyReleased
        if(checkNumber(Ymax.getText())&&checkWindowBounds())
        {
            Ymax.setBackground(Color.white);
            if(Ymax.getText().charAt(Ymax.getText().length()-1)!='.')
            Ymax.setText(expression.solve(Ymax.getText(),0.0));
            plot();
        }else{
            Ymax.setBackground(Color.red);
        }
    }//GEN-LAST:event_YmaxKeyReleased

    private void YminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YminKeyReleased
        if(checkNumber(Ymin.getText())&&checkWindowBounds())
        {
            Ymin.setBackground(Color.white);
            if(Ymin.getText().charAt(Ymin.getText().length()-1)!='.')
            Ymin.setText(expression.solve(Ymin.getText(),0.0));
            plot();
        }else{
            Ymin.setBackground(Color.red);
        }
    }//GEN-LAST:event_YminKeyReleased

    private void XmaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_XmaxKeyReleased
        if(checkNumber(Xmax.getText())&&checkWindowBounds())
        {
            Xmax.setBackground(Color.white);
            if(Xmax.getText().charAt(Xmax.getText().length()-1)!='.')
            Xmax.setText(expression.solve(Xmax.getText(),0.0));
            plot();
        }else{
            Xmax.setBackground(Color.red);
        }
    }//GEN-LAST:event_XmaxKeyReleased

    //Graph Bounds assertions
    private void XminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_XminKeyReleased
        if(checkNumber(Xmin.getText())&&checkWindowBounds())
        {
            Xmin.setBackground(Color.white);
            if(Xmin.getText().charAt(Xmin.getText().length()-1)!='.')
            Xmin.setText(expression.solve(Xmin.getText(),0.0));
            plot();
        }else{
            Xmin.setBackground(Color.red);
        }
    }//GEN-LAST:event_XminKeyReleased

    //Graph Button
    private void graphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphActionPerformed
        if(display.getText().length()==0){
            clear();
            plot();
        }
        else{
            plot();
        }
    }//GEN-LAST:event_graphActionPerformed

    //Clear Button
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
        plot();
    }//GEN-LAST:event_clearActionPerformed

    private void displayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_displayKeyReleased
        checkExpression();
        saveExpression();
    }//GEN-LAST:event_displayKeyReleased

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    //Morph into non-graphing/vice-versa
    private void setType(boolean graphing) {
        if(!graphing) {
            GraphPanel.setVisible(false);
            ControlPanel.setVisible(false);
            setSize(415,465);
        }else{
            GraphPanel.setVisible(true);
            ControlPanel.setVisible(true);
            setSize(1250,500);            
        }
        setCenterScreen();
    }
    //Center on the screen
    private void setCenterScreen(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int locX = dim.width/2 - this.getWidth()/2;
        int locY = dim.height/2 - this.getHeight()/2;
        this.setLocation(locX,locY);
    }
    private void setZoomType(double magnitude, char zoomType)
    {
        //zoomType
        //+ = zoom in
        //- is zoom out
        //s is standard
        //t is trigonometric
        //# is statistic
        xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());
  
        switch(zoomType)
        {
            case '+':
                xMinimum/=magnitude;
                xMaximum/=magnitude;
                yMinimum/=magnitude;
                yMaximum/=magnitude;
                break;
            case '-':
                xMinimum*=magnitude;
                xMaximum*=magnitude;
                yMinimum*=magnitude;
                yMaximum*=magnitude;
                break;
            case 's':
                xMinimum=-10;
                xMaximum=10;
                yMinimum=-10;
                yMaximum=10;
                break;
            case 't':
                xMinimum=Math.PI*-2;
                xMaximum=Math.PI*2;
                yMinimum=-2;
                yMaximum=2;
                break;
            case '#':
                xMinimum=0;
                xMaximum=10;
                yMinimum=0;
                yMaximum=10;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error occured while attempting to zoom");
        }
        
        //write to bounds text fields
        DecimalFormat DForm = new DecimalFormat("#.##");
        xMinimum=Double.valueOf(DForm.format(xMinimum));
        xMaximum=Double.valueOf(DForm.format(xMaximum));
        yMinimum=Double.valueOf(DForm.format(yMinimum));
        yMaximum=Double.valueOf(DForm.format(yMaximum));
        Xmin.setText(Double.toString(xMinimum));
        Xmax.setText(Double.toString(xMaximum));
        Ymin.setText(Double.toString(yMinimum));
        Ymax.setText(Double.toString(yMaximum));
        //graph with new window bounds
        plot();
    }
    
    private String getExpression()
    {
        return display.getText();
    }

    private String getSelectedExpression()
    {
        String result="";
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                result=fx;
                break;
            case 2:
                result=gx;
                break;
            case 3:
                result=hx;
                break;
            case 4:
                result=ix;
                break;
            case 5:
                result=jx;
                break;
            case 6:
                result=kx;
                break;
            case 7:
                result=lx;
                break;
        }
        return result;
    }

    private String getCertainExpression(int exp)
    {
        String result="";
        switch(exp+1)
        {
            case 1:
                result=fx;
                break;
            case 2:
                result=gx;
                break;
            case 3:
                result=hx;
                break;
            case 4:
                result=ix;
                break;
            case 5:
                result=jx;
                break;
            case 6:
                result=kx;
                break;
            case 7:
                result=lx;
                break;
        }
        return result;
    }

    private String getSelectedOption()
    {
        String result="";
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                result="f(x)";
                break;
            case 2:
                result="g(x)";
                break;
            case 3:
                result="h(x)";
                break;
            case 4:
                result="i(x)";
                break;
            case 5:
                result="j(x)";
                break;
            case 6:
                result="k(x)";
                break;
            case 7:
                result="l(x)";
                break;
        }
        return result;
    }

    private void saveExpression()
    {
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                fx=getExpression();
                break;
            case 2:
                gx=getExpression();
                break;
            case 3:
                hx=getExpression();
                break;
            case 4:
                ix=getExpression();
                break;
            case 5:
                jx=getExpression();
                break;
            case 6:
                kx=getExpression();
                break;
            case 7:
                lx=getExpression();
                break;
        }
    }

    private void graphExpression(String someExpression, Color c)
    {
        setColors(Color.red,Color.blue,Color.green,Color.orange,Color.cyan,Color.magenta,Color.pink);
        switch(Equation.getSelectedIndex()+1)
        {
            case 1:
                fx=getExpression();
                break;
            case 2:
                gx=getExpression();
                break;
            case 3:
                hx=getExpression();
                break;
            case 4:
                ix=getExpression();
                break;
            case 5:
                jx=getExpression();
                break;
            case 6:
                kx=getExpression();
                break;
            case 7:
                lx=getExpression();
                break;
        }
        //Set drawing parameters
        
        BasicStroke graphStroke=new BasicStroke(graphWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        Graphics2D graphics = (Graphics2D) graph_screen.getGraphics();        
        double y;double x;int length=graph_screen.getWidth();int Y;String parsedY;               
        graphics.setColor(c);
        graphics.setStroke(graphStroke);
        int[][] Points = new int[length+1][2];
        xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        
        //Get all the points on the line into an array
        
        for (int i=0;i<=length;)
        {
            x=((1.0*i/length)*(xMaximum-xMinimum))+xMinimum;
            parsedY=expression.solve(someExpression,x);
            if (parsedY.equals("Error")==false)
            {
                y=Double.parseDouble(parsedY);            
                Y=getY(y);
                Points[i][0]=i;
                Points[i][1]=Y;
            }
            i++;
        }
        //Draw all the points
        for (int i=3;i<Points.length;i+=1)
        {
            if(Points[i][0]-Points[i-1][0]==1&&Math.abs(Points[i][1]-Points[i-1][1])<graph_screen.getHeight()*3)
            {
                graphics.drawLine(Points[i-1][0],Points[i-1][1],Points[i][0],Points[i][1]);
                if(!drawInstantly && !isZooming && !isTranslating) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
                }
            }
        }                     
    }

    private void clearGraph()
    {
        int length=graph_screen.getWidth();
        Graphics2D graphics = (Graphics2D) graph_screen.getGraphics();
        graphics.setColor(graphColor);
        graphics.fillRect(0,0,length,graph_screen.getHeight());
    }

    //get Y on the screen based on y-value of graph
    private int getY(double y)
    {
        int height=graph_screen.getHeight();int result;
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());
        result=(int)Math.round(height-(((y-yMinimum)/(yMaximum-yMinimum))*height));
        return result;
    }

    private void drawAxis()
    {
        if (Axis)
        {
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());
        BasicStroke Stroke1=new BasicStroke(axisWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        Graphics graphics = graph_screen.getGraphics();
        Graphics2D g2D = (Graphics2D) graphics;
        g2D.setColor(axisColor);
        g2D.setStroke(Stroke1);
        //Horizontal Bars
        int y;
        double yRange=yMaximum-yMinimum;        
        y=(int)Math.round(height-(height*(0.0-yMinimum)/yRange));
        graphics.drawLine(0,y,length,y);
        //Vertical bars
        int x;
        double xRange=xMaximum-xMinimum;        
        x=(int)Math.round((length*(0.0-xMinimum)/xRange));
        graphics.drawLine(x,0,x,height);
        }
    }

    private void drawGrid()
    {
        if (Grid){
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        Graphics graphics = graph_screen.getGraphics();
        Graphics2D g2D = (Graphics2D) graphics;
        BasicStroke Stroke1=new BasicStroke(gridWidth,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2D.setStroke(Stroke1);
        g2D.setColor(gridColor);
        xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());
        //Vertical bars
        int x;
        double xRange=xMaximum-xMinimum;        
        int xminInt=(int)Math.round(xMinimum);
        int xmaxInt=(int)Math.round(xMaximum);
        for(int i=xminInt;i<=xmaxInt;i+=Math.round((xRange/100)+.5))
        {
            x=(int)Math.round((length*(i-xMinimum)/xRange));
            graphics.drawLine(x,0,x,height);
        }
        //Horizontal Bars
        int y;
        double yRange=yMaximum-yMinimum;
        int yminInt=(int)Math.round(yMinimum);
        int ymaxInt=(int)Math.round(yMaximum);
        for(int i=yminInt;i<=ymaxInt;i+=Math.round((yRange/100)+.5))
        {
            y=(int)Math.round(height-(height*(i-yMinimum)/yRange));
            graphics.drawLine(0,y,length,y);
        }
        }
    }


    private void clear()
    {
        //refresh display
        int length=graph_screen.getWidth();
        display.setText("");
        //refresh graph
        Graphics graphics = graph_screen.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,length,graph_screen.getHeight());
   }

    //Draw colors of all the expressions
    private void setColors(Color f,Color g,Color a,Color b,Color c,Color d,Color e)
    {
        Color[] colors = {f,g,a,b,c,d,e};
        JLabel[] labels = {fColor,gColor,aColor,bColor,cColor,dColor,eColor};
        BasicStroke Stroke=new BasicStroke(2,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        for(int i=0;i<labels.length;i++)
        {
            Graphics2D Colors = (Graphics2D)labels[i].getGraphics();
            Colors.setColor(colors[i]);
            Colors.setStroke(Stroke);
            Colors.drawLine(28,13,75,13);
        }
    }

    //Plot graph
    public void plot()
    {
        clearGraph();
        Color[] colors ={Color.red,Color.blue,Color.green,Color.orange,Color.cyan,Color.magenta,Color.pink};
        saveExpression();        
        for (int i=0;i<7;i++)
        {
            drawAxis();
            drawGrid();
            if(getCertainExpression(i).length()>0)
            graphExpression(getCertainExpression(i),colors[i]);
        }        
    }

    //Check if expression is valid, if not turn the text feild red until the expression makes sense
    private void checkExpression()
    {
        String Expression=display.getText();
        boolean pass=true;
        for(int i=0;i<Expression.length();i++)
        {           
            if(!(Expression.charAt(i)==
                ' ' || Expression.charAt(i)==
                '0' || Expression.charAt(i)==
                '1' || Expression.charAt(i)==
                '2' || Expression.charAt(i)==
                '3' || Expression.charAt(i)==
                '4' || Expression.charAt(i)==
                '5' || Expression.charAt(i)==
                '6' || Expression.charAt(i)==
                '7' || Expression.charAt(i)==
                '8' || Expression.charAt(i)==
                '9' || Expression.charAt(i)==
                '.' || Expression.charAt(i)==
                's' || Expression.charAt(i)==
                'c' || Expression.charAt(i)==
                't' || Expression.charAt(i)==
                'l' || Expression.charAt(i)==
               '√' || Expression.charAt(i)==
                'a' || Expression.charAt(i)==
                'x' || Expression.charAt(i)==
                'π' || Expression.charAt(i)==
                'n' || Expression.charAt(i)==
                'g' || Expression.charAt(i)==
                'b' || Expression.charAt(i)==
                'i' || Expression.charAt(i)==
                '^' || Expression.charAt(i)==
                'e' || Expression.charAt(i)==
                'o' || Expression.charAt(i)==
                '(' || Expression.charAt(i)==
                ')' || Expression.charAt(i)==
                '+' || Expression.charAt(i)==
                '-' || Expression.charAt(i)==
                '/' || Expression.charAt(i)==
                '*')) {
                pass=false;
            }            
        }
        //disable graph button if expression makes no sense
        graph.setEnabled(pass);
        //color the text field based on expression
        if(!pass)
        {
            display.setBackground(Color.red);
        }else{
            display.setBackground(Color.white);
        }        
    }

    //Check to see if a number makes sense
    private boolean checkNumber(String Number)
    {
        boolean pass=false;
        for(int i=0;i<Number.length();i++)
        {
            switch(Number.charAt(i))
            {
               case ' ':
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case '.':
               case '-':
                   if(i==0)
                   {pass=true;}
                   break;
               default:
                   pass=false;
            }
        }
        return !expression.solve(Number,0.0).equals("Error")&&pass;
    }

    private void drawCoordinates(java.awt.event.MouseEvent evt)
    {
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());        
        double xRange=(xMaximum-xMinimum);double yRange=(yMaximum-yMinimum);
        Graphics2D g2D = (Graphics2D) graph_screen.getGraphics();
        //get mouse position
        int mouse_x = evt.getX();
        int mouse_y = evt.getY();
        //determine graph coordinates
        String graph_x=Double.toString(xMinimum+((1.0*mouse_x/length)*xRange));
        String graph_y=Double.toString(yMaximum-((1.0*mouse_y/height)*yRange));
        if(graph_x.indexOf('.')!=-1&&graph_x.length()>graph_x.indexOf('.')+3)
        graph_x=graph_x.substring(0,graph_x.indexOf('.')+3);
        if(graph_y.indexOf('.')!=-1&&graph_y.length()>graph_y.indexOf('.')+3)
        graph_y=graph_y.substring(0,graph_y.indexOf('.')+3);
        //draw coordinates
        g2D.setColor(graphColor);
        g2D.fillRect(1,1,coords.length()*6,14);
        coords="Coordinates: ("+graph_x+","+graph_y+")";
        g2D.fillRect(1,1,coords.length()*6,14);
        g2D.setColor(Color.black);
        //set font to that of a button, in this case the Radian radio button
    }
  
    private void zoom(java.awt.event.MouseWheelEvent evt)
    {
        isZooming = true;
        double zoomFactor = .2;
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
        xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());
        int zoomx=evt.getX();int zoomy=evt.getY();
        double xRange=(xMaximum-xMinimum);double yRange=(yMaximum-yMinimum);
        int rotation = evt.getWheelRotation();
        double XmaxZoom=(-zoomFactor/length)*zoomx+zoomFactor;
        double XminZoom=Math.abs(XmaxZoom-zoomFactor);
        double YmaxZoom=(-zoomFactor/height)*zoomy+zoomFactor;
        double YminZoom=Math.abs(YmaxZoom-zoomFactor);
        //Zoom in/out
        if(rotation==-1)
        {
            yMinimum+=YmaxZoom*yRange;
            yMaximum-=YminZoom*yRange;
            xMinimum+=XminZoom*xRange;
            xMaximum-=XmaxZoom*xRange;            
        }else{
            //maximum zoom out range
            if(xRange<1999999*2&&yRange<1999999*2)
            {
            //maximum zoom in range
            if(xRange<=.04&&yRange<=.04)
            {
                xMinimum-=.02;
                xMaximum+=.02;
                yMinimum=.02;
                yMaximum+=.02;
            }
            yMinimum-=YmaxZoom*yRange;
            yMaximum+=YminZoom*yRange;
            xMinimum-=XminZoom*xRange;
            xMaximum+=XmaxZoom*xRange;
            }
        }
        //write to bounds text fields
        DecimalFormat DForm = new DecimalFormat("#.##");
        xMinimum=Double.valueOf(DForm.format(xMinimum));
       xMaximum=Double.valueOf(DForm.format(xMaximum));
        yMinimum=Double.valueOf(DForm.format(yMinimum));
        yMaximum=Double.valueOf(DForm.format(yMaximum));
        Xmin.setText(Double.toString(xMinimum));
        Xmax.setText(Double.toString(xMaximum));
        Ymin.setText(Double.toString(yMinimum));
        Ymax.setText(Double.toString(yMaximum));
        //plot the zoomed graph
        plot();
        isZooming = false;
    }

    private void translateGraph(java.awt.event.MouseEvent evt)
    {
        int length=graph_screen.getWidth();
        int height=graph_screen.getHeight();
       xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());
        int y2=evt.getY();
        int x2=evt.getX();
        int dx=x2-x1;
        int dy=y2-y1;
        xMinimum=xminimumClicked-(1.0*dx/length)*(xMaximum-xMinimum);
        xMaximum=xmaximumClicked-(1.0*dx/length)*(xMaximum-xMinimum);
        yMinimum=yminimumClicked+(1.0*dy/height)*(yMaximum-yMinimum);
        yMaximum=ymaximumClicked+(1.0*dy/height)*(yMaximum-yMinimum);
        //write to bounds text fields
        DecimalFormat DForm = new DecimalFormat("#.##");
        xMinimum=Double.valueOf(DForm.format(xMinimum));
        xMaximum=Double.valueOf(DForm.format(xMaximum));
        yMinimum=Double.valueOf(DForm.format(yMinimum));
        yMaximum=Double.valueOf(DForm.format(yMaximum));
        Xmin.setText(Double.toString(xMinimum));
        Xmax.setText(Double.toString(xMaximum));
        Ymin.setText(Double.toString(yMinimum));
        Ymax.setText(Double.toString(yMaximum));
        plot();
    }

    //Make sure ymax>ymin and xmax>xmin
    private boolean checkWindowBounds()
    {
        xMinimum=Double.parseDouble(Xmin.getText());
        xMaximum=Double.parseDouble(Xmax.getText());
        yMinimum=Double.parseDouble(Ymin.getText());
        yMaximum=Double.parseDouble(Ymax.getText());
        return xMinimum<xMaximum&&yMinimum<yMaximum;
    }

    //Instance variables
    private G_Calculations expression = new G_Calculations();
    private double xMinimum,xMaximum,yMinimum,yMaximum,S,E,incrnt,xminimumClicked,xmaximumClicked,yminimumClicked,ymaximumClicked;
    private int mode,precision,x1,y1,graphWidth=2,axisWidth=2,gridWidth=1;
    private boolean Axis=true,Grid=true,isTranslating,isZooming,drawInstantly = true;
    private String fx="",gx="",hx="",ix="",jx="",kx="",lx="",coords="Coordinates: (0.00,0.00)";
    private Color //default colors
            bgColor = Color.white,
            graphColor = Color.white,
            axisColor = Color.black,
            gridColor = Color.gray;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JComboBox Equation;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JTextField Xmax;
    private javax.swing.JPanel XmaxPanel;
    private javax.swing.JTextField Xmin;
    private javax.swing.JPanel XminPanel;
    private javax.swing.JTextField Ymax;
    private javax.swing.JPanel YmaxPanel;
    private javax.swing.JTextField Ymin;
    private javax.swing.JPanel YminPanel;
    private javax.swing.JLabel aColor;
    private javax.swing.JLabel bColor;
    private javax.swing.JLabel cColor;
    private javax.swing.JButton clear;
    private javax.swing.JLabel dColor;
    private javax.swing.JTextField display;
    private javax.swing.JSeparator divider1;
    private javax.swing.JSeparator divider3;
    private javax.swing.JRadioButton drawAxis;
    private javax.swing.JCheckBox drawFuncCheckBox;
    private javax.swing.JRadioButton drawGrid;
    private javax.swing.JLabel eColor;
    private javax.swing.JLabel fColor;
    private javax.swing.JLabel gColor;
    private javax.swing.JButton graph;
    private javax.swing.JPanel graph_screen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}