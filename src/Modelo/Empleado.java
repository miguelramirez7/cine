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
public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private String fecha_inicio;
    private String fecha_fin;
    private String sede;

    public Empleado(String dni, String nombre, String apellido, String fecha_inicio, String fecha_fin, String sede) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.sede = sede;
    }

    public Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

  
    public String getFecha_inicio() {
        return fecha_inicio;
    }


    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }


    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
