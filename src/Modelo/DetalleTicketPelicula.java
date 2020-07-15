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
public class DetalleTicketPelicula {
    private int idDetalleTicketPelicula;
    private int idTicketPelicula;
    private String tipoTIcket;
    private int cantidad;

    public DetalleTicketPelicula(int idDetalleTicketPelicula, int idTicketPelicula, String tipoTIcket, int cantidad) {
        this.idDetalleTicketPelicula = idDetalleTicketPelicula;
        this.idTicketPelicula = idTicketPelicula;
        this.tipoTIcket = tipoTIcket;
        this.cantidad = cantidad;
    }
    public DetalleTicketPelicula(int idTicketPelicula, String tipoTIcket, int cantidad) {
        this.idTicketPelicula = idTicketPelicula;
        this.tipoTIcket = tipoTIcket;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdDetalleTicketPelicula() {
        return idDetalleTicketPelicula;
    }

    public void setIdDetalleTicketPelicula(int idDetalleTicketPelicula) {
        this.idDetalleTicketPelicula = idDetalleTicketPelicula;
    }

    public int getIdTicketPelicula() {
        return idTicketPelicula;
    }

    public void setIdTicketPelicula(int idTicketPelicula) {
        this.idTicketPelicula = idTicketPelicula;
    }

    public String getTipoTIcket() {
        return tipoTIcket;
    }

    public void setTipoTIcket(String tipoTIcket) {
        this.tipoTIcket = tipoTIcket;
    }
    
}
