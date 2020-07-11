
package vista.usuario.inicio;

import vista.usuario.FORMA_DE_PAGO.pagando;
import vista.usuario.inicio.snack.BEBIDAS_PRINCIPAL;
import vista.usuario.inicio.snack.canchita;
import vista.usuario.inicio.snack.combos;
import vista.usuario.inicio.snack.dulces;
import vista.usuario.inicio.snack.hot_dog;

public class snacks extends javax.swing.JFrame {

    public snacks() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle(" BIENVENIDOS AL AREA DE COMIDA ");
        setResizable(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bebidas = new javax.swing.JButton();
        canchita = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        combo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(430, 615));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras G.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras pe.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras G.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(-10, 470, 110, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/finish_buy1.png"))); // NOI18N
        jButton3.setText("TERMINAR COMPRA");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/finish_buy2.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/finish_buy1.png"))); // NOI18N
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 490, 120, 80);

        bebidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        bebidas.setForeground(new java.awt.Color(255, 51, 51));
        bebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/bebida.png"))); // NOI18N
        bebidas.setText("BEBIDAS");
        bebidas.setBorder(null);
        bebidas.setBorderPainted(false);
        bebidas.setContentAreaFilled(false);
        bebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bebidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bebidas.setIconTextGap(-3);
        bebidas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/bebi 3.png"))); // NOI18N
        bebidas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/bebida.png"))); // NOI18N
        bebidas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bebidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidasActionPerformed(evt);
            }
        });
        getContentPane().add(bebidas);
        bebidas.setBounds(280, 190, 100, 130);

        canchita.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        canchita.setForeground(new java.awt.Color(255, 51, 0));
        canchita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/canchita.png"))); // NOI18N
        canchita.setText("CANCHITAS");
        canchita.setBorder(null);
        canchita.setBorderPainted(false);
        canchita.setContentAreaFilled(false);
        canchita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        canchita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        canchita.setIconTextGap(-3);
        canchita.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/canchita 2.png"))); // NOI18N
        canchita.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/canchita.png"))); // NOI18N
        canchita.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        canchita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        canchita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canchitaActionPerformed(evt);
            }
        });
        getContentPane().add(canchita);
        canchita.setBounds(180, 200, 110, 120);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 500, 260, 70);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/hot.png"))); // NOI18N
        jButton6.setText("HOT-DOG");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(-3);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/hot2.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/hot.png"))); // NOI18N
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(170, 370, 100, 100);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/DUL2.png"))); // NOI18N
        jButton2.setText("DULCES");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/dul G.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/DUL2.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 370, 100, 100);

        combo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        combo.setForeground(new java.awt.Color(255, 51, 51));
        combo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/comb 1.png"))); // NOI18N
        combo.setText("COMBOS");
        combo.setBorder(null);
        combo.setBorderPainted(false);
        combo.setContentAreaFilled(false);
        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        combo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combo.setIconTextGap(-1);
        combo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/comb 2.png"))); // NOI18N
        combo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/comb 1.png"))); // NOI18N
        combo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        combo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo);
        combo.setBounds(220, 20, 130, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-30, 0, 550, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        MENU M = new MENU ();
        M.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        
        combos C = new combos ();
        C.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_comboActionPerformed

    private void canchitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canchitaActionPerformed
       
        canchita C = new canchita ();
        C.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_canchitaActionPerformed

    private void bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidasActionPerformed
       
        BEBIDAS_PRINCIPAL B = new BEBIDAS_PRINCIPAL ();
        B.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bebidasActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        hot_dog H = new hot_dog ();
        H.setVisible(true);
        H.setLocationRelativeTo(null);    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
        dulces D = new dulces ();
        D.setVisible(true);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        pagando P = new pagando ();
        P.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new snacks().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bebidas;
    public static javax.swing.JButton canchita;
    private javax.swing.JButton combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
