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
public class DetallePromociones {
    private int idPromociones;
    private int idGolosinas;
    private int cantidad;

    public DetallePromociones(int idPromociones, int idGolosinas, int cantidad) {
        this.idPromociones = idPromociones;
        this.idGolosinas = idGolosinas;
        this.cantidad = cantidad;
    }

    public DetallePromociones() {
    }

    public int getIdPromociones() {
        return idPromociones;
    }

    public void setIdPromociones(int idPromociones) {
        this.idPromociones = idPromociones;
    }

    public int getIdGolosinas() {
        return idGolosinas;
    }

    public void setIdGolosinas(int idGolosinas) {
        this.idGolosinas = idGolosinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
