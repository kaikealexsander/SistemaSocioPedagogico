/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.CidadeDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Cidade;
import util.ErroSistema;

/**
 *
 * @author kaikealexsander
 */
@ManagedBean
@SessionScoped
public class CidadeBean extends CrudBean<Cidade,CidadeDAO>{
    private Cidade cidade;

    public CidadeBean() {
        cidade = new Cidade();
    }
    
        private CidadeDAO cidadeDAO;

    private CidadeBean(Cidade cidade) {
        this.cidade = cidade;
    }
    
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

    
    public Cidade getCidade() {
        
        return cidade;
        //To change body of generated methods, choose Tools | Templates.
    }

  public CidadeBean consultar(Integer chave) throws ErroSistema {
      Integer p = chave;
        Cidade cidade = getDao().busca(p);
        return new CidadeBean(cidade);
    }   


}
