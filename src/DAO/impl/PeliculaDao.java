/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.IPeliculaDao;
import Modelo.Pelicula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public class PeliculaDao implements IPeliculaDao{
    private AccesoDb db;
    public PeliculaDao() {
         db=new AccesoDb();
    }

    @Override
    public ArrayList<Pelicula> listarPeliculas()    {
    ArrayList<Pelicula> lista = new  ArrayList<Pelicula>();
       String procedimientoAlmacenado="CALL sp_listarPeliculasPanel()";
       Connection cn=db.getConnection();
       if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               ResultSet rs=cs.executeQuery();
               
               while(rs.next()){
                   Pelicula pel=new Pelicula();
                   //System.out.println(rs.getInt("nombre"));
                   pel.setIdPelicula(rs.getInt("idPeliculas"));
                   pel.setNombre(rs.getString("nombre"));
                   pel.setIdCategoriaPelicula(rs.getInt("idcategoriaPelicula"));
                   pel.setResenia(rs.getString("reseña"));
                   pel.setFoto(rs.getString("foto"));
                   pel.setEstado(rs.getInt("estado"));
                   pel.setPanel(rs.getInt("panel"));
                   lista.add(pel);
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
    public String insertarPelicula(Pelicula pelicula) {       
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertapelicula(?,?,?,?,?)";
        if(cn!=null){
            try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);

              // cs.setInt(1,pelicula.getIdPelicula());
               cs.setString(1,pelicula.getNombre());
               cs.setInt(2,pelicula.getIdCategoriaPelicula());
               cs.setString(3,pelicula.getResenia());
               cs.setString(4, pelicula.getFoto());
               cs.setInt(5,pelicula.getEstado());
             //  cs.setInt(7, pelicula.getPanel());
 
               
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
    public String actualizarPelicula(Pelicula pelicula) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_editarpelicula(?,?,?,?,?)";
       if(cn!=null){
           try{
                CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
                
               // cs.setInt(1,pelicula.getIdPelicula());
               cs.setString(1,pelicula.getNombre());
               cs.setInt(2,pelicula.getIdCategoriaPelicula());
               cs.setString(3,pelicula.getResenia());
               cs.setString(4, pelicula.getFoto());
               cs.setInt(5,pelicula.getEstado());
             //  cs.setInt(7, pelicula.getPanel());
               
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
    public String eliminarPelicula(Pelicula pelicula) {
       String rpta=null;
       Connection cn=db.getConnection();
       String procedimientoAlmacenado="CALL sp_actualizapelicula(?)";
       if(cn!=null){
           try{
               CallableStatement cs= cn.prepareCall(procedimientoAlmacenado);
               
              /*// cs.setInt(1,pelicula.getIdPelicula());
               cs.setString(1,pelicula.getNombre());
               //cs.setInt(3,pelicula.getIdCategoriaPelicula());
              // cs.setString(4,pelicula.getResenia());
              // cs.setString(5, pelicula.getFoto());*/
               
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
    public Pelicula datosPelicula(String id) {
        Pelicula pel=new Pelicula();
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_datospelicula(?)";
        if(cn!=null){
           try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);
               cs.setString(1,id);
               ResultSet rs=cs.executeQuery();
               if(rs.next()){
                   pel.setIdPelicula(rs.getInt("idPelicula"));
                   pel.setNombre(rs.getString("nombre"));
                   pel.setIdCategoriaPelicula(rs.getInt("idCategoriaPelicula"));
                   pel.setResenia(rs.getString("reseña"));
                   pel.setFoto(rs.getString("foto"));
               }
           }catch(SQLException ex){}
           finally{
               try{
                   cn.close();
               }catch(SQLException e){
                   
               }
           }    
       }
      return pel;     
    }

    
    
}
