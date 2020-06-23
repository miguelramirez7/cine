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
public class Golosinas {
    private int idGolosinas;
  private String nombre;
  private String tamaño;
  private float precio;

    public Golosinas(int idGolosinas, String nombre, String tamaño, float precio) {
        this.idGolosinas = idGolosinas;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Golosinas() {
    }

    public int getIdGolosinas() {
        return idGolosinas;
    } 

    public void setIdGolosinas(int idGolosinas) {
        this.idGolosinas = idGolosinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
