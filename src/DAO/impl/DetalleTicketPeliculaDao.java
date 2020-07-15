/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Conexion.AccesoDb;
import DAO.interfaces.IDetalleTicketPeliculaDao;
import Modelo.DetalleTicketPelicula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author EDUARDO
 */
public class DetalleTicketPeliculaDao implements IDetalleTicketPeliculaDao{
    private AccesoDb db;
    
    public DetalleTicketPeliculaDao (){
        db=new AccesoDb();
    }

    @Override
    public ArrayList<DetalleTicketPelicula> listarPeliculas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertarDetalleTicketPelicula(DetalleTicketPelicula detalleTicket) {
        String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoAlmacenado="CALL sp_insertarDetalleTicketpelicula(?,?,?)";
        if(cn!=null){
            try{
               CallableStatement cs=cn.prepareCall(procedimientoAlmacenado);

               cs.setInt(1,detalleTicket.getIdTicketPelicula());
               cs.setString(2,detalleTicket.getTipoTIcket());
               cs.setInt(3,detalleTicket.getCantidad());
               
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
    public String actualizarDetalleTicketPelicula(DetalleTicketPelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarDetalleTicketPelicula(DetalleTicketPelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
