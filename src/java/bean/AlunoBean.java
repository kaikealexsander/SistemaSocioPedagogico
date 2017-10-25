/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.AlunoDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Aluno;

@ManagedBean
@SessionScoped

/**
 *
 * @author kaikealexsander
 */
public class AlunoBean extends CrudBean<Aluno, AlunoDAO> {

  private AlunoDAO alunoDAO;
   @Override
    public AlunoDAO getDao() {
        if(alunoDAO == null){
            alunoDAO = new AlunoDAO();
        }
        return alunoDAO;
    }

    @Override
    public Aluno criarNovaEntidade() {
        return new Aluno();
    }
          
}
