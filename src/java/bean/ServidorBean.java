/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.ServidorDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Servidor;



@ManagedBean
@SessionScoped

/**
 *
 * @author kaikealexsander
 */
public class ServidorBean extends CrudBean<Servidor, ServidorDAO> implements java.io.Serializable{

  private ServidorDAO servidorDAO;
   @Override
    public ServidorDAO getDao() {
        if(servidorDAO == null){
            servidorDAO = new ServidorDAO();
        }
        return servidorDAO;
    }

    @Override
    public Servidor criarNovaEntidade() {
        return new Servidor();
    }
    
   
}
