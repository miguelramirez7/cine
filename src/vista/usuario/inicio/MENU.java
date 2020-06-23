
package vista.usuario.inicio;

//import proyectos.CARTELERA.peliculas;

import vista.portada;
import vista.usuario.CARTELERA.peliculas;

//import proyectos.inicio.ASIENTOS.grafico;

public class MENU extends javax.swing.JFrame {

    public MENU() {
        initComponents();
        
        //setVisible(true);
        setLocationRelativeTo(null);
        setTitle( " MENU PRINCIPAL --- CINE FISI ");
        setResizable(false);         
       
             
    }         
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        snacks = new javax.swing.JButton();
        cartelera = new javax.swing.JButton();
        proximamente = new javax.swing.JButton();
        nuestros_cines = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(405, 582));
        getContentPane().setLayout(null);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras G.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras pe.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/atras G.png"))); // NOI18N
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 480, 60, 50);

        snacks.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        snacks.setForeground(new java.awt.Color(255, 255, 255));
        snacks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/CORN.png"))); // NOI18N
        snacks.setText("SNACKS");
        snacks.setBorder(null);
        snacks.setBorderPainted(false);
        snacks.setContentAreaFilled(false);
        snacks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snacks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        snacks.setIconTextGap(-3);
        snacks.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/CORN P.png"))); // NOI18N
        snacks.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/CORN.png"))); // NOI18N
        snacks.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        snacks.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        snacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacksActionPerformed(evt);
            }
        });
        getContentPane().add(snacks);
        snacks.setBounds(60, 260, 120, 140);

        cartelera.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cartelera.setForeground(new java.awt.Color(255, 255, 255));
        cartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/CART.png"))); // NOI18N
        cartelera.setText("CARTELERA");
        cartelera.setBorder(null);
        cartelera.setBorderPainted(false);
        cartelera.setContentAreaFilled(false);
        cartelera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartelera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cartelera.setIconTextGap(-3);
        cartelera.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/CARM.png"))); // NOI18N
        cartelera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/CART.png"))); // NOI18N
        cartelera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cartelera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carteleraActionPerformed(evt);
            }
        });
        getContentPane().add(cartelera);
        cartelera.setBounds(50, 60, 120, 120);

        proximamente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        proximamente.setForeground(new java.awt.Color(255, 255, 255));
        proximamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/ESTRE.png"))); // NOI18N
        proximamente.setText("PROXIMAMENTE");
        proximamente.setBorder(null);
        proximamente.setBorderPainted(false);
        proximamente.setContentAreaFilled(false);
        proximamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proximamente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proximamente.setIconTextGap(-3);
        proximamente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/ESTRE P.png"))); // NOI18N
        proximamente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/ESTRE.png"))); // NOI18N
        proximamente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        proximamente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        proximamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximamenteActionPerformed(evt);
            }
        });
        getContentPane().add(proximamente);
        proximamente.setBounds(230, 40, 140, 150);

        nuestros_cines.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nuestros_cines.setForeground(new java.awt.Color(255, 255, 255));
        nuestros_cines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/map-map-marker-icon.png"))); // NOI18N
        nuestros_cines.setText("NUESTROS CINES");
        nuestros_cines.setBorder(null);
        nuestros_cines.setBorderPainted(false);
        nuestros_cines.setContentAreaFilled(false);
        nuestros_cines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuestros_cines.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuestros_cines.setIconTextGap(-3);
        nuestros_cines.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/map-map-marker-icon (1).png"))); // NOI18N
        nuestros_cines.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/map-map-marker-icon.png"))); // NOI18N
        nuestros_cines.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nuestros_cines.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuestros_cines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuestros_cinesActionPerformed(evt);
            }
        });
        getContentPane().add(nuestros_cines);
        nuestros_cines.setBounds(230, 250, 140, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -30, 410, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        portada P = new portada();
        P.setVisible(true);
        dispose ();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void snacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snacksActionPerformed

        snacks S = new snacks ();
        S.setVisible(true);
        dispose();
    }//GEN-LAST:event_snacksActionPerformed

    private void carteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carteleraActionPerformed
 
        peliculas  P = new peliculas();
        P.setVisible(true);
        dispose();

    }//GEN-LAST:event_carteleraActionPerformed

    private void proximamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximamenteActionPerformed

        estreno1 E = new estreno1();
        E.setVisible(true);
        dispose();

    }//GEN-LAST:event_proximamenteActionPerformed

    private void nuestros_cinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuestros_cinesActionPerformed

        cines_locales C = new cines_locales ();
        C.setVisible(true);
        dispose();

    }//GEN-LAST:event_nuestros_cinesActionPerformed

              
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new MENU().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton cartelera;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuestros_cines;
    public static javax.swing.JButton proximamente;
    public static javax.swing.JButton snacks;
    // End of variables declaration//GEN-END:variables

    private snacks snacks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
