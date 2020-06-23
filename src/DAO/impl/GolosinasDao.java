/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.IGolosinasDao;
import Modelo.Golosinas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public class GolosinasDao implements IGolosinasDao{
  private AccesoDb db;
    public GolosinasDao() {
         db=new AccesoDb();
    }

    @Override
    public ArrayList<Golosinas> listaGolosinas() {
       ArrayList<Golosinas> lista = new  ArrayList<Golosinas>();
       String procedimientoAlmacenado="CALL sp_listarcgolosinas()";
       Connection cn=db.getConnection();
       if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               ResultSet rs=cs.executeQuery();
               while(rs.next()){
                   Golosinas gol=new Golosinas();
                   gol.setIdGolosinas(rs.getInt("idGolosinas"));
                   gol.setNombre(rs.getString("nombre"));
                   gol.setTamaño(rs.getString("tamaño"));
                   gol.setPrecio(rs.getFloat("precio"));
                  
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
       return lista;
    }

    @Override
    public String insertarGolosinas(Golosinas golosinas) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertargolosina(?,?,?,?)";
        if(cn!=null){
            try{

               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setInt(1, golosinas.getIdGolosinas());
               cs.setString(2,golosinas.getNombre());
               cs.setString(3,golosinas.getTamaño());
               cs.setFloat(4,golosinas.getPrecio());
               
               int inserto=cs.executeUpdate();
               
               if(inserto==0){
                   rpta="Error";
               }

           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
       return rpta;
    }

    @Override
    public String actualizarGolosinas(Golosinas golosinas) {
      String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_actualizargolosinas(?,?,?,?)";
       if(cn!=null){
           try{
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                cs.setInt(1, golosinas.getIdGolosinas());
                cs.setString(2,golosinas.getNombre());
                cs.setString(3,golosinas.getTamaño());
                cs.setFloat(4,golosinas.getPrecio());
  
                int actualizo=cs.executeUpdate();
                if(actualizo==0){
                       rpta="ERROR";
                }
               
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return rpta; 
    }

    @Override
    public Golosinas datosGolosinas(int idGolosinas) {
       Golosinas gol=new Golosinas();
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_datosgolosina(?)";
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setInt(1,idGolosinas);
               ResultSet rs=cs.executeQuery();
               if(rs.next()){
                   gol.setIdGolosinas(rs.getInt("idGolosinas"));
                   gol.setNombre(rs.getString("nombre"));
                   gol.setTamaño(rs.getString("tamaño"));
                   gol.setPrecio(rs.getFloat("precio"));
                   
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return gol;     
    }

    
}
