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
public class Sala {
    private int idSala;
    private int cantidadButacas;
    private int numeroPiso;

    public Sala(int idSala, int cantidadButacas, int numeroPiso) {
        this.idSala = idSala;
        this.cantidadButacas = cantidadButacas;
        this.numeroPiso = numeroPiso;
    }

    public Sala() {
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getCantidadButacas() {
        return cantidadButacas;
    }

    public void setCantidadButacas(int cantidadButacas) {
        this.cantidadButacas = cantidadButacas;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
}
