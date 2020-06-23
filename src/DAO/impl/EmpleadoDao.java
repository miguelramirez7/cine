/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.IEmpleadoDao;
import Modelo.Empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public class EmpleadoDao implements IEmpleadoDao {
    private AccesoDb db;

    public EmpleadoDao() {
        db=new AccesoDb();
    }

    @Override
    public ArrayList<Empleado> listaEmpleado() {
       ArrayList<Empleado> lista = new  ArrayList<Empleado>();
       String procedimientoAlmacenado="CALL sp_listarempleados()";
       Connection cn=db.getConnection();
       if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               ResultSet rs=cs.executeQuery();
               while(rs.next()){
                   Empleado emp=new Empleado();
                   emp.setDni(rs.getString("dni"));
                   emp.setNombre(rs.getString("nombre"));
                   emp.setFecha_inicio(rs.getString("apellido"));
                   emp.setFecha_inicio(rs.getString("fecha_inicio"));
                   emp.setFecha_fin(rs.getString("fecha_fin"));
                   emp.setSede(rs.getString("sede"));
                   lista.add(emp);
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
    public String insertarEmpleado (Empleado empleado) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertarempleado(?,?,?,?,?,?)";
        if(cn!=null){
            try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,empleado.getDni());
               cs.setString(2,empleado.getNombre());
               cs.setString(3,empleado.getApellido());
               cs.setString(4,empleado.getFecha_inicio());
               cs.setString(5,empleado.getFecha_fin());
               cs.setString(6,empleado.getSede());
               
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
    public String actualizarEmpleado (Empleado empleado) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_actualizarempleado(?,?,?,?,?,?)";
       if(cn!=null){
           try{
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                cs.setString(1,empleado.getDni());
                cs.setString(2,empleado.getNombre());
                cs.setString(3,empleado.getApellido());
                cs.setString(4,empleado.getFecha_inicio());
                cs.setString(5,empleado.getFecha_fin());
                cs.setString(6,empleado.getSede());
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
    public Empleado datosEmpleado (String id) {
        Empleado emp=new Empleado();
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_datosempleado(?)";
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,id);
               ResultSet rs=cs.executeQuery();
               if(rs.next()){
                   emp.setDni(rs.getString("dni"));
                   emp.setDni(rs.getString("dni"));
                   emp.setNombre(rs.getString("nombre"));
                   emp.setFecha_inicio(rs.getString("apellido"));
                   emp.setFecha_inicio(rs.getString("fecha_inicio"));
                   emp.setFecha_fin(rs.getString("fecha_fin"));
                   emp.setSede(rs.getString("sede"));
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return emp;     
    }
    
}
