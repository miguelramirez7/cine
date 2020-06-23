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
public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String fechaNaci;
    private String tipoCli;

    public Cliente(String dni, String nombre, String apellido, String fechaNaci, String tipoCli) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNaci = fechaNaci;
        this.tipoCli = tipoCli;
    }
    public Cliente() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getTipoCli() {
        return tipoCli;
    }

    public void setTipoCli(String tipoCli) {
        this.tipoCli = tipoCli;
    }
}
