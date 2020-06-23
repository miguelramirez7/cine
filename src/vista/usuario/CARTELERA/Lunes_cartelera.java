
package vista.usuario.CARTELERA;

import DAO.factoria.DAOFactory;
import DAO.interfaces.IPeliculaDao;
import Modelo.Pelicula;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.usuario.inicio.MENU;
import vista.usuario.CARTELERA.SINOPSIS.alicia;
import vista.usuario.CARTELERA.SINOPSIS.el_conjuro;

public class Lunes_cartelera extends javax.swing.JFrame {

    public Lunes_cartelera() {
        initComponents();
        
        //setVisible(true);
        setLocationRelativeTo(null);
        setTitle(" CARTELERA ");
        setResizable(false);
        IPeliculaDao peliculaDAO=DAOFactory.getInstance().getPeliculaDao();
        ArrayList<Pelicula> listapelis= peliculaDAO.listarPeliculas();
        
        for(int i =0; i<listapelis.size(); i++){
            if(i==0){
                nombrePelicula1.setText(listapelis.get(i).getNombre());
            }else{
                if(i==1){
                    nombrePelicula2.setText(listapelis.get(i).getNombre());
                }else{
                    if(i==2){
                        nombrePelicula3.setText(listapelis.get(i).getNombre());
                    }else{
                        //nombrePelicula4.setText(listapelis.get(i).getNombre());
                    }
                }
            }
            
//            System.out.println(listapreg1.get(i)); 
//            Object [] row = {listapreg1.get(i)};
//            tabla.addRow(row);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotoPelicula4 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        nombrePelicula3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        nombrePelicula2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fotoPelicula1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fotoPelicula2 = new javax.swing.JLabel();
        fotoPeli3 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        nombrePelicula1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fotoPelicula4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
        getContentPane().add(fotoPelicula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 180, 270));

        jButton26.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton26.setText("SINOPSIS");
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setIconTextGap(-3);
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 2.png"))); // NOI18N
        jButton26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 100, 80));

        nombrePelicula3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nombrePelicula3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombrePelicula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 140, 20));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("2D Doblaba");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 80, -1));

        jButton11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton11.setText("SINOPSIS");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setIconTextGap(-3);
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 2.png"))); // NOI18N
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 80));

        nombrePelicula2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nombrePelicula2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombrePelicula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, 20));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("2D Doblaba");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 80, -1));

        fotoPelicula1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
        getContentPane().add(fotoPelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 260));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras G.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(589, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        fotoPelicula2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
        getContentPane().add(fotoPelicula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 180, 260));

        fotoPeli3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
        getContentPane().add(fotoPeli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, 270));

        jButton27.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton27.setText("SINOPSIS");
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setIconTextGap(-3);
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 2.png"))); // NOI18N
        jButton27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 100, 80));

        jButton28.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton28.setText("SINOPSIS");
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setIconTextGap(-3);
        jButton28.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 2.png"))); // NOI18N
        jButton28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/SI 1.png"))); // NOI18N
        jButton28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 100, 80));

        nombrePelicula1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nombrePelicula1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombrePelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 130, 20));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("2D Doblaba");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/CARTELERA/imagenes/fondos-de-pantalla-azul-infinito.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -1150, 870, 1800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MENU M = new MENU();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        el_conjuro E = new el_conjuro();
        E.setVisible(true);
        dispose();
      

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
       
       alicia A = new alicia ();
       A.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

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
            java.util.logging.Logger.getLogger(Lunes_cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lunes_cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lunes_cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lunes_cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Lunes_cartelera().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fotoPeli3;
    private javax.swing.JLabel fotoPelicula1;
    private javax.swing.JLabel fotoPelicula2;
    private javax.swing.JLabel fotoPelicula4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombrePelicula1;
    private javax.swing.JLabel nombrePelicula2;
    private javax.swing.JLabel nombrePelicula3;
    // End of variables declaration//GEN-END:variables
}
