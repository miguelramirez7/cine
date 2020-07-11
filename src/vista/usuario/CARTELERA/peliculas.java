
package vista.usuario.CARTELERA;

import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import vista.usuario.CARTELERA.Lunes_cartelera;

public class peliculas extends javax.swing.JFrame {
    private AccesoDb db;

    public peliculas() {
        initComponents();
       //setVisible(true);
        setTitle(" BIENVENIDOS ");
        setLocationRelativeTo(null);
        setResizable(false); 
        db=new AccesoDb();
        Connection cn=db.getConnection();
        DefaultComboBoxModel combobox = new DefaultComboBoxModel();
        combobox.addElement("Elige un dia"); 
        try{
            //PreparedStatement ps=cn.prepareStatement("select to_char(sysdate+level-1,'DAY DD') dia from dual connect by level <6");
            PreparedStatement ps1=cn.prepareStatement("SET lc_time_names = 'es_PE'");
            ResultSet rs1=ps1.executeQuery();
            PreparedStatement ps=cn.prepareStatement("select date_format(now(),'%W %d') dia union select date_format(NOW() + INTERVAL 1 DAY,'%W %d')union select date_format(NOW() + INTERVAL 2 DAY,'%W %d')union select date_format(NOW() + INTERVAL 3 DAY,'%W %d')union select date_format(NOW() + INTERVAL 4 DAY,'%W %d')");
            ResultSet rs=ps.executeQuery();
            int i=1;
            while(rs.next()){
                if(i==1){
                    combobox.addElement("Hoy "+rs.getString("dia"));
                }else{
                    if(i==2){
                        combobox.addElement("Mañana "+rs.getString("dia"));
                    }else{
                        combobox.addElement(rs.getString("dia"));
                    }
                }
                i=i+1;
            }
        }catch(SQLException ex){}    
        this.DIAentrar.setModel(combobox);
    }
    
          

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DIAentrar = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(529, 261));
        getContentPane().setLayout(null);

        DIAentrar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        DIAentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIAentrarActionPerformed(evt);
            }
        });
        getContentPane().add(DIAentrar);
        DIAentrar.setBounds(150, 110, 200, 30);

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("¿ QUE DIA QUIERES IR ?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 70, 240, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/CARTELERA/imagenes/fondo_minions.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DIAentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIAentrarActionPerformed
       
        int i = DIAentrar.getSelectedIndex();
        
       switch (i)
       {
           case 0:    
           case 2:  
           case 3: 
           case 4: 
           case 5:
           case 6:
           //JOptionPane.showMessageDialog(null, " DIA NO DISPONIBLE ", null, WIDTH);
           //break;
            
           case 1:
            Lunes_cartelera L = new Lunes_cartelera ();
           L.setVisible(true);
           this.dispose();     
           
           break;   
       
       }
       
        
    }//GEN-LAST:event_DIAentrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox DIAentrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
