
package vista.usuario.inicio.snack;

import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class dulces extends javax.swing.JFrame {
    
    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection();  
   
    String a = " Sublime Almendras ";
    String b = " Morochitas ";
    String c = " M&M's Chocolate";
    String d = " Snickers ";
    double p1 = 3.00;
    double p2 = 1.50;
    double p3 = 4.30;
    double p4 = 4.30;  
    
    int cant1;
    int cant2;
    int cant3;
    int cant4;
    
    double res1;
    double res2;
    double res3;
    double res4;
    
    
    public dulces() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle ( " DULCES ");
        setResizable(false);       
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Sp4 = new javax.swing.JSpinner();
        Sp3 = new javax.swing.JSpinner();
        Sp2 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Sp1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(460, 495));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/dulces1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 10, 120, 80);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton4.setText("agregar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(-3);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar2.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(120, 370, 70, 80);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton2.setText("agregar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar2.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 250, 70, 77);

        Sp4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));
        Sp4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp4StateChanged(evt);
            }
        });
        getContentPane().add(Sp4);
        Sp4.setBounds(240, 420, 60, 30);

        Sp3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));
        Sp3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp3StateChanged(evt);
            }
        });
        getContentPane().add(Sp3);
        Sp3.setBounds(240, 300, 60, 30);

        Sp2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));
        Sp2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp2StateChanged(evt);
            }
        });
        getContentPane().add(Sp2);
        Sp2.setBounds(240, 180, 60, 30);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("S/ 1.50");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 150, 60, 18);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setText("S/ 4.30");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(240, 270, 60, 18);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setText("S/ 4.30");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(250, 390, 60, 18);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("SUBLIME ALMENDRAS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 90, 140, 15);

        Sp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));
        Sp1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp1StateChanged(evt);
            }
        });
        getContentPane().add(Sp1);
        Sp1.setBounds(240, 70, 60, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("M&M'S CHOCOLATE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 350, 120, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/dulces2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 130, 70, 100);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("SNICKERS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 450, 70, 15);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton3.setText("agregar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar2.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 130, 70, 80);

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/delete.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/delete2.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/delete.png"))); // NOI18N
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 240, 70, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/dulces4.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 260, 120, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton1.setText("agregar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/comprar.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 30, 70, 80);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("MOROCHITAS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 230, 90, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/dulces6.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 370, 120, 70);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("S/ 3.00");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 40, 60, 18);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, -10, 150, 610);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(240, 270, 60, 20);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

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
        jPanel3.setBounds(250, 390, 60, 20);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(250, 40, 60, 20);

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(240, 150, 60, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/puntos.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-610, 0, 960, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
    try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,a);
      M.setDouble(2,p1);
      M.setInt(3,cant1);
      M.setDouble(4,res1);
      
      
      M.executeUpdate(); // para actualizar la BD
      
       JOptionPane.showMessageDialog(null," DATOS GUARDADOS ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
    
    //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,a);
      M.setDouble(2,res1);
      M.executeUpdate(); // para actualizar la BD
      
              
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
    
    
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,b);
      M.setDouble(2,p2);
      M.setInt(3,cant2);
      M.setDouble(4,res2);
      
      M.executeUpdate(); // para actualizar la BD
      
       JOptionPane.showMessageDialog(null," DATOS GUARDADOS ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }  
        
      //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,b);
      M.setDouble(2,res2);
      M.executeUpdate(); // para actualizar la BD
      
               
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }       
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,c);
      M.setDouble(2,p3);
      M.setInt(3,cant3);
      M.setDouble(4,res3);
      
      M.executeUpdate(); // para actualizar la BD
      
       JOptionPane.showMessageDialog(null," DATOS GUARDADOS ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
        
        
      //--------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,c);
      M.setDouble(2,res3);
      M.executeUpdate(); // para actualizar la BD
      
             
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }              
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,d);
      M.setDouble(2,p4);
      M.setInt(3,cant4);
      M.setDouble(4,res4);
      
      M.executeUpdate(); // para actualizar la BD
      
       JOptionPane.showMessageDialog(null," DATOS GUARDADOS ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }  
        
        //---------------------------------------------------------------------       
      //---------------------------------------------------------------------  PARA GAURDAR EL TOTAL
      
      try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)");
            
      M.setString(1,d);
      M.setDouble(2,res4);
      M.executeUpdate(); // para actualizar la BD
      
             
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
        
                             
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Sp2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp2StateChanged

        
         cant2 = (int) Sp2.getValue();
        
        res2 = cant2*1.50;
    }//GEN-LAST:event_Sp2StateChanged

    private void Sp1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp1StateChanged
       
        cant1 = (int) Sp1.getValue();
        
        res1 = cant1*3.00;
        
        
    }//GEN-LAST:event_Sp1StateChanged

    private void Sp3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp3StateChanged
     
         cant3 = (int) Sp3.getValue();
        
        res3 = cant3*4.30;
    }//GEN-LAST:event_Sp3StateChanged

    private void Sp4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp4StateChanged
         
        cant4 = (int) Sp4.getValue();
        
        res4 = cant4*4.30;
        
        
    }//GEN-LAST:event_Sp4StateChanged

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
            java.util.logging.Logger.getLogger(dulces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dulces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dulces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dulces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dulces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Sp1;
    private javax.swing.JSpinner Sp2;
    private javax.swing.JSpinner Sp3;
    private javax.swing.JSpinner Sp4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
