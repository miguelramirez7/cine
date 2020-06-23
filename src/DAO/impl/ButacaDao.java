/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.IButacaDao;
import Modelo.Butaca;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public class ButacaDao implements IButacaDao {
    private AccesoDb db;

    public ButacaDao() {
        db=new AccesoDb();
    }
    
   
    @Override
    public ArrayList<Butaca> listaButacas() {
       ArrayList<Butaca> lista = new  ArrayList<Butaca>();
       String procedimientoAlmacenado="CALL sp_listarbutacas()";
       Connection cn=db.getConnection();
       if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               ResultSet rs=cs.executeQuery();
               while(rs.next()){
                   Butaca bt=new Butaca();
                   bt.setNumeroButaca(rs.getString("numeroButaca"));
                   bt.setIdSala(rs.getInt("idsala"));
                   bt.setEstado(rs.getString("estado"));
                   lista.add(bt);
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
    public String actualizarButaca(Butaca butaca) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_actualizarbutaca(?,?,?)";
       if(cn!=null){
           try{
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                cs.setString(1,butaca.getNumeroButaca());
                cs.setInt(2,butaca.getIdSala());
                cs.setString(3,butaca.getEstado());
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
    public Butaca datosButaca(String numButaca, int sala) {
        Butaca but=new Butaca();
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_datosButaca(?,?)";
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,numButaca);
               cs.setInt(2,sala);
               ResultSet rs=cs.executeQuery();
               if(rs.next()){
                   but.setNumeroButaca(rs.getString("numeroButaca"));
                   but.setIdSala(rs.getInt("idsala"));
                   but.setEstado(rs.getString("estado"));
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return but;     
    }

    @Override
    public String insertarButaca(Butaca butaca) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoalmacenado="{CALL sp_insertarButaca(?,?,?)}";
        if(cn!=null){
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacenado);
                cs.setString(1, butaca.getNumeroButaca());
                cs.setInt(2, butaca.getIdSala());
                cs.setString(3, butaca.getEstado());
                int inserto=cs.executeUpdate();
                
                if(inserto==0){
                    rpta="Error";
                }
            } catch (SQLException ex) {
            }
            finally{
                try{
                    cn.close();
                }catch(SQLException e){
                    rpta=e.getMessage();
                }
            }
        }
        return rpta;
    }

    
    
}
