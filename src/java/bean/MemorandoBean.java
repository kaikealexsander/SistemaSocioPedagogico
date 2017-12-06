/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.MemorandoDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Memorando;



@ManagedBean
@SessionScoped

/**
 *
 * @author kaikealexsander
 */
public class MemorandoBean extends CrudBean<Memorando, MemorandoDAO> implements java.io.Serializable{

  private MemorandoDAO memorandoDAO;
   @Override
    public MemorandoDAO getDao() {
        if(memorandoDAO == null){
            memorandoDAO = new MemorandoDAO();
        }
        return memorandoDAO;
    }

    @Override
    public Memorando criarNovaEntidade() {
        return new Memorando();
    }
    
   
}
