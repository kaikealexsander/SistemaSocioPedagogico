/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.CidadeDAO;
import java.util.List;
import model.Cidade;
import util.ErroSistema;

/**
 *
 * @author kaikealexsander
 */
public class CidadeBean extends CrudBean<Cidade,CidadeDAO>{

    
        private CidadeDAO cidadeDAO;
    @Override
    public CidadeDAO getDao() {
          if(cidadeDAO == null){
            cidadeDAO = new CidadeDAO();
        }
        return cidadeDAO;
   

    }

    @Override
    public Cidade criarNovaEntidade() {

        return new Cidade();
    }
    

}

