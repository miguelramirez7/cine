/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Blob;

/**
 *
 * @author Patty
 */
public class Pelicula {
    private int idPelicula;
    private String nombre;
    private int idCategoriaPelicula;
    private String resenia;
    private Blob foto;

    public Pelicula(int idPelicula, String nombre, int idCategoriaPelicula, String resenia, Blob foto) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.idCategoriaPelicula = idCategoriaPelicula;
        this.resenia = resenia;
        this.foto = foto;
    }

    public Pelicula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoriaPelicula() {
        return idCategoriaPelicula;
    }

    public void setIdCategoriaPelicula(int idCategoriaPelicula) {
        this.idCategoriaPelicula = idCategoriaPelicula;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }
    
}
