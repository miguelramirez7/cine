/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.IPromocionesDao;
import Modelo.Promociones;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public class PromocionesDao implements IPromocionesDao{
private AccesoDb db;
    public PromocionesDao() {
         db=new AccesoDb();
    }

    @Override
    public ArrayList<Promociones> listarPreomociones() {
        ArrayList<Promociones> lista = new  ArrayList<Promociones>();
        String procedimientoAlmacenado="CALL sp_listarpromociones()";
        Connection cn=db.getConnection();
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               ResultSet rs=cs.executeQuery();
               while(rs.next()){
                   Promociones prom=new Promociones();
                   prom.setIdPromociones(rs.getInt("idPromociones"));
                   prom.setNombre(rs.getString("nombre"));
                   prom.setDescripcion(rs.getString("descripcion"));   
                   prom.setPreciototal(rs.getFloat("preciototal"));
                   
                   lista.add(prom);
                   
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
    public String insertarPromociones(Promociones  promociones) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertarpromociones(?,?,?,?)";
        if(cn!=null){
            try{

               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setInt(1,promociones.getIdPromociones());
               cs.setString(2,promociones.getNombre());
               cs.setString(3,promociones.getDescripcion());
               cs.setFloat(4,promociones.getPreciototal());

               
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
    public String actualizarPromociones(Promociones  promociones) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_actualizarpromociones(?,?,?,?)";
       if(cn!=null){
           try{
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                cs.setInt(1,promociones.getIdPromociones());
                cs.setString(2,promociones.getNombre());
                cs.setString(3,promociones.getDescripcion());
                cs.setFloat(4,promociones.getPreciototal());
               
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
    public String eliminarPromociones(Promociones Promociones) {
    return null;
        
    }

    @Override
    public Promociones datosPromociones(String id) {
        Promociones prom=new Promociones();
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_datospromosiones(?)";
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,id);
               ResultSet rs=cs.executeQuery();
               if(rs.next()){
                   prom.setIdPromociones(rs.getInt("idPromociones"));
                   prom.setNombre(rs.getString("nombre"));
                   prom.setDescripcion(rs.getString("descripcion"));   
                   prom.setPreciototal(rs.getFloat("preciototal"));
                   
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return prom;     
    }

    
    
}