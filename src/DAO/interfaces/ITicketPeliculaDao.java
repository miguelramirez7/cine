/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.TicketPelicula;
import java.util.ArrayList;

/**
 *
 * @author EDUARDO
 */
public interface ITicketPeliculaDao {
    public abstract ArrayList<TicketPelicula> listarTicketPeliculas();
    public abstract String insertarTicketPelicula(TicketPelicula ticket);
    public abstract String actualizarTicketPelicula(TicketPelicula ticket);
    public abstract String eliminarTicketPelicula(TicketPelicula ticket);
}
