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
public class TicketGolosinas {
    private int idTickegolosinas;
    private int idPromociones;
    private String idEmpleado;
    private String idCliente;
    private float total;

    public TicketGolosinas(int idTickegolosinas, int idPromociones, String idEmpleado, String idCliente, float total) {
        this.idTickegolosinas = idTickegolosinas;
        this.idPromociones = idPromociones;
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
        this.total = total;
    }

    public TicketGolosinas() {
    }

    public int getIdTickegolosinas() {
        return idTickegolosinas;
    }

    public void setIdTickegolosinas(int idTickegolosinas) {
        this.idTickegolosinas = idTickegolosinas;
    }

    public int getIdPromociones() {
        return idPromociones;
    }

    public void setIdPromociones(int idPromociones) {
        this.idPromociones = idPromociones;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
