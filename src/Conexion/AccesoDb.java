/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
//import oracle.jdbc.driver.OracleDriver;
/**
 *
 * @author Patty
 */
public class AccesoDb {
    public Connection getConnection(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/cine","root","root");
            //DriverManager.registerDriver(new OracleDriver());
            //cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","cine","cine2");
            System.out.println("Conexion Establecida");
            JOptionPane.showMessageDialog(null, "Conexion establecida");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de COnexion");
            JOptionPane.showMessageDialog(null, "Error de conexion"+e);
        }
        return cn;
    }
    public AccesoDb(){
        
    }
}
