/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public interface IClienteDao {
    public abstract ArrayList<Cliente> listaCliente();
    public abstract String insertarCliente(Cliente butaca);
    public abstract String actualizarCliente(Cliente butaca);
    public abstract Cliente datosCliente(String dni);
}
