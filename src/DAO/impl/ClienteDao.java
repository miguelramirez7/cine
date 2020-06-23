/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.IClienteDao;
import Modelo.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public class ClienteDao implements IClienteDao {
  private AccesoDb db;
    public ClienteDao() {
        db=new AccesoDb();
    }

    @Override
    public ArrayList<Cliente> listaCliente() {
       ArrayList<Cliente> lista = new  ArrayList<Cliente>();
       String procedimientoAlmacenado="CALL sp_listarclientes()";
       Connection cn=db.getConnection();
       if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               ResultSet rs=cs.executeQuery();
               while(rs.next()){
                   Cliente cl=new Cliente();
                   cl.setDni(rs.getString("dni"));
                   cl.setNombre(rs.getString("nombre"));
                   cl.setNombre(rs.getString("apellido"));
                   cl.setFechaNaci(rs.getString("fecha_nacimiento"));
                   cl.setTipoCli(rs.getString("tipo_cliente"));
                   lista.add(cl);
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
    public String insertarCliente(Cliente cliente) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertarCliente(?,?,?,?,?)";
        if(cn!=null){
            try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,cliente.getDni());
               cs.setString(2,cliente.getNombre());
               cs.setString(3,cliente.getApellido());
               cs.setString(4,cliente.getFechaNaci());
               cs.setString(5,cliente.getTipoCli());
               
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
    public String actualizarCliente(Cliente cliente) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_actualizarcliente(?,?,?,?,?)";
       if(cn!=null){
           try{
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                cs.setString(1,cliente.getDni());
                cs.setString(2,cliente.getNombre());
                cs.setString(3,cliente.getApellido());
                cs.setString(4,cliente.getFechaNaci());
                cs.setString(5,cliente.getTipoCli());
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
    public Cliente datosCliente(String id) {
        Cliente cli=new Cliente();
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_datoscliente(?)";
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,id);
               ResultSet rs=cs.executeQuery();
               if(rs.next()){
                   cli.setDni(rs.getString("dni"));
                   cli.setNombre(rs.getString("nombre"));
                   cli.setApellido(rs.getString("apellido"));
                   cli.setFechaNaci(rs.getString("fecha_nacimiento"));
                   cli.setTipoCli(rs.getString(" tipo_cliente"));
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return cli;     
    }

}