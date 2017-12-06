/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.AlunoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Aluno;
import model.Curso;
import org.primefaces.context.RequestContext;
import util.ErroSistema;



@ManagedBean
@SessionScoped

/**
 *
 * @author kaikealexsander
 */
public class AlunoBean extends CrudBean<Aluno, AlunoDAO> implements java.io.Serializable{
     
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
    
//     public void setService(AlunoService service) {
//        this.service = service;
//    }
     
    public void selectAlunoFromDialog(Aluno aluno) {
        RequestContext.getCurrentInstance().closeDialog(aluno);
    }
  
   
    public void pesquisa(){
        List<Aluno> entidades = null;
    try {
            entidades = getDao().buscar();
            if(entidades == null || entidades.size() < 1){
                adicionarMensagem("Não temos nada cadastrado!", FacesMessage.SEVERITY_WARN);
            }
        } catch (ErroSistema ex) {
           // Logger.getLogger(CrudBean.class.getName()).log(Level.SEVERE, null, ex);
            //adicionarMensagem(ex.getMessage(), FacesMessage.SEVERITY_ERROR);
        }
    return ;
    }
    
}
