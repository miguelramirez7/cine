package vista.usuario.inicio.snack;


import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.usuario.inicio.snacks;

public class combos extends javax.swing.JFrame {

    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection(); 
   
    String a = " Combo para 1 ";
    String b = " Combo para 2 ";
    String c = " Combo para 3";
    String d = " Combo para 3 - agrandado";
    String e = " Combo para 1 Hot-Dog";
    
    double p1 = 15.00;
    double p2 = 21.00;
    double p3 = 24.00;
    double p4 = 26.00;   
    double p5 = 13.00;  
        
    public combos() {
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle(" COMBOS ");
        setResizable(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combo1 = new javax.swing.JButton();
        combo2 = new javax.swing.JButton();
        combo3 = new javax.swing.JButton();
        combo4 = new javax.swing.JButton();
        combo5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(430, 578));
        getContentPane().setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("AGREGAR");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(240, 300, 60, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("AGREGAR");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 290, 60, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("AGREGAR");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 90, 60, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText("AGREGAR");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(230, 90, 60, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("AGREGAR");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 450, 60, 30);

        combo1.setBackground(new java.awt.Color(255, 255, 255));
        combo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        combo1.setForeground(new java.awt.Color(255, 51, 102));
        combo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo1.setBorder(null);
        combo1.setBorderPainted(false);
        combo1.setContentAreaFilled(false);
        combo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combo1.setIconTextGap(-4);
        combo1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar2.png"))); // NOI18N
        combo1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        combo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(combo1);
        combo1.setBounds(220, 50, 90, 90);

        combo2.setBackground(new java.awt.Color(255, 255, 255));
        combo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        combo2.setForeground(new java.awt.Color(255, 51, 102));
        combo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo2.setBorder(null);
        combo2.setBorderPainted(false);
        combo2.setContentAreaFilled(false);
        combo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combo2.setIconTextGap(-4);
        combo2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar2.png"))); // NOI18N
        combo2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        combo2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        getContentPane().add(combo2);
        combo2.setBounds(230, 260, 90, 90);

        combo3.setBackground(new java.awt.Color(255, 255, 255));
        combo3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        combo3.setForeground(new java.awt.Color(255, 51, 102));
        combo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo3.setBorder(null);
        combo3.setBorderPainted(false);
        combo3.setContentAreaFilled(false);
        combo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combo3.setIconTextGap(-4);
        combo3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar2.png"))); // NOI18N
        combo3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        combo3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo3ActionPerformed(evt);
            }
        });
        getContentPane().add(combo3);
        combo3.setBounds(20, 250, 90, 90);

        combo4.setBackground(new java.awt.Color(255, 255, 255));
        combo4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        combo4.setForeground(new java.awt.Color(255, 51, 102));
        combo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo4.setBorder(null);
        combo4.setBorderPainted(false);
        combo4.setContentAreaFilled(false);
        combo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combo4.setIconTextGap(-4);
        combo4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar2.png"))); // NOI18N
        combo4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        combo4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo4ActionPerformed(evt);
            }
        });
        getContentPane().add(combo4);
        combo4.setBounds(20, 410, 80, 90);

        combo5.setBackground(new java.awt.Color(255, 255, 255));
        combo5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        combo5.setForeground(new java.awt.Color(255, 51, 102));
        combo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo5.setBorder(null);
        combo5.setBorderPainted(false);
        combo5.setContentAreaFilled(false);
        combo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combo5.setIconTextGap(-4);
        combo5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar2.png"))); // NOI18N
        combo5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/agregar1.png"))); // NOI18N
        combo5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        combo5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo5ActionPerformed(evt);
            }
        });
        getContentPane().add(combo5);
        combo5.setBounds(10, 50, 90, 90);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AGRANDADO");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(250, 370, 100, 20);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("combo para 3  S/ 24.00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 350, 180, 20);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("combo para 3  S/ 26.00");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 350, 180, 20);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("combo para 1  S/ 13.00");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 520, 180, 20);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("combo para 2  S/ 21.00");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 150, 180, 20);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("combo para 1  S/ 15.00");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 150, 180, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/SNACKS/c1.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 10, 140, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/SNACKS/C4.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 200, 140, 140);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/SNACKS/C2.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 10, 140, 130);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/SNACKS/C5.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 390, 140, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/SNACKS/C3.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 200, 140, 140);

        jPanel4.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(150, 350, 70, 20);

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 150, 70, 20);

        jPanel3.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(350, 150, 60, 20);

        jPanel5.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(150, 520, 60, 20);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 350, 60, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/back-icon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/back-icon (2).png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/back-icon.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 451, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/cines.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-650, -1470, 1090, 2070);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        snacks S = new snacks ();
        S.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo5ActionPerformed
       
     bebidas B = new bebidas();
     B.setVisible(true);
     B.setTitle( " BEBIDAS - COMBO 1 ");
                
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,a);
      M.setDouble(2,p1);
      M.setInt(3,1);
      M.setDouble(4,p1);
      
      M.executeUpdate(); // para actualizar la BD
      
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }          
      
     //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,a);
      M.setDouble(2,p1);
      M.executeUpdate(); // para actualizar la BD
              
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
        
        
    
    }//GEN-LAST:event_combo5ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
    
        bebidas_C2 C = new bebidas_C2 (); // para las bebidas
        C.setVisible(true);          
        try {        
            PreparedStatement M = cn.prepareStatement
            (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");          
            M.setString(1,b);
            M.setDouble(2,p2);
            M.setInt(3,1);
            M.setDouble(4,p2);
            M.executeUpdate(); // para actualizar la BD           
        } catch (SQLException ex) {      
            Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }           
         //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
        try {        
            PreparedStatement M = cn.prepareStatement
            (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");     
            M.setString(1,b);
            M.setDouble(2,p1);
            M.executeUpdate(); // para actualizar la BD
        } catch (SQLException ex) {
            Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
    }//GEN-LAST:event_combo1ActionPerformed

    
    private void combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo3ActionPerformed

       bebidas_C3 C = new bebidas_C3 ();
        C.setVisible(true);  
        C.setTitle(" BEBIDAD - COMBO 3 ");
        
        
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,c);
      M.setDouble(2,p3);
      M.setInt(3,1);
      M.setDouble(4,p3);
      
      M.executeUpdate(); // para actualizar la BD
      
               
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }          
                
        //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,c);
      M.setDouble(2,p3);
      M.executeUpdate(); // para actualizar la BD
      
              
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
     
        
        
    }//GEN-LAST:event_combo3ActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed

       bebidas_C3 C = new bebidas_C3 ();
        C.setVisible(true);  
        C.setTitle(" BEBIDAD - COMBO 3 AGRANDADO ");
        
        try {        
      PreparedStatement M = cn.prepareStatement
        ("INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,d);
      M.setDouble(2,p4);
      M.setDouble(3,1);
      M.setDouble(4,p4);
        
      M.executeUpdate(); // para actualizar la BD
      
               
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }          
        
       //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,d);
      M.setDouble(2,p4);
      M.executeUpdate(); // para actualizar la BD
      
               
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
      
        
    }//GEN-LAST:event_combo2ActionPerformed

    private void combo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo4ActionPerformed
        
        bebidas B = new bebidas();
        B.setVisible(true);
        B.setTitle( " BEBIDAS COMBO HOT DOG ");
        
        
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,e);
      M.setDouble(2,p5);
      M.setDouble(3,1);
      M.setDouble(4,p5);
      
      M.executeUpdate(); // para actualizar la BD
      
               
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }          
             
      //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,e);
      M.setDouble(2,p5);
      M.executeUpdate(); // para actualizar la BD
      
               
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
      
        
        
        
    }//GEN-LAST:event_combo4ActionPerformed

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
            java.util.logging.Logger.getLogger(combos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(combos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(combos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(combos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new combos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton combo1;
    private javax.swing.JButton combo2;
    private javax.swing.JButton combo3;
    private javax.swing.JButton combo4;
    private javax.swing.JButton combo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
