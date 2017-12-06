/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.ArquivoDAO;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Arquivo;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;
import util.ErroSistema;

/**
 *
 * @author kaikealexsander
 */


@ManagedBean
@SessionScoped

public class ArquivoBean extends CrudBean<Arquivo, ArquivoDAO> implements Serializable{
/*public class AlunoBean extends CrudBean<Aluno, AlunoDAO> implements java.io.Serializable{
*/
    private ArquivoDAO arquivoDAO;
     private StreamedContent imagem;

 
private Arquivo arquivo = new Arquivo();
 private Arquivo arquivoSelecionado = new Arquivo();
 private ArquivoDAO dao = new ArquivoDAO();
 private List<Arquivo> arquivos = new ArrayList<Arquivo>();
 
public Arquivo getArquivoSelecionado() {
 return arquivoSelecionado;
 }
 
public void setArquivoSelecionado(Arquivo arquivoSelecionado) {
 this.arquivoSelecionado = arquivoSelecionado;
 }
 
public Arquivo getArquivo() {
 return arquivo;
 }
 
public void setArquivo(Arquivo arquivo) {
 this.arquivo = arquivo;
 }
 
public List<Arquivo> getArquivos() {
 return arquivos;
 }
 
public void setArquivos(List<Arquivo> arquivos) {
 this.arquivos = arquivos;
 }
 
public StreamedContent getImagem() {
 return imagem;
 }
 
public void setImagem(StreamedContent imagem) {
 this.imagem = imagem;
 }
    
  
    public void handleFileUpload(FileUploadEvent event) {
        try {
            imagem = new DefaultStreamedContent(event.getFile().getInputstream());
            byte[] foto = event.getFile().getContents();
            this.arquivo.setArquivo(foto);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salva() throws ErroSistema {
        dao.salvar(arquivo);
        arquivos = dao.listaTodos();
        FacesMessage message = new FacesMessage("Dados salvos com SUCESSO");
    }
    
   
    @Override
    public ArquivoDAO getDao() {
        if(arquivoDAO == null){
            arquivoDAO = new ArquivoDAO();
        }
        return arquivoDAO;
    }

    @Override
    public Arquivo criarNovaEntidade() {
        return new Arquivo();
    }
 
    @Override
    public void novo() {
 arquivo = new Arquivo();
 imagem = new DefaultStreamedContent();
 }
 
public void mudaArquivo() {
 arquivo.setPkArquivo(arquivoSelecionado.getPkArquivo());
 arquivo.setArquivo(arquivoSelecionado.getArquivo());
 imagem = new DefaultStreamedContent(new ByteArrayInputStream(arquivo.getArquivo()));
 }
 
public void buscaArquivo() {
 
}
 
public void limpaImagem() {
 this.imagem = new DefaultStreamedContent();
 }
 
public ArquivoBean() throws ErroSistema {
 arquivos = dao.listaTodos();
 }
    
}
