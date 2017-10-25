/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.CrudDAO;
import dao.ServidorDAO;
import model.Servidor;

/**
 *
 * @author kaikealexsander
 */
public class ServidorBean extends CrudBean<Servidor, ServidorDAO>{
    
    @Override
    public ServidorDAO getDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servidor criarNovaEntidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
