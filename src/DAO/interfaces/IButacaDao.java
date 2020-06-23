/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import Modelo.Butaca;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Patty
 */
public interface IButacaDao {
    public abstract ArrayList<Butaca> listaButacas();
    public abstract String insertarButaca(Butaca butaca);
    public abstract String actualizarButaca(Butaca butaca);
    public abstract Butaca datosButaca(String numButaca, int sala);
}
