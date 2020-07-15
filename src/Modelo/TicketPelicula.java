/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author EDUARDO
 */
public class TicketPelicula {
    private int idTicketPelicula;
    private int idPromociones;
    private int idCartelera;
    private float total;
    private int idEmpleado;
    private int idCliente;

    public TicketPelicula(int idTicketPelicula, int idCartelera, float total) {
        this.idTicketPelicula = idTicketPelicula;
        this.idCartelera = idCartelera;
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdTicketPelicula() {
        return idTicketPelicula;
    }

    public void setIdTicketPelicula(int idTicketPelicula) {
        this.idTicketPelicula = idTicketPelicula;
    }

    public int getIdPromociones() {
        return idPromociones;
    }

    public void setIdPromociones(int idPromociones) {
        this.idPromociones = idPromociones;
    }

    public int getIdCartelera() {
        return idCartelera;
    }

    public void setIdCartelera(int idCartelera) {
        this.idCartelera = idCartelera;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
