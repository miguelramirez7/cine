/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.Promociones;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public interface IPromocionesDao {
    public abstract ArrayList<Promociones> listarPreomociones();
    public abstract String insertarPromociones(Promociones promociones);
    public abstract String actualizarPromociones(Promociones  promociones);
    public abstract String eliminarPromociones(Promociones promociones);
    public abstract Promociones datosPromociones(String id);
}
