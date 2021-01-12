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
    
    Connection cn;
            
    
    public AccesoDb(){   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/cine?characterEncoding=utf8","root","");
           
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de COnexion");
            JOptionPane.showMessageDialog(null, "Error de conexion BD ==> "+e);
        }
    }
    
    public Connection getConnection(){
     
        return cn;
    }
    
}
