/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public interface IPeliculaDao {
    public abstract ArrayList<Pelicula> listarPeliculas();
    public abstract String insertarPelicula(Pelicula pelicula);
    public abstract String actualizarPelicula(Pelicula pelicula);
    public abstract String eliminarPelicula(Pelicula pelicula);
    public abstract Pelicula datosPelicula(String id);
}
