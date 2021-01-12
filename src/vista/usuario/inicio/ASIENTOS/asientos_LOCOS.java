
package vista.usuario.inicio.ASIENTOS;

//import BASE_DE_DATOS.conexion;
import Conexion.AccesoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.usuario.inicio.snack.dulces;
import vista.usuario.inicio.snacks;
//import proyectos.inicio.snacks;



public class asientos_LOCOS extends javax.swing.JFrame {

    AccesoDb cC = new AccesoDb ();
    Connection cn = cC.getConnection();
    
     
    String a = "A";
     String b = "B";
      String c = "C";
       String d = "D";
        String e = "E";
         String f = "F";
          String g = "G";
           String h = "H";
            String i = "I";
             String j = "J";
              String k = "K";
               String l = "L";
                String m = "M";
          
    int Ba,Bb,Bc,Bd,Be,Bf,Bg,Bh,Bi,Bj,Bk,Bl,Bm;  // que guarde los numeros de las butacas
    int entradas,sum;
      
    public asientos_LOCOS() {
        initComponents();
        
        //setVisible(true);
        setLocationRelativeTo(null);
        setTitle(" ESCOJIENDO BUTACAS ");
        setResizable(false);
        mostrartabla_BUTACAS();
        CANTIDAD_BUTACAS();        
    }

