/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.DetalleTicketPelicula;
import java.util.ArrayList;

/**
 *
 * @author EDUARDO
 */
public interface IDetalleTicketPeliculaDao {
    public abstract ArrayList<DetalleTicketPelicula> listarPeliculas();
    public abstract String insertarDetalleTicketPelicula(DetalleTicketPelicula pelicula);
    public abstract String actualizarDetalleTicketPelicula(DetalleTicketPelicula pelicula);
    public abstract String eliminarDetalleTicketPelicula(DetalleTicketPelicula pelicula);
}
