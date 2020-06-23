
package vista.usuario.inicio.snack;

import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.usuario.inicio.snacks;



public class BEBIDAS_PRINCIPAL extends javax.swing.JFrame {
    
    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection();
    
    String a = " PEPSI GRANDE ";
    String b = " PEPSI LIGTH GRANDE ";
    String c = " SEVEN UP GRANDE ";
    String d = " CC NARANJA GRANDE ";
    String e = " CHICHA MORADA GRANDE ";
    
    double p1 = 5.00;
    double p2 = 8.00;
    double p3 = 5.00;
    double p4 = 8.00;
    double p5 = 9.00;
    double fin;
  
     int cant1;
      int cant2;
       int cant3;
        int cant4;
         int cant5;
    
    double res1;
    double res2;
    double res3;
    double res4;
    double res5;
         
         
    public BEBIDAS_PRINCIPAL() {
        initComponents();
        
        setLocationRelativeTo(null);
       // setVisible(true);
        setTitle(" BEBIDAS ");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Sp5 = new javax.swing.JSpinner();
        Sp4 = new javax.swing.JSpinner();
        Sp3 = new javax.swing.JSpinner();
        Sp2 = new javax.swing.JSpinner();
        Sp1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(553, 400));
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/B2.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 80, 90, 100);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("S/ 9.00");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 60, 50, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("S/ 8.00");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 60, 50, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("S/ 8.00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(350, 60, 50, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/B3.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 70, 80, 120);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("S/ 5.00");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 60, 50, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("S/ 5.00");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 60, 50, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/B4.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 70, 70, 120);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/B5.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 70, 70, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/SNACKS/B1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 80, 90, 110);

        Sp5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Sp5.setToolTipText("");
        Sp5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Sp5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp5StateChanged(evt);
            }
        });
        getContentPane().add(Sp5);
        Sp5.setBounds(450, 200, 60, 30);

        Sp4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Sp4.setToolTipText("");
        Sp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Sp4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp4StateChanged(evt);
            }
        });
        getContentPane().add(Sp4);
        Sp4.setBounds(350, 200, 60, 30);

        Sp3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Sp3.setToolTipText("");
        Sp3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Sp3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp3StateChanged(evt);
            }
        });
        getContentPane().add(Sp3);
        Sp3.setBounds(250, 200, 60, 30);

        Sp2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Sp2.setToolTipText("");
        Sp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Sp2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp2StateChanged(evt);
            }
        });
        getContentPane().add(Sp2);
        Sp2.setBounds(150, 200, 60, 30);

        Sp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sp1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Sp1.setToolTipText("");
        Sp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Sp1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp1StateChanged(evt);
            }
        });
        getContentPane().add(Sp1);
        Sp1.setBounds(40, 200, 70, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/AGREGAR.png"))); // NOI18N
        jButton2.setText("ACEPTAR");
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
        jButton2.setBounds(170, 250, 80, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/CANCELAR.png"))); // NOI18N
        jButton1.setText("CANCELAR");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(1);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/CANCELAR2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/CANCELAR.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 250, 80, 80);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 190, 510, 50);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 240, 530, 100);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/david.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 550, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 580, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        snacks S= new snacks();
        S.setVisible(true);  
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
      snacks S = new snacks();
        
        if ( cant1 !=0){  // PARA EL PRIMERO
        try {             
      PreparedStatement M = cn.prepareStatement
      (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
       M.setString(1,a);
       M.setDouble(2,p1);
       M.setInt(3, cant1);
       M.setDouble(4, res1);
          
            
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
      
      
      if (cant2!=0){     // PARA EL SEGUNDO
        try {             
      PreparedStatement M = cn.prepareStatement
      (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
            
       M.setString(1,b);     
       M.setDouble(2,p2);
       M.setInt(3, cant2);
       M.setDouble(4, res2);
     
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
              
      if (cant3!=0)  // PARA EL TERCERO
      {    
        try {             
      PreparedStatement M = cn.prepareStatement
      (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
              
       M.setString(1,c);
       M.setDouble(2,p3);
       M.setInt(3,cant3);
       M.setDouble(4, res3);       
            
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
      M.setDouble(2,res3);
          
      M.executeUpdate(); // para actualizar la BD
      
       
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
           
        
      }
        
      
       if (cant4!=0)  // PARA EL TERCERO
      {    
        try {             
      PreparedStatement M = cn.prepareStatement
      (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
              
       M.setString(1,d);
       M.setDouble(2,p4);
       M.setInt(3,cant4);
       M.setDouble(4, res4);       
            
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
            
      M.setString(1,e);
      M.setDouble(2,res4);
          
      M.executeUpdate(); // para actualizar la BD
      
             
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
           
        
      }
       
       
        if (cant5!=0)  // PARA EL TERCERO
      {    
        try {             
      PreparedStatement M = cn.prepareStatement
      (" INSERT INTO pedidos_de_clientes (nombre,precio,cantidad,total) VALUES(?,?,?,?)");
              
       M.setString(1,e);
       M.setDouble(2,p5);
       M.setInt(3,cant5);
       M.setDouble(4, res5);       
            
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
            
      M.setString(1,e);
      M.setDouble(2,res5);
          
      M.executeUpdate(); // para actualizar la BD
      
               
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }     
           
        
      }
        
            dispose();
        S.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Sp1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp1StateChanged
       
        cant1 = (int) Sp1.getValue();   
        
        res1 = cant1*p1;
        
        
    }//GEN-LAST:event_Sp1StateChanged

    private void Sp2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp2StateChanged
        
         cant2 = (int) Sp2.getValue();
        
        res2 = cant2*p2;
    }//GEN-LAST:event_Sp2StateChanged

    private void Sp3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp3StateChanged
       
         cant3 = (int) Sp3.getValue();
        
        res3 = cant3*p3;
    }//GEN-LAST:event_Sp3StateChanged

    private void Sp4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp4StateChanged
        
         cant4 = (int) Sp4.getValue();
        
        res4 = cant4*p4;
    }//GEN-LAST:event_Sp4StateChanged

    private void Sp5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp5StateChanged
        
         cant5 = (int) Sp5.getValue();
        
        res5 = cant5*p5;
    }//GEN-LAST:event_Sp5StateChanged

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
            java.util.logging.Logger.getLogger(BEBIDAS_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BEBIDAS_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BEBIDAS_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BEBIDAS_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BEBIDAS_PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Sp1;
    private javax.swing.JSpinner Sp2;
    private javax.swing.JSpinner Sp3;
    private javax.swing.JSpinner Sp4;
    private javax.swing.JSpinner Sp5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    // End of variables declaration//GEN-END:variables
}
