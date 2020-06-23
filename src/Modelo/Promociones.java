/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Patty
 */
public class Promociones {
    private int idPromociones;
    private String nombre;
    private String descripcion;
    private float preciototal;

    public Promociones(int idPromociones, String nombre, String descripcion, float preciototal) {
        this.idPromociones = idPromociones;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preciototal = preciototal;
    }

    public Promociones() {
    }

    public int getIdPromociones() {
        return idPromociones;
    }

    public void setIdPromociones(int idPromociones) {
        this.idPromociones = idPromociones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(float preciototal) {
        this.preciototal = preciototal;
    }
}
