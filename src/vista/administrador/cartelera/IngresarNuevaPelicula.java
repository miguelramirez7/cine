/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.administrador.cartelera;

import Conexion.AccesoDb;
import DAO.factoria.DAOFactory;
import DAO.interfaces.IPeliculaDao;
import Modelo.Pelicula;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.portada;

/**
 *
 * @author Patty
 */
public class IngresarNuevaPelicula extends javax.swing.JFrame {

   
    AccesoDb con =new AccesoDb();
    Connection cn;
    Statement st;
    
    DefaultTableModel tabla = new DefaultTableModel();
    private static String titulo="";
    public IngresarNuevaPelicula() {
        initComponents();
        setLocationRelativeTo(null);
        
        //tabla.addColumn("");
        tabla.addColumn("Nombre");
        tabla.addColumn("Estado");

        //TableColumn sportColumn = tabla.g
        this.jTable1.setModel(tabla);
        IPeliculaDao peliculaDao=DAOFactory.getInstance().getPeliculaDao();
        ArrayList<Pelicula> listaPelicula= peliculaDao.listarPeliculas();
        
        for(int i =0; i<listaPelicula.size(); i++){
            String estado="";
            //System.out.println(listaPelicula.get(i).getNombre());
            if(listaPelicula.get(i).getEstado()==1){
                estado="En cartelera";
            }else{
                estado="Inactiva";
            }
            Object [] row = {listaPelicula.get(i).getNombre(),estado};
            tabla.addRow(row);
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomreg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Peliculas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Criterios de Busqueda");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, -1));

        nomreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomregActionPerformed(evt);
            }
        });
        getContentPane().add(nomreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 260, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/buscar_2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 40));

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/anular.jpg"))); // NOI18N
        jButton3.setText("Anular");
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/anular_2.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nombre", "Estado"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 380, 420));

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/nuevo.png"))); // NOI18N
        jButton4.setText("Nuevo");
        jButton4.setContentAreaFilled(false);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/nuevo_2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 120, -1));

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/editar.jpg"))); // NOI18N
        jButton5.setText("Editar");
        jButton5.setContentAreaFilled(false);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/editar_2.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 120, -1));

        jButton7.setText("Regresar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/fondo.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int filaselect= jTable1.getSelectedRow();
       if(filaselect == -1){
           JOptionPane.showMessageDialog(null,"Pelicula NO selecionada");
       }else {
       
        IPeliculaDao peliculaDaoZ=DAOFactory.getInstance().getPeliculaDao();
        ArrayList<Pelicula> listarPelicula= peliculaDaoZ.listarPeliculas();
        
        for(int i =0; i<listarPelicula.size(); i++){
            String nombusc= listarPelicula.get(i).getNombre();
            String estado="";
            String categori="";
            //System.out.println(listaPelicula.get(i).getNombre());
            
            if(listarPelicula.get(i).getIdCategoriaPelicula()==1){
                categori="Infantil";
            }            
            if(listarPelicula.get(i).getIdCategoriaPelicula()==2){
                categori="Drama";
            }
            if(listarPelicula.get(i).getIdCategoriaPelicula()==3){
                categori="Accion";
            }
            
            if(listarPelicula.get(i).getEstado()==1){
                estado="En cartelera";
            }else{
                estado="Inactiva";
            }
            
            
            if(nombusc.equals(nomreg.getText())){
               JOptionPane.showMessageDialog(null,"Pelicula: "+nombusc + "\n "+ "Categoria: "+ categori + "\n " + "Sinopsis: "+listarPelicula.get(i).getResenia()+"\n " + "Estado: " + estado) ;
            }
            
        }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setTitulo("Nueva Pelicula");
        NuevaPelicula vista = new NuevaPelicula();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
       int filaselect= jTable1.getSelectedRow();
       if(filaselect == -1){
           JOptionPane.showMessageDialog(null,"Pelicula NO selecionada");
       }else {
            this.setTitulo("Editar Pelicula");
            EditarPelicula vista = new EditarPelicula();
            vista.setVisible(true);
            EditarPelicula.nompel.setText(nomreg.getText());
       }
        
          
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int filaselect= jTable1.getSelectedRow();
       if(filaselect == -1){
           JOptionPane.showMessageDialog(null,"Pelicula NO selecionada");
       }else {
           String sql = "call sp_anularpelicula('"+nomreg.getText()+"')";
           try{
           cn=con.getConnection();
           st=cn.createStatement();
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Pelicula Anulada");
           }catch(Exception e){
           }
       }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        portada P = new portada();
        P.setVisible(true);
        dispose ();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int fila= jTable1.getSelectedRow();
       if(fila == -1){
           JOptionPane.showMessageDialog(null,"Pelicula NO selecionada");
       }else {
           String nom = (String)jTable1.getValueAt(fila,0);
           nomreg.setText(nom);
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void nomregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomregActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarNuevaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarNuevaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarNuevaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarNuevaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarNuevaPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomreg;
    // End of variables declaration//GEN-END:variables

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