     void CANTIDAD_BUTACAS ()   // PARA LA CANTIDAD DE BUTACAS
    {
        
    String sql = " SELECT * FROM entradas_cantidad ";
   
   
        try {
            Statement s = cn.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next())
            {                
             entradas = r.getInt("cantidad");
             sum = sum + entradas;   
            }
            
           String lab = String.valueOf(sum);
            NUMERO_DE_BUTACAS_A_SELECCIOANR.setText(lab);
            
        } catch (Exception e) {
        }
         
    }
    
    
    
    void mostrartabla_BUTACAS() // PARA LOS SNACKS
    {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    modelo.addColumn(" BUTACA ");
    modelo.addColumn(" NUMERO");
    
       
    DATOS_TABLA.setModel(modelo);
    
    String sql = " SELECT * FROM pelicula4_butacas";
        
    String datos [] = new String [2];
   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {                 
            datos[0] = rs.getString(2);
            datos[1] = rs.getString(3);
                
            modelo.addRow(datos);
            
            }
            DATOS_TABLA.setModel(modelo);
            
        } catch (Exception e) {
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel531 = new javax.swing.JLabel();
        NUMERO_DE_BUTACAS_A_SELECCIOANR = new javax.swing.JLabel();
        jLabel530 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        I = new javax.swing.JComboBox();
        J = new javax.swing.JComboBox();
        K = new javax.swing.JComboBox();
        L = new javax.swing.JComboBox();
        M = new javax.swing.JComboBox();
        jButton334 = new javax.swing.JButton();
        jButton338 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DATOS_TABLA = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        H = new javax.swing.JComboBox();
        G = new javax.swing.JComboBox();
        F = new javax.swing.JComboBox();
        E = new javax.swing.JComboBox();
        A = new javax.swing.JComboBox();
        B = new javax.swing.JComboBox();
        B1 = new javax.swing.JComboBox();
        D = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 730));
        setPreferredSize(new java.awt.Dimension(1150, 730));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/inicio/ASIENTOS/sillas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 610);

        jLabel531.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel531.setForeground(new java.awt.Color(0, 51, 255));
        jLabel531.setText("BUTACAS");
        getContentPane().add(jLabel531);
        jLabel531.setBounds(390, 630, 120, 40);

        NUMERO_DE_BUTACAS_A_SELECCIOANR.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        NUMERO_DE_BUTACAS_A_SELECCIOANR.setForeground(new java.awt.Color(255, 0, 102));
        NUMERO_DE_BUTACAS_A_SELECCIOANR.setText("0");
        getContentPane().add(NUMERO_DE_BUTACAS_A_SELECCIOANR);
        NUMERO_DE_BUTACAS_A_SELECCIOANR.setBounds(300, 630, 30, 40);

        jLabel530.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel530.setForeground(new java.awt.Color(0, 51, 255));
        jLabel530.setText("SELECCIONE SUS ");
        getContentPane().add(jLabel530);
        jLabel530.setBounds(50, 630, 210, 40);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 620, 610, 60);

        jPanel3.setBackground(new java.awt.Color(204, 0, 204));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(650, 10, 10, 680);

        I.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        I.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        getContentPane().add(I);
        I.setBounds(672, 600, 50, 21);

        J.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        J.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });
        getContentPane().add(J);
        J.setBounds(732, 600, 50, 21);

        K.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        K.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });
        getContentPane().add(K);
        K.setBounds(792, 600, 50, 21);

        L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        L.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        getContentPane().add(L);
        L.setBounds(852, 600, 50, 21);

        M.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        M.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        getContentPane().add(M);
        M.setBounds(912, 600, 50, 21);

        jButton334.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton334.setForeground(new java.awt.Color(255, 0, 51));
        jButton334.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/siguiente1.png"))); // NOI18N
        jButton334.setText("SIGUIENTE");
        jButton334.setBorder(null);
        jButton334.setBorderPainted(false);
        jButton334.setContentAreaFilled(false);
        jButton334.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton334.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton334.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/siguiente2.png"))); // NOI18N
        jButton334.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/siguiente1.png"))); // NOI18N
        jButton334.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton334.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton334.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton334ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton334);
        jButton334.setBounds(1020, 600, 65, 80);

        jButton338.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton338.setForeground(new java.awt.Color(255, 0, 102));
        jButton338.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton338.setText("GUARDAR BUTACAS");
        jButton338.setBorder(null);
        jButton338.setBorderPainted(false);
        jButton338.setContentAreaFilled(false);
        jButton338.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton338.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton338.setIconTextGap(-3);
        jButton338.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon (1).png"))); // NOI18N
        jButton338.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/inocos/Add-item-icon.png"))); // NOI18N
        jButton338.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton338.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton338.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton338ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton338);
        jButton338.setBounds(750, 630, 120, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("M");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(920, 580, 20, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("L");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(870, 580, 10, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("K");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(810, 580, 10, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("J");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(750, 580, 10, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("I");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(690, 580, 10, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("E");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(690, 530, 10, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("A");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 480, 10, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("B");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 480, 10, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("F");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 530, 10, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("G");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(810, 530, 10, 17);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setText("BUTACAS OCUPADAS");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(830, 20, 220, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("C");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(810, 480, 10, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("D");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(870, 480, 10, 17);

        DATOS_TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(DATOS_TABLA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(672, 40, 470, 430);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("H");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(870, 530, 20, 17);

        H.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        H.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H);
        H.setBounds(852, 550, 50, 21);

        G.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        G.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        getContentPane().add(G);
        G.setBounds(792, 550, 50, 21);

        F.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        F.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        getContentPane().add(F);
        F.setBounds(732, 550, 50, 21);

        E.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        E.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E);
        E.setBounds(672, 550, 50, 21);

        A.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        A.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "*", "*", "*", "*", "*", "*", "*", "*", "*", "12", "13" }));
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A);
        A.setBounds(672, 500, 50, 21);

        B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B);
        B.setBounds(732, 500, 50, 21);

        B1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(790, 500, 50, 21);

        D.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        D.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D);
        D.setBounds(852, 500, 50, 21);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("BUTACAS A SELECCIONADAR");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(930, 490, 190, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectos/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1250, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        Bi = I.getSelectedIndex();

        switch (Bi)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,i);
                M.setInt(2, Bi);

                M.executeUpdate(); // para actualizar la BD

               JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,i);
                M.setInt(2, Bi);

                M.executeUpdate(); // para actualizar la BD

               

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        Bj = J.getSelectedIndex();

        switch (Bj)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,j);
                M.setInt(2, Bj);

                M.executeUpdate(); // para actualizar la BD

                  JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }
            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,j);
                M.setInt(2, Bj);

                M.executeUpdate(); // para actualizar la BD

               

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        Bk = K.getSelectedIndex();

        switch (Bk)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13: case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,k);
                M.setInt(2, Bk);

                M.executeUpdate(); // para actualizar la BD

                  JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,k);
                M.setInt(2, Bk);

                M.executeUpdate(); // para actualizar la BD

                

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        Bl = L.getSelectedIndex();

        switch (Bl)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13: case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,l);
                M.setInt(2, Bl);

                M.executeUpdate(); // para actualizar la BD

                JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,l);
                M.setInt(2, Bl);

                M.executeUpdate(); // para actualizar la BD

              
            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        Bm = M.getSelectedIndex();

        switch (Bm)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:case 14: case 15:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,m);
                M.setInt(2, Bm);

                M.executeUpdate(); // para actualizar la BD

                 JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,m);
                M.setInt(2, Bm);

                M.executeUpdate(); // para actualizar la BD

               
            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_MActionPerformed

    private void jButton334ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton334ActionPerformed

        snacks S = new snacks();
        S.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton334ActionPerformed

    private void jButton338ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton338ActionPerformed
 
        try {        
      PreparedStatement M = cn.prepareStatement
        (" INSERT INTO pelicula (NOMBRE) VALUES(?)");
            
      M.setString(1," LOCOS DE AMOR ");
            
      M.executeUpdate(); // para actualizar la BD
      
       JOptionPane.showMessageDialog(null," DATOS GUARDADOS ");
        
    } catch (SQLException ex) {
        
        Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
        }   
              
    }//GEN-LAST:event_jButton338ActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        Bh = H.getSelectedIndex();

        switch (Bh)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,h);
                M.setInt(2, Bh);

                M.executeUpdate(); // para actualizar la BD

                 JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }
            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,h);
                M.setInt(2, Bh);

                M.executeUpdate(); // para actualizar la BD

              
            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_HActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        Bg = G.getSelectedIndex();

        switch (Bg)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,g);
                M.setInt(2, Bg);

                M.executeUpdate(); // para actualizar la BD

                 JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,g);
                M.setInt(2, Bg);

                M.executeUpdate(); // para actualizar la BD

                
            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_GActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed

        Bf = F.getSelectedIndex();

        switch (Bf)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,f);
                M.setInt(2, Bf);

                M.executeUpdate(); // para actualizar la BD

                  JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }
            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,f);
                M.setInt(2, Bf);

                M.executeUpdate(); // para actualizar la BD

                

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_FActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed

        Be = E.getSelectedIndex();

        switch (Be)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:  case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,e);
                M.setInt(2, Be);

                M.executeUpdate(); // para actualizar la BD

                  JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,e);
                M.setInt(2, Be);

                M.executeUpdate(); // para actualizar la BD

             
            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_EActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed

        Ba = A.getSelectedIndex();

        switch (Ba)
        {
            case 1: case 2: case 12: case 13:

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas(BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,a);
                M.setInt(2, Ba);

                M.executeUpdate(); // para actualizar la BD

                  JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,a);
                M.setInt(2, Ba);

                M.executeUpdate(); // para actualizar la BD

               

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }

    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed

        Bb = B.getSelectedIndex();

        switch (Bb)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13: case 14:

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,b);
                M.setInt(2, Bb);

                M.executeUpdate(); // para actualizar la BD

                 JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,b);
                M.setInt(2, Bb);

                M.executeUpdate(); // para actualizar la BD

                

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }

    }//GEN-LAST:event_BActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Bc = B1.getSelectedIndex();

        switch (Bc)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13:case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,c);
                M.setInt(2, Bc);

                M.executeUpdate(); // para actualizar la BD

                  JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,c);
                M.setInt(2, Bc);

                M.executeUpdate(); // para actualizar la BD

                
            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_B1ActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed

        Bd = D.getSelectedIndex();

        switch (Bd)
        {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
            case 7: case 8: case 9:
            case 10:case 11: case 12:
            case 13 :case 14:
            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO pelicula4_butacas (BUTACA,NUMERO) VALUES(?,?)");

                M.setString(1,d);
                M.setInt(2, Bd);

                M.executeUpdate(); // para actualizar la BD

                  JOptionPane.showMessageDialog(null," SELECCIONADO ");
                mostrartabla_BUTACAS();

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

            ////// PARA SABER QUE BUTACA ELIJE

            try {
                PreparedStatement M = cn.prepareStatement
                (" INSERT INTO butaca_actual (LETRA,NUMERO) VALUES(?,?)");

                M.setString(1,d);
                M.setInt(2, Bd);

                M.executeUpdate(); // para actualizar la BD

               

            } catch (SQLException ex) {

                Logger.getLogger(dulces.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }//GEN-LAST:event_DActionPerformed

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
            java.util.logging.Logger.getLogger(asientos_LOCOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asientos_LOCOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asientos_LOCOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asientos_LOCOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asientos_LOCOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox A;
    private javax.swing.JComboBox B;
    private javax.swing.JComboBox B1;
    private javax.swing.JComboBox D;
    private javax.swing.JTable DATOS_TABLA;
    private javax.swing.JComboBox E;
    private javax.swing.JComboBox F;
    private javax.swing.JComboBox G;
    private javax.swing.JComboBox H;
    private javax.swing.JComboBox I;
    private javax.swing.JComboBox J;
    private javax.swing.JComboBox K;
    private javax.swing.JComboBox L;
    private javax.swing.JComboBox M;
    private javax.swing.JLabel NUMERO_DE_BUTACAS_A_SELECCIOANR;
    public static javax.swing.JButton jButton334;
    private javax.swing.JButton jButton338;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel530;
    private javax.swing.JLabel jLabel531;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
