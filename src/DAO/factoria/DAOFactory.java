/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.factoria;

import DAO.impl.ButacaDao;
import DAO.impl.ClienteDao;
import DAO.impl.EmpleadoDao;
import DAO.impl.GolosinasDao;
import DAO.impl.PeliculaDao;
import DAO.impl.PromocionesDao;
import DAO.impl.SalaDao;
import DAO.interfaces.IButacaDao;
import DAO.interfaces.IClienteDao;
import DAO.interfaces.IEmpleadoDao;
import DAO.interfaces.IGolosinasDao;
import DAO.interfaces.IPeliculaDao;
import DAO.interfaces.IPromocionesDao;
import DAO.interfaces.ISalaDao;

/**
 *
 * @author Patty
 */
public class DAOFactory {
    private static DAOFactory daoFac;
    static{
        daoFac=new DAOFactory();
    }
    
    public static DAOFactory getInstance(){
        return daoFac;
    }
    
    public IButacaDao getButacaDao(){
        return new ButacaDao();
    }
    
    public IClienteDao getClienteDao(){
        return new ClienteDao();
    }
    
    public IEmpleadoDao getEmpleadoDao(){
        return new EmpleadoDao();
    }
    
    public IGolosinasDao getGolosinasDao(){
        return new GolosinasDao();
    }
    
    public IPeliculaDao getPeliculaDao(){
        return new PeliculaDao();
    }
    
    public IPromocionesDao getPromocionesDao(){
        return new PromocionesDao();
    }
    
    public ISalaDao getVinoDao(){
        return new SalaDao();
    }
    
    
}
