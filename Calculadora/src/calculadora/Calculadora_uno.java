/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
/**
 *
 * @Sebastian_Sanabria
 */
public class Calculadora_uno extends javax.swing.JFrame {
    
 Metodos metodox=new Metodos();

    /**
     * Creates new form Calculadora_uno
     */
    public Calculadora_uno() {
        initComponents();
        
        this.setLocationRelativeTo(null);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton_borrar = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_0 = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_1 = new javax.swing.JButton();
        boton_punto = new javax.swing.JButton();
        boton_menos = new javax.swing.JButton();
        boton_division = new javax.swing.JButton();
        boton_igual = new javax.swing.JButton();
        boton_mas = new javax.swing.JButton();
        boton_multiplicacion = new javax.swing.JButton();
        boton_seno = new javax.swing.JButton();
        boton_raiz = new javax.swing.JButton();
        boton_IVA = new javax.swing.JButton();
        boton_potencia = new javax.swing.JButton();
        boton_coseno = new javax.swing.JButton();
        boton_tangente = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CALCULADORA");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(220, 244, 242));

        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora Grupo Cool");

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_borrar.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        boton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_borrar.setText("CE");
        boton_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_borrarMouseClicked(evt);
            }
        });
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(boton_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 59, 60));

        boton_3.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_3.setText("3");
        boton_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_3MouseClicked(evt);
            }
        });
        jPanel2.add(boton_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 59, 60));

        boton_0.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_0.setText("0");
        boton_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_0MouseClicked(evt);
            }
        });
        jPanel2.add(boton_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 59, 60));

        boton_9.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_9.setText("9");
        boton_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_9MouseClicked(evt);
            }
        });
        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 59, 60));

        boton_2.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_2.setText("2");
        boton_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_2MouseClicked(evt);
            }
        });
        jPanel2.add(boton_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 59, 60));

        boton_5.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_5.setText("5");
        boton_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_5MouseClicked(evt);
            }
        });
        jPanel2.add(boton_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 59, 60));

        boton_6.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_6.setText("6");
        boton_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_6MouseClicked(evt);
            }
        });
        jPanel2.add(boton_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 59, 60));

        boton_7.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_7.setText("7");
        boton_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_7MouseClicked(evt);
            }
        });
        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 59, 60));

        boton_8.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_8.setText("8");
        boton_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_8MouseClicked(evt);
            }
        });
        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 59, 60));

        boton_1.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_1.setText("1");
        boton_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_1MouseClicked(evt);
            }
        });
        jPanel2.add(boton_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 59, 60));

        boton_punto.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_punto.setText(".");
        boton_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_punto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_puntoMouseClicked(evt);
            }
        });
        jPanel2.add(boton_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 59, 60));

        boton_menos.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_menos.setText("-");
        boton_menos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_menos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_menos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_menosMouseClicked(evt);
            }
        });
        jPanel2.add(boton_menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 59, 60));

        boton_division.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_division.setText("/");
        boton_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_divisionMouseClicked(evt);
            }
        });
        boton_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(boton_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 59, 60));

        boton_igual.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_igual.setForeground(new java.awt.Color(255, 255, 255));
        boton_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        boton_igual.setText("=");
        boton_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_igualMouseClicked(evt);
            }
        });
        boton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_igualActionPerformed(evt);
            }
        });
        jPanel2.add(boton_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 59, 60));

        boton_mas.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_mas.setText("+");
        boton_mas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_mas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_mas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_masMouseClicked(evt);
            }
        });
        jPanel2.add(boton_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 59, 60));

        boton_multiplicacion.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_multiplicacion.setText("*");
        boton_multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_multiplicacionMouseClicked(evt);
            }
        });
        jPanel2.add(boton_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 59, 60));

        boton_seno.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        boton_seno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_seno.setText("Sen");
        boton_seno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_seno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_seno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_seno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_senoMouseClicked(evt);
            }
        });
        jPanel2.add(boton_seno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 59, 60));

        boton_raiz.setFont(new java.awt.Font("Ink Free", 0, 15)); // NOI18N
        boton_raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_raiz.setText("sqrt");
        boton_raiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_raiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_raiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_raizMouseClicked(evt);
            }
        });
        boton_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_raizActionPerformed(evt);
            }
        });
        jPanel2.add(boton_raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 59, 60));

        boton_IVA.setFont(new java.awt.Font("Ink Free", 0, 15)); // NOI18N
        boton_IVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_IVA.setText("IVA");
        boton_IVA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_IVA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_IVA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_IVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_IVAMouseClicked(evt);
            }
        });
        boton_IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_IVAActionPerformed(evt);
            }
        });
        jPanel2.add(boton_IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 59, 60));

        boton_potencia.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        boton_potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_potencia.setText("Exp");
        boton_potencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_potencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_potencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_potencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_potenciaMouseClicked(evt);
            }
        });
        jPanel2.add(boton_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 59, 60));

        boton_coseno.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        boton_coseno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_coseno.setText("Cos");
        boton_coseno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_coseno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_coseno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_coseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_cosenoMouseClicked(evt);
            }
        });
        jPanel2.add(boton_coseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 59, 60));

        boton_tangente.setFont(new java.awt.Font("Ink Free", 0, 16)); // NOI18N
        boton_tangente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_tangente.setText("Tan");
        boton_tangente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_tangente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1.png"))); // NOI18N
        boton_tangente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_tangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_tangenteMouseClicked(evt);
            }
        });
        jPanel2.add(boton_tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 59, 60));

        boton_4.setFont(new java.awt.Font("Ink Free", 0, 36)); // NOI18N
        boton_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_4.setText("4");
        boton_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        boton_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1_press.png"))); // NOI18N
        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 59, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_1MouseClicked

        jLabel2.setText(metodox.concatenamiento("1"));
    }//GEN-LAST:event_boton_1MouseClicked

    private void boton_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_2MouseClicked
 jLabel2.setText(metodox.concatenamiento("2"));          
    }//GEN-LAST:event_boton_2MouseClicked

    private void boton_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_3MouseClicked
        jLabel2.setText(metodox.concatenamiento("3"));
    }//GEN-LAST:event_boton_3MouseClicked

    private void boton_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_5MouseClicked
        jLabel2.setText(metodox.concatenamiento("5"));
    }//GEN-LAST:event_boton_5MouseClicked

    private void boton_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_6MouseClicked
        jLabel2.setText(metodox.concatenamiento("6"));// TODO add your handling code here:
    }//GEN-LAST:event_boton_6MouseClicked

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_7MouseClicked
      jLabel2.setText(metodox.concatenamiento("7")); // TODO add your handling code here:
    }//GEN-LAST:event_boton_7MouseClicked

    private void boton_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_8MouseClicked
        jLabel2.setText(metodox.concatenamiento("8")); // TODO add your handling code here:
    }//GEN-LAST:event_boton_8MouseClicked

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_9MouseClicked
       jLabel2.setText(metodox.concatenamiento("9")); // TODO add your handling code here:
    }//GEN-LAST:event_boton_9MouseClicked

    private void boton_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_0MouseClicked
     jLabel2.setText(metodox.concatenamiento("0"));  // TODO add your handling code here:
    }//GEN-LAST:event_boton_0MouseClicked

    private void boton_puntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_puntoMouseClicked
     jLabel2.setText(metodox.concatenamiento(".")); // TODO add your handling code here:
    }//GEN-LAST:event_boton_puntoMouseClicked

    private void boton_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_igualMouseClicked
          jLabel2.setText(""+metodox.resultado(jLabel2.getText()));      
    }//GEN-LAST:event_boton_igualMouseClicked

    private void boton_masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_masMouseClicked
       metodox.suma(jLabel2.getText());
    }//GEN-LAST:event_boton_masMouseClicked

    private void boton_menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_menosMouseClicked
    metodox.resta(jLabel2.getText());
    }//GEN-LAST:event_boton_menosMouseClicked

    private void boton_multiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_multiplicacionMouseClicked
     metodox.multiplicacion(jLabel2.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_boton_multiplicacionMouseClicked

    private void boton_divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_divisionMouseClicked
     metodox.division(jLabel2.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_boton_divisionMouseClicked

    private void boton_senoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_senoMouseClicked
     metodox.seno(jLabel2.getText());
    }//GEN-LAST:event_boton_senoMouseClicked

    private void boton_cosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_cosenoMouseClicked
     metodox.coseno(jLabel2.getText());  // TODO add your handling code here:
    }//GEN-LAST:event_boton_cosenoMouseClicked

    private void boton_tangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_tangenteMouseClicked
      metodox.tangente(jLabel2.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_boton_tangenteMouseClicked

    private void boton_raizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_raizMouseClicked
       metodox.raiz(jLabel2.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_boton_raizMouseClicked

    private void boton_potenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_potenciaMouseClicked
    metodox.potencia(jLabel2.getText());
       
    }//GEN-LAST:event_boton_potenciaMouseClicked

    private void boton_IVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_IVAMouseClicked
        metodox.IVA(jLabel2.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_boton_IVAMouseClicked

    private void boton_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_borrarMouseClicked
        metodox.borrar(jLabel2.getText());
        jLabel2.setText(metodox.concatenamiento(""));
        jLabel2.setText(""+metodox.resultado(jLabel2.getText()));
    }//GEN-LAST:event_boton_borrarMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void boton_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_divisionActionPerformed

    private void boton_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_raizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_raizActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_boton_borrarActionPerformed

    private void boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_igualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_igualActionPerformed

    private void boton_IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_IVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_IVAActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_8ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed
        jLabel2.setText(metodox.concatenamiento("4"));// TODO add your handling code here:
    }//GEN-LAST:event_boton_4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_0;
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_IVA;
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_coseno;
    private javax.swing.JButton boton_division;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_mas;
    private javax.swing.JButton boton_menos;
    private javax.swing.JButton boton_multiplicacion;
    private javax.swing.JButton boton_potencia;
    private javax.swing.JButton boton_punto;
    private javax.swing.JButton boton_raiz;
    private javax.swing.JButton boton_seno;
    private javax.swing.JButton boton_tangente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}