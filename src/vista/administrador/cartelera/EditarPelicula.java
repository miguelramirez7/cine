/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.administrador.cartelera;

import DAO.factoria.DAOFactory;
import DAO.interfaces.IPeliculaDao;
import Modelo.Pelicula;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import vista.portada;

/**
 *
 * @author EDUARDO
 */
public class EditarPelicula extends javax.swing.JFrame {

    /**
     * Creates new form NuevaPelicula
     */

    public EditarPelicula() {
        initComponents();
        setLocationRelativeTo(null);
        IngresarNuevaPelicula ventana = new IngresarNuevaPelicula();
        
        estipo.setText(ventana.getTitulo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResenia = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtNombreImagen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        nompel = new javax.swing.JLabel();
        catipo = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        categoriat2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        estipo.setForeground(new java.awt.Color(255, 255, 255));
        estipo.setText("En Cartelera");
        getContentPane().add(estipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 110, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reseña(max 700 caracteres):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 40, -1));

        txtResenia.setColumns(20);
        txtResenia.setRows(5);
        jScrollPane1.setViewportView(txtResenia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Imagen:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        getContentPane().add(txtNombreImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 130, -1));

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 100, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 40, -1));

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jButton3.setText("ATRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        nompel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nompel.setForeground(new java.awt.Color(255, 255, 255));
        nompel.setText("Nombre Pelicula");
        getContentPane().add(nompel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        catipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        catipo.setForeground(new java.awt.Color(255, 255, 255));
        catipo.setText("Infantil");
        getContentPane().add(catipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 80, -1));

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText("Editar Pelicula");
        getContentPane().add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 420));

        categoriat2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoriat2.setForeground(new java.awt.Color(255, 255, 255));
        categoriat2.setText("-");
        getContentPane().add(categoriat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivos JPEG(*.JPG;*.JPEG;*.PNG)","jpg","jpeg","png");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Seleccionar imagen");
        int ventana = archivo.showOpenDialog(jLabel1);
        if(ventana==JFileChooser.APPROVE_OPTION){
            File file = archivo.getSelectedFile();
            txtNombreImagen.setText(String.valueOf(file));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        IngresarNuevaPelicula ventana = new IngresarNuevaPelicula();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(nompel.getText()!=null){
            if(txtResenia.getText()!=null){
                if(txtNombreImagen.getText()!=null){        
                    IPeliculaDao peliculaDao=DAOFactory.getInstance().getPeliculaDao();
                    String rpta = peliculaDao.actualizarPelicula(new Pelicula
                                 (nompel.getText(),
                                 Integer.parseInt(cmbCategoria.getSelectedItem().toString()),
                                 txtResenia.getText(),
                                 txtNombreImagen.getText(),
                                 Integer.parseInt(txtEstado.getSelectedItem().toString())));
                                 JOptionPane.showMessageDialog(null, "Pelicula Actualizada");
                        
                }else{
                        JOptionPane.showMessageDialog(null, "El campo Imagen es OBLIGATORIO");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "El campo categoria es OBLIGATORIO");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "El campo nombre es OBLIGATORIO");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        int mest =  Integer.parseInt(txtEstado.getSelectedItem().toString());
        if(mest == 1){
            estipo.setText("En cartelera");
        }
        if(mest == 0){
            estipo.setText("Inactivo");
        }
 
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        int mcat =  Integer.parseInt(cmbCategoria.getSelectedItem().toString());
        if(mcat == 1){
            catipo.setText("Infantil");
        }
        if(mcat == 2){
            catipo.setText("Drama");
        }
        if(mcat == 3){
            catipo.setText("Accion");
        }
    }//GEN-LAST:event_cmbCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoriat2;
    private javax.swing.JLabel catipo;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel estipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo2;
    public static javax.swing.JLabel nompel;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtNombreImagen;
    private javax.swing.JTextArea txtResenia;
    // End of variables declaration//GEN-END:variables
}