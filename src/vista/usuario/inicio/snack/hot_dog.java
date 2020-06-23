package vista.usuario.inicio.snack;

import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class hot_dog extends javax.swing.JFrame {
    
    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection();
   
    String a = " Hot-Dog Regular ";
    String b = " Hot-Dog Jumbo ";
    
    double p1 = 6.50;
    double p2 = 8.50;
    int cant1;
    int cant2;
    double res1;
    double res2;
    
    
      
    public hot_dog() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle(" HOT - DOGS ");
        setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Sp2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Sp1 = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 340));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("HOT- DOG REGULAR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 190, 160, 18);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("S/ 8.50");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 140, 70, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/AGREGAR.png"))); // NOI18N
        jButton4.setText("agregar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(1);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/AGREGAR2_1.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/AGREGAR.png"))); // NOI18N
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(100, 220, 80, 80);

        Sp2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 6, 1));
        Sp2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp2StateChanged(evt);
            }
        });
        getContentPane().add(Sp2);
        Sp2.setBounds(250, 70, 60, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/AGREGAR.png"))); // NOI18N
        jButton2.setText("agregar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(1);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/AGREGAR2_1.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/AGREGAR.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 220, 80, 80);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("HOT - DOG JUMBO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 190, 140, 18);

        Sp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 6, 1));
        Sp1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp1StateChanged(evt);
            }
        });
        getContentPane().add(Sp1);
        Sp1.setBounds(50, 70, 60, 30);

        jPanel5.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(290, 20, 100, 20);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(440, 160, 20, 40);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(440, 90, 20, 40);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 160, 20, 40);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 90, 20, 40);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 20, 100, 20);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 210, 470, 100);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/delete.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/delete2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/delete.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 10, 60, 50);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("S/ 6.50");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 150, 70, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/hot-dog2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 60, 140, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/hot-dog1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 70, 130, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/david.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-590, -200, 1100, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
      if ( cant2 != 0){        
        
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
        
      }  
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       if (cant1 != 0) 
       {
        
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
      
       }
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Sp1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp1StateChanged
      
       cant1 = (int) Sp1.getValue();
       
       res1 = cant1*6.5;
       
               
    }//GEN-LAST:event_Sp1StateChanged

    private void Sp2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp2StateChanged
       
        
        cant2 = (int) Sp2.getValue();
       
       res2 = cant2*8.5;
        
        
    }//GEN-LAST:event_Sp2StateChanged

    
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
            java.util.logging.Logger.getLogger(hot_dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hot_dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hot_dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hot_dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hot_dog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Sp1;
    private javax.swing.JSpinner Sp2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
