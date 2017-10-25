/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.EstadoDAO;
import java.util.List;
import model.Estado;

/**
 *
 * @author kaikealexsander
 */
public class EstadoBean extends CrudBean<Estado,EstadoDAO>{

    
        private EstadoDAO estadoDAO;
    @Override
    public EstadoDAO getDao() {
          if(estadoDAO == null){
            estadoDAO = new EstadoDAO();
        }
        return estadoDAO;
   

    }

    @Override
    public Estado criarNovaEntidade() {

        return new Estado();
    }


}

