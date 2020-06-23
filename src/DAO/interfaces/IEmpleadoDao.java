/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public interface IEmpleadoDao {
    public abstract ArrayList<Empleado> listaEmpleado();
    public abstract String insertarEmpleado(Empleado butaca);
    public abstract String actualizarEmpleado(Empleado butaca);
    public abstract Empleado datosEmpleado(String dni);
}
