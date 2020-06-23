/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.ISalaDao;
import Modelo.Sala;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public class SalaDao implements ISalaDao{
    private AccesoDb db;
    public SalaDao() {
         db=new AccesoDb();
    }

    @Override
    public ArrayList<Sala> listarSalas() {
        
        ArrayList<Sala> lista = new  ArrayList<Sala>();
        String procedimientoAlmacenado="CALL sp_listasalas()";
        Connection cn=db.getConnection();
        if(cn!=null){
            
            try{
                
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                ResultSet rs=cs.executeQuery();
                while(rs.next()){
                    
                    Sala sal=new Sala();
                    sal.setIdSala(rs.getInt("idsala"));
                    sal.setCantidadButacas(rs.getInt("cantidadbutacas"));
                    sal.setNumeroPiso(rs.getInt("numeropiso"));
                   
                    lista.add(sal);
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
    public String insertarSala(Sala sala) {
        
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertarsala(?,?,?)";
        if(cn!=null){
            try{
                
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                cs.setInt(1,sala.getIdSala());
                cs.setInt(2,sala.getCantidadButacas());
                cs.setInt(3,sala.getNumeroPiso());
               
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
    public String actualizarSala(Sala sala) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_actualizarsala(?,?,?)";
        if(cn!=null){
            try{
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                cs.setInt(1,sala.getIdSala());
                cs.setInt(2,sala.getCantidadButacas());
                cs.setInt(3,sala.getNumeroPiso());
               
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
    public String eliminarSala(Sala sala) {
    return null;
       
    }

    @Override
    public Sala datosSala(String id) {
        Sala sal=new Sala();
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_datossala(?)";
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,id);
               ResultSet rs=cs.executeQuery();
               if(rs.next()){
                   sal.setIdSala(rs.getInt("idsala"));
                   sal.setCantidadButacas(rs.getInt("cantidadbutacas"));
                   sal.setNumeroPiso(rs.getInt("numeropiso"));
                   
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return sal;    
    }

    
}
