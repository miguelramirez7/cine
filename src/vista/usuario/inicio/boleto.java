
package vista.usuario.inicio;

import vista.portada;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.usuario.inicio.snack.dulces;

public class boleto extends javax.swing.JFrame {

    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection();
    double tota,suma=0;
    String lab;
    String but;
    int num;
    String nombre;
    
    public boleto() {
        initComponents();
        
        setLocationRelativeTo(null);
        setTitle(" GRACIAS POR SU COMPRA ");
        setResizable(false);
        
        mostrartabla_ENTRADAS();
        mostrartabla_SNACKS();
        pagoTotal();
        BUTACAS() ;
        PELICULINA();
    }
    
    
    

    void mostrartabla_SNACKS () // PARA LOS SNACKS
    {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    modelo.addColumn(" DESCRIPCION ");
    modelo.addColumn(" PRECIO ");
    modelo.addColumn(" CANT ");
    modelo.addColumn(" TOTAL ");
    
    tablaDatos.setModel(modelo);
    
    String sql = " SELECT * FROM pedidos_de_clientes ";
   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
            Vector dato= new Vector();
            dato.add(rs.getString(1));
            dato.add(rs.getDouble(2));
            dato.add(rs.getInt(3));
            dato.add(rs.getDouble(4));
            
            modelo.addRow(dato);
            tablaDatos.setModel(modelo);
            }
           
            
        } catch (Exception e) {
        }
   
    }
   // ----------------------------------------------------------
   // ----------------------------------------------------------
   // ----------------------------------------------------------
    
     void mostrartabla_ENTRADAS ()   // PARA LAS ENTRADAS
    {
    
    DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn(" DESCRIPCION ");
    model.addColumn(" PRECIO ");
    model.addColumn(" CANTIDAD ");
    model.addColumn(" TOTAL ");
    tabla_entradas.setModel(model);
    
    String sql = " SELECT * FROM entradas_cantidad ";
   
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next())
            {
            Vector datos= new Vector();
            datos.add(r.getString(1));
            datos.add(r.getString(2));
            datos.add(r.getInt(3));
            datos.add(r.getInt(4));
            model.addRow(datos);
            
            }
            tabla_entradas.setModel(model);
            
        } catch (Exception e) {
        }
   
        // ----------------------------------------------------------
   // ----------------------------------------------------------
   // ----------------------------------------------------------
     } 
    void pagoTotal ()   // PARA LAS ENTRADAS
    {
        
    String sql = " SELECT * FROM total_a_pagar ";
   
   
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next())
            {                
             tota = r.getDouble("precioT");
             suma = suma + tota;
             
            }
            
            lab = String.valueOf(suma);
            pagar_label.setText(lab);
            
        } catch (Exception e) {
        }
         
    }
    
    
    void BUTACAS ()   // PARA LAS ENTRADAS
    {
        
     DefaultTableModel mode = new DefaultTableModel();
    
    mode.addColumn(" BUTACA ");
    mode.addColumn(" NUMERO ");
    
     BUTACAS_TABLA.setModel(mode); 
        
    String sql = " SELECT * FROM butaca_actual ";
   
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next())
            {                
               Vector dat= new Vector();
            dat.add(r.getString(1));
            dat.add(r.getInt(2));
               
              mode.addRow(dat);            
            }
            
             BUTACAS_TABLA.setModel(mode);
                                                
        } catch (Exception e) {
        }
      }
    
    
    // ----------------------------------------------------------
   // ----------------------------------------------------------
       void PELICULINA ()   // PARA LAS ENTRADAS
    {
        
    String sql = " SELECT * FROM pelicula ";
   
   
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next())
            {                
            nombre = r.getString("NOMBRE");
                         
            }
            
           pelicula.setText(nombre);
            
        } catch (Exception e) {
        }
         
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pelicula = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        BUTACAS_TABLA = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_entradas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pagar_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(415, 690));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/cd.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 150, 152);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("BUTACAS:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 50, 80, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PELICULA:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 10, 70, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("TOTAL  PAGADO :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 560, 120, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("SNACKS:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 310, 80, 15);

        pelicula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(pelicula);
        pelicula.setBounds(190, 20, 190, 30);

        BUTACAS_TABLA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BUTACAS_TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(BUTACAS_TABLA);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(180, 70, 210, 120);

        jLabel7.setText("----------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 180, 380, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ENTRADAS:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 190, 80, 15);

        tabla_entradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_entradas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 380, 90);

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDatos.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(tablaDatos);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 330, 380, 210);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Printing1.png"))); // NOI18N
        jButton1.setText("imprimir");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Printing2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Printing1.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 550, 80, 60);

        pagar_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pagar_label.setText("0");
        jPanel1.add(pagar_label);
        pagar_label.setBounds(300, 560, 70, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 420, 630);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    ///// PARA BUTACA ACTUAL ******************************
        try {        
            PreparedStatement M = cn.prepareStatement("DELETE FROM butaca_actual");         
            M.executeUpdate(); // para actualizar la BD
            System.out.println(" ELIMINADO ");
        
        } catch (SQLException ex) {
        
            Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
            
        
         // PARA ENTRADAS CANTIDAD **********************
        try {       
            PreparedStatement M = cn.prepareStatement("DELETE FROM entradas_cantidad");
                 
      M.executeUpdate(); // para actualizar la BD
      
       System.out.println(" ELIMINADO ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
        
        
        // PARA PEDIDOS DE CLIENTES *********************
        
        try {       
      PreparedStatement M = cn.prepareStatement
        ("DELETE FROM pedidos_de_clientes");
                 
      M.executeUpdate(); // para actualizar la BD
      
       System.out.println(" ELIMINADO ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
         
       
        // PARA PELICULA NOMBRE  ********************
        
        try {       
      PreparedStatement M = cn.prepareStatement
        ("DELETE FROM pelicula");
                 
      M.executeUpdate(); // para actualizar la BD
      
       System.out.println(" ELIMINADO ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
          
        
        
       // PARA TOTAL A PAGAR **************************** 
        
        try {       
      PreparedStatement M = cn.prepareStatement
        ("DELETE FROM total_a_pagar ");
                 
      M.executeUpdate(); // para actualizar la BD
      
       JOptionPane.showMessageDialog(null," IMPRIMIENDO ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
        
        
        portada P= new portada ();
        P.setVisible(true);
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
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new boleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BUTACAS_TABLA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel pagar_label;
    private javax.swing.JLabel pelicula;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTable tabla_entradas;
    // End of variables declaration//GEN-END:variables
}
