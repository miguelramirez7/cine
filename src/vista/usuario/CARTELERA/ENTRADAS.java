
package vista.usuario.CARTELERA;

import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.usuario.inicio.ASIENTOS.Asientos3;
import vista.usuario.inicio.ASIENTOS.Asientos4;
import vista.usuario.inicio.snack.dulces;

public class ENTRADAS extends javax.swing.JFrame {

    AccesoDb C = new AccesoDb ();
    Connection cn = C.getConnection();
    
    String g = " GENERAL MAY 12 ";
    String n = " NIÑOS HASTA 11 ";
    String m = " MAYORES DE 60  ";
    
    String p1 = " S/ 10.00 ";
    String p2 = " S/ 7.00 ";
    String p3 = " S/ 5.00 ";
    
    int a;
    int b;
    int c;
    int res1,res2,res3;
    int fin;
    int can;
    
    public ENTRADAS() {
        initComponents();
         
       // setVisible(true);
        setLocationRelativeTo(null);
        setTitle(" BOLETERIA ");
        setResizable(false);
        Lunes_cartelera ventana = new Lunes_cartelera();
        nombrePeli1.setText(ventana.nomPeli1);
      }
    
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        S1 = new javax.swing.JSpinner();
        S2 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        total_precio = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cantidad_entradas = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        S3 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nombrePeli1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 415));
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
        jButton5.setBounds(420, 10, 60, 50);

        S1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        S1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        S1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S1StateChanged(evt);
            }
        });
        getContentPane().add(S1);
        S1.setBounds(270, 160, 50, 20);

        S2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        S2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        S2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S2StateChanged(evt);
            }
        });
        getContentPane().add(S2);
        S2.setBounds(270, 190, 50, 20);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton3.setText("GUARDAR COMPRA");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Add-item-icon (1).png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 310, 110, 60);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/siguiente1.png"))); // NOI18N
        jButton6.setText("SIGUIENTE");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/siguiente2.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/inocos/siguiente1.png"))); // NOI18N
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(400, 290, 65, 80);

        total_precio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        total_precio.setForeground(new java.awt.Color(255, 255, 255));
        total_precio.setText("0");
        getContentPane().add(total_precio);
        total_precio.setBounds(420, 260, 40, 18);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("S/ ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(400, 260, 20, 18);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("sub total:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(330, 260, 60, 18);

        cantidad_entradas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantidad_entradas.setForeground(new java.awt.Color(255, 255, 255));
        cantidad_entradas.setText("0");
        getContentPane().add(cantidad_entradas);
        cantidad_entradas.setBounds(290, 260, 20, 18);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("S/ ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(400, 220, 20, 18);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("S/ ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(400, 190, 20, 18);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("S/ ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(400, 160, 20, 18);

        precio3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 255, 255));
        precio3.setText("0");
        getContentPane().add(precio3);
        precio3.setBounds(420, 220, 40, 18);

        precio1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 255));
        precio1.setText("0");
        getContentPane().add(precio1);
        precio1.setBounds(420, 160, 40, 18);

        precio2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 255, 255));
        precio2.setText("0");
        getContentPane().add(precio2);
        precio2.setBounds(420, 190, 40, 18);

        jPanel5.setBackground(new java.awt.Color(255, 51, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(330, 260, 60, 20);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(400, 260, 50, 20);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 120, 70, 18);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("S/ 5.00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(190, 220, 40, 18);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/ 7.00");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 190, 40, 18);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("S/ 10.00");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 160, 50, 18);

        S3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        S3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        S3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S3StateChanged(evt);
            }
        });
        getContentPane().add(S3);
        S3.setBounds(270, 220, 50, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mayores de 60 años");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 220, 130, 18);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Niños hasta 11 años");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 190, 130, 18);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("General may 12 años");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 160, 130, 18);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 120, 60, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDAD");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 120, 90, 18);

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(270, 260, 50, 20);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("NUMERO DE ENTRADAS:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(100, 260, 170, 18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PELICULA:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(20, 80, 70, 15);

        nombrePeli1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombrePeli1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombrePeli1);
        nombrePeli1.setBounds(90, 80, 90, 20);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIPO DE BOLETO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 140, 18);

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO A LA BOLETERIA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 30, 320, 40);

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 440, 40);

        jPanel6.setBackground(new java.awt.Color(255, 51, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(90, 260, 170, 20);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 30, 330, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/usuario/imagenes/cines.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-650, -1080, 1180, 1620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Lunes_cartelera L = new Lunes_cartelera();
        L.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

     Asientos3 G = new Asientos3 ();
      G.setVisible(true);
      dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        float tot=Float.parseFloat(total_precio.getText());
        int idTIcket;
        if(a!=0 || b!=0 || c!=0){
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO ticketpelicula (idCartelera,total) VALUES(?,?)");
                M.setInt(1,1);
                M.setFloat(2,tot);
                M.executeUpdate(); // para actualizar la BD
                JOptionPane.showMessageDialog(null," DATOS GUARDADOS ");
                M.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }
        }                
        if ( a !=0){  // PARA EL PRIMERO
            try {        
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO total_a_pagar (producto,precioT) VALUES(?,?)"); 
                M.setString(1,g);
                M.setDouble(2,res1);         
                M.executeUpdate(); // para actualizar la BD     
                System.out.println(" DATOS GUARDADOS ");        
            } catch (SQLException ex) {
                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }      
        }
        if (b!=0){     // PARA EL SEGUNDO
            try {             
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO entradas_cantidad (precio,descripcion,cantidad,total) VALUES(?,?,?,?)");
                M.setString(1,p2);     
                M.setString(2,n);
                M.setInt(3, b);
                M.setInt(4, res2);     
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
                M.setString(1,n);
                M.setDouble(2,res2);    
                M.executeUpdate(); // para actualizar la BD     
                System.out.println(" DATOS GUARDADOS ");
            } catch (SQLException ex) {      
                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }     
        }           
        if (c!=0)  // PARA EL TERCERO
        {    
            try {             
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO entradas_cantidad (precio,descripcion,cantidad,total) VALUES(?,?,?,?)");            
                M.setString(1,p3);
                M.setString(2,m);
                M.setInt(3,c);
                M.setInt(4, res3);               
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
                M.setString(1,m);
                M.setDouble(2,res3);    
                M.executeUpdate(); // para actualizar la BD
                System.out.println(" DATOS GUARDADOS ");
        
            } catch (SQLException ex) {
        
                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }     
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void S1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S1StateChanged
          
       a = (int) S1.getValue();
       b = (int) S2.getValue();
       c = (int) S3.getValue();
       can = a+b+c; 
       
       res1 = a*10;
       res2 = b*7;
       res3 = c*5;
       fin = res1 + res2 + res3;
       
       
      precio1.setText(String.valueOf(res1));
      total_precio.setText(String.valueOf(fin));
      cantidad_entradas.setText(String.valueOf(can));
       
               
    }//GEN-LAST:event_S1StateChanged

    private void S2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S2StateChanged
                       
       a = (int) S1.getValue();
       b = (int) S2.getValue();
       c = (int) S3.getValue();
       can = a+b+c;
       
       res1 = a*10;
       res2 = b*7;
       res3 = c*5;
       fin = res1 + res2 + res3;
       
       precio2.setText(String.valueOf(res2));
       total_precio.setText(String.valueOf(fin));
       cantidad_entradas.setText(String.valueOf(can));
    }//GEN-LAST:event_S2StateChanged

    private void S3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S3StateChanged
       
       a = (int) S1.getValue();
       b = (int) S2.getValue();
       c = (int) S3.getValue();
       can = a+b+c;
       
       res1 = a*10;
       res2 = b*7;
       res3 = c*5;
       fin = res1 + res2 + res3;
       
       precio3.setText(String.valueOf(res3));
       total_precio.setText(String.valueOf(fin));
       cantidad_entradas.setText(String.valueOf(can));
        
    }//GEN-LAST:event_S3StateChanged

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
            java.util.logging.Logger.getLogger(ENTRADAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ENTRADAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ENTRADAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ENTRADAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ENTRADAS().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner S1;
    private javax.swing.JSpinner S2;
    private javax.swing.JSpinner S3;
    private javax.swing.JLabel cantidad_entradas;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel nombrePeli1;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel total_precio;
    // End of variables declaration//GEN-END:variables
}
