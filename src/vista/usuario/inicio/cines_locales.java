
package vista.usuario.inicio;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class cines_locales extends javax.swing.JFrame {

   Icon IMA;
    
    public cines_locales() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle( " NUESROS LOCALES ");
        setResizable(false);    
        IMA = new ImageIcon("src/vista.usuario.imagenes.inocos/map-M.png");
           }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ubi_4 = new javax.swing.JButton();
        ubi_3 = new javax.swing.JButton();
        ubi_2 = new javax.swing.JButton();
        ubi_1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 590));
        getContentPane().setLayout(null);

        C1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setText("CinePAPAYA - LOS OLIVOS");
        getContentPane().add(C1);
        C1.setBounds(250, 120, 150, 14);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras G.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras pe.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras G.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 500, 50, 50);

        ubi_4.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        ubi_4.setForeground(new java.awt.Color(255, 255, 255));
        ubi_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_4.setText("UBICACION");
        ubi_4.setBorder(null);
        ubi_4.setBorderPainted(false);
        ubi_4.setContentAreaFilled(false);
        ubi_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ubi_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ubi_4.setIconTextGap(-4);
        ubi_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB2.png"))); // NOI18N
        ubi_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ubi_4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ubi_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubi_4ActionPerformed(evt);
            }
        });
        getContentPane().add(ubi_4);
        ubi_4.setBounds(120, 430, 73, 90);

        ubi_3.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        ubi_3.setForeground(new java.awt.Color(255, 255, 255));
        ubi_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_3.setText("UBICACION");
        ubi_3.setBorder(null);
        ubi_3.setBorderPainted(false);
        ubi_3.setContentAreaFilled(false);
        ubi_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ubi_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ubi_3.setIconTextGap(-4);
        ubi_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB2.png"))); // NOI18N
        ubi_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ubi_3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ubi_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubi_3ActionPerformed(evt);
            }
        });
        getContentPane().add(ubi_3);
        ubi_3.setBounds(110, 290, 90, 90);

        ubi_2.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        ubi_2.setForeground(new java.awt.Color(255, 255, 255));
        ubi_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_2.setText("UBICACION");
        ubi_2.setBorder(null);
        ubi_2.setBorderPainted(false);
        ubi_2.setContentAreaFilled(false);
        ubi_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ubi_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ubi_2.setIconTextGap(-4);
        ubi_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB2.png"))); // NOI18N
        ubi_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ubi_2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ubi_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubi_2ActionPerformed(evt);
            }
        });
        getContentPane().add(ubi_2);
        ubi_2.setBounds(110, 160, 90, 90);

        ubi_1.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        ubi_1.setForeground(new java.awt.Color(255, 255, 255));
        ubi_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_1.setText("UBICACION");
        ubi_1.setBorder(null);
        ubi_1.setBorderPainted(false);
        ubi_1.setContentAreaFilled(false);
        ubi_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ubi_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ubi_1.setIconTextGap(-5);
        ubi_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB2.png"))); // NOI18N
        ubi_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/UB 1.png"))); // NOI18N
        ubi_1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ubi_1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ubi_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubi_1ActionPerformed(evt);
            }
        });
        getContentPane().add(ubi_1);
        ubi_1.setBounds(110, 30, 90, 90);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 0, 40, 580);

        C2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setText("CinePAPAYA - SMP");
        getContentPane().add(C2);
        C2.setBounds(270, 260, 120, 14);

        C3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setText("CinePAPAYA - ALCAZAR");
        getContentPane().add(C3);
        C3.setBounds(250, 400, 160, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/locales/local 1.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 150, 170, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/locales/LOCAL3.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 290, 170, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/locales/local2.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 20, 160, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/locales/local4.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 430, 170, 100);

        C4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C4.setForeground(new java.awt.Color(255, 255, 255));
        C4.setText("CinePAPAYA - COMAS");
        getContentPane().add(C4);
        C4.setBounds(260, 540, 120, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/cines.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-900, -1070, 1370, 1670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ubi_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubi_1ActionPerformed

         JOptionPane.showMessageDialog(null," Royal Plaza"+"\n"+""+
            "Carlos Alberto Izaguirre 295" +
            " ,Lima ", " CinePAPAYA LOS OLIVOS ",
            JOptionPane.PLAIN_MESSAGE,IMA);

    }//GEN-LAST:event_ubi_1ActionPerformed

    private void ubi_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubi_2ActionPerformed

       
 
        JOptionPane.showMessageDialog(null," CinePAPAYA SMP"+"\n"+
            "nro 7038 7042,"+"\n"+
            "Av Alfredo Mendiola 7026, Lima ", " CinePAPAYA SAN MARTIN DE PORRES ",
            JOptionPane.WARNING_MESSAGE,IMA);
    }//GEN-LAST:event_ubi_2ActionPerformed

    private void ubi_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubi_3ActionPerformed
       
 
        JOptionPane.showMessageDialog(null," CinePAPAYA ALCAZAR "+"\n"
            +" Av. Sta. Cruz 814,"+"\n"
            + "San Isidro 15073 "," CinePAPAYA ALCAZAR ",
            JOptionPane.WARNING_MESSAGE,IMA);
    }//GEN-LAST:event_ubi_3ActionPerformed

    private void ubi_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubi_4ActionPerformed
        
 
        JOptionPane.showMessageDialog(null," CinePAPAYA COMAS "+"\n"
            +" Av Tupac Amaru 3840,"+"\n"+
            "Comas,"," CinePAPAYA COMAS ",
            JOptionPane.WARNING_MESSAGE,IMA);
    }//GEN-LAST:event_ubi_4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MENU M= new MENU ();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(cines_locales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cines_locales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cines_locales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cines_locales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cines_locales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton ubi_1;
    public static javax.swing.JButton ubi_2;
    public static javax.swing.JButton ubi_3;
    public static javax.swing.JButton ubi_4;
    // End of variables declaration//GEN-END:variables
}
