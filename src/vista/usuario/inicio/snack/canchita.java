
package vista.usuario.inicio.snack;

import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.usuario.inicio.snacks;



public class canchita extends javax.swing.JFrame {
    
    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection(); 
   
    String a = " Canchita Grande ";
    String b = " Canchita Mediana ";
    String c = " Canchita Gigante";
    String d = " Canchita Super Gigante";
    double p1 = 7.50;
    double p2 = 6.50;
    double p3 = 9.50;
    double p4 = 11.00;      
    
    public canchita() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);   
        setTitle(" CANCHITAS ");
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 500));
        getContentPane().setLayout(null);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton4.setText("agregar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(-3);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon (1).png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 380, 60, 70);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton6.setText("agregar");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(-3);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon (1).png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(170, 390, 60, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/back-icon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/back-icon (2).png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/back-icon.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 290, 50, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton5.setText("agregar");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(-3);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon (1).png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(340, 50, 50, 70);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/puntos.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-480, 0, 580, 700);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("gigante");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 370, 120, 30);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("canchita super ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 360, 120, 30);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(255, 255, 102));
        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("S/ 7.50");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(170, 150, 60, 20);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("canchita mediana");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 130, 140, 20);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("canchita grande");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 130, 140, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/can4.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 210, 120, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/can1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 0, 90, 150);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(255, 255, 102));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("S/ 6.50");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(290, 150, 60, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/can2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 10, 80, 130);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("canchita gigante");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(130, 360, 140, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton3.setText("agregar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon (1).png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 60, 60, 60);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 0, 10, 500);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/can3.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 210, 100, 130);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setBackground(new java.awt.Color(255, 255, 102));
        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("S/ 11.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(310, 340, 60, 20);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(255, 255, 102));
        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/ 9.50");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(170, 340, 70, 20);

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 0, 420, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        snacks S = new snacks ();
        S.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,a);
      M.setDouble(2,p1);
      M.setInt(3,1);
      M.setDouble(4,p1);
      
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
      M.setDouble(2,p1);
          
      M.executeUpdate(); // para actualizar la BD
      
              
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
           
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,b);
      M.setDouble(2,p2);
      M.setInt(3,1);
      M.setDouble(4,p2);
      
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
      M.setDouble(2,p2);
          
      M.executeUpdate(); // para actualizar la BD
            
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
           
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,c);
      M.setDouble(2,p3);
      M.setInt(3,1);
      M.setDouble(4,p3);
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
            
      M.setString(1,c);
      M.setDouble(2,p3);
          
      M.executeUpdate(); // para actualizar la BD
      
             
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
           
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
      M.setString(1,d);
      M.setDouble(2,p4);
      M.setInt(3,1);
      M.setDouble(4,p4);
      
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
      M.setDouble(2,p4);
          
      M.executeUpdate(); // para actualizar la BD
      
              
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
               
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(canchita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(canchita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(canchita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(canchita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new canchita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
