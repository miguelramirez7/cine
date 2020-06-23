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
public class DetalleTicketGolosinas {
    private int idTicketgolosinas;
    private int idGolosinas;
    private int cantidad;

    public DetalleTicketGolosinas(int idTicketgolosinas, int idGolosinas, int cantidad) {
        this.idTicketgolosinas = idTicketgolosinas;
        this.idGolosinas = idGolosinas;
        this.cantidad = cantidad;
    }

    public DetalleTicketGolosinas() {
    }

    public int getIdTicketgolosinas() {
        return idTicketgolosinas;
    }

    public void setIdTicketgolosinas(int idTicketgolosinas) {
        this.idTicketgolosinas = idTicketgolosinas;
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
