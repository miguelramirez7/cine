/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.ITicketPeliculaDao;
import Modelo.TicketPelicula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author EDUARDO
 */
public class TicketPeliculaDao implements ITicketPeliculaDao{
    private AccesoDb db;

    public TicketPeliculaDao() {
        db=new AccesoDb();
    }

    @Override
    public ArrayList<TicketPelicula> listarTicketPeliculas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertarTicketPelicula(TicketPelicula ticket) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertarTicketpelicula(?,?)";
        if(cn!=null){
            try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);

               cs.setInt(1,ticket.getIdCartelera());
               cs.setFloat(2,ticket.getTotal());
               
               
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
    public String actualizarTicketPelicula(TicketPelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarTicketPelicula(TicketPelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
