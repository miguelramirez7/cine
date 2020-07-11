
package vista.usuario.FORMA_DE_PAGO;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Conexion.AccesoDb;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import vista.usuario.inicio.boleto;


public class pagando extends javax.swing.JFrame {

    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection();
    
    double tota,suma=0;
    String lab;
    
    public pagando() {
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle(" PAGANDO ");
        setResizable(false);
        pagoTotal ();
        mostrartabla_SNACKS ();
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
           LABEL_TOTAL.setText(lab);
            
        } catch (Exception e) {
        }
       }
    
    
      void mostrartabla_SNACKS () // PARA LOS SNACKS
    {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    modelo.addColumn(" DESCRIPCION ");
    modelo.addColumn(" TOTAL ");
    
    TABLA_MOSTRAR.setModel(modelo);
    
    String sql = "SELECT * FROM total_a_pagar";
   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                
            Vector datos= new Vector();
            datos.add(rs.getString(1));
            datos.add(rs.getInt(2));
           
            
            modelo.addRow(datos);
            TABLA_MOSTRAR.setModel(modelo);
            }          
            
        } catch (Exception e) {
        }
   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_MOSTRAR = new javax.swing.JTable();
        LABEL_TOTAL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        CONTRA = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_num = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(380, 490));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/masterCard1.png"))); // NOI18N
        jButton2.setText("PAGAR CON MASTERCARD");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/masterCard2.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/masterCard1.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 360, 180, 80);

        TABLA_MOSTRAR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABLA_MOSTRAR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 350, 220);

        LABEL_TOTAL.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LABEL_TOTAL.setForeground(new java.awt.Color(0, 0, 255));
        LABEL_TOTAL.setText("0");
        getContentPane().add(LABEL_TOTAL);
        LABEL_TOTAL.setBounds(130, 10, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 110, 20);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(120, 10, 80, 20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(180, 420, 170, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Visa1.png"))); // NOI18N
        jButton1.setText("PAGAR CON VISA");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/visa2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Visa1.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 360, 107, 80);
        getContentPane().add(CONTRA);
        CONTRA.setBounds(180, 310, 160, 20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 420, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DIGITOS DE CONTROL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 310, 120, 20);

        txt_num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numActionPerformed(evt);
            }
        });
        getContentPane().add(txt_num);
        txt_num.setBounds(180, 280, 160, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUMERO DE TARJETA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 280, 120, 20);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 270, 350, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 0, 410, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       String numT = txt_num.getText();
       String contra = CONTRA.getText();
       
       boleto B = new boleto ();
       
       if ( numT.equals("112233445566") && contra.equals("123456") || 
            numT.equals("223344556677") && contra.equals("123456")||
            numT.equals("334455667788") && contra.equals("123456"))
       {
            JOptionPane.showMessageDialog(null," TRANSACCION EXITOSA ");   
            B.setVisible(true);
            dispose();
       } 
       
       else 
       {
            
         JOptionPane.showMessageDialog(null," NO SE ENCONTRO REGISTRO  "+ "\n" + " VERIFIQUE SI CONTRASEÑA O NUMERO DE TARJETA ");  
       }
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String numT1 = txt_num.getText();
       String contra1 = CONTRA.getText();
       boleto B = new boleto ();
       
       if ( numT1.equals("445566778899") && contra1.equals("14200185") || 
            numT1.equals("556677889900") && contra1.equals("14200185")||
            numT1.equals("667788990011") && contra1.equals("14200185"))
       {
           JOptionPane.showMessageDialog(null," TRANSACCION EXITOSA ");   
           B.setVisible(true);
           dispose();
       }
       
       else 
       {
            
         JOptionPane.showMessageDialog(null," NO SE ENCONTRO REGISTRO " + "\n" + " VERIFIQUE SI CONTRASEÑA O NUMERO DE TARJETA ");  
       }
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numActionPerformed
       
        
        
        
    }//GEN-LAST:event_txt_numActionPerformed

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
            java.util.logging.Logger.getLogger(pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagando().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField CONTRA;
    private javax.swing.JLabel LABEL_TOTAL;
    private javax.swing.JTable TABLA_MOSTRAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txt_num;
    // End of variables declaration//GEN-END:variables
}
