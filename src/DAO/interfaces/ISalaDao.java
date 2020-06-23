/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.Sala;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public interface ISalaDao {
    public abstract ArrayList<Sala> listarSalas();
    public abstract String insertarSala(Sala sala);
    public abstract String actualizarSala(Sala sala);
    public abstract String eliminarSala(Sala sala);
    public abstract Sala datosSala(String id);
}
