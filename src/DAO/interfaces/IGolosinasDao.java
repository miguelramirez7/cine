/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.Golosinas;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public interface IGolosinasDao {
    public abstract ArrayList<Golosinas> listaGolosinas();
    public abstract String insertarGolosinas(Golosinas golosina);
    public abstract String actualizarGolosinas(Golosinas golosinas);
    public abstract Golosinas datosGolosinas(int idGolosinas);
}
