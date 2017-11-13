/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author kaikealexsander
 */

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.ServidorDAO;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import util.ErroSistema;
import util.SessionUtils;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private String validateUsernamePassword;
	private static final long serialVersionUID = 1094801825228386363L;
	
	private String pwd;
	private String msg;
	private String user;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

        public void login(ActionEvent event) throws NoSuchAlgorithmException, UnsupportedEncodingException, ErroSistema, IOException {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
         
        try {
             boolean valid = ServidorDAO.validate(user, encriptaSenha(pwd));
		if (valid) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
                        loggedIn = true;
                        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem vindo ", user);
                        validateUsernamePassword = "admin";
        } else {
                    loggedIn = false;
                    message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro no acesso", "Usuario/senha inexistente");
                    validateUsernamePassword =  "login";
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
            
               // adicionarMensagem("Não temos nada cadastrado!", FacesMessage.SEVERITY_WARN);
            
        } catch (ErroSistema ex) {
            Logger.getLogger(CrudBean.class.getName()).log(Level.SEVERE, null, ex);
            adicionarMensagem(ex.getMessage(), FacesMessage.SEVERITY_ERROR);
        }
        
        
       
   /*     try {
                Thread.sleep(2000);
                FacesContext.getCurrentInstance().getExternalContext().redirect("admin.jsf");
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
    }
        public void adicionarMensagem(String mensagem, FacesMessage.Severity tipoErro){
        FacesMessage fm = new FacesMessage(tipoErro, mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }
        
	//validate login
	
        /*
	public String validateUsernamePassword(ActionEvent event) throws ErroSistema, NoSuchAlgorithmException, UnsupportedEncodingException {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        
		boolean valid = ServidorDAO.validate(user, encriptaSenha(pwd));
		if (valid) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
                        loggedIn = true;
                        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", user);
                        FacesContext.getCurrentInstance().addMessage(null, message);
                context.addCallbackParam("loggedIn", loggedIn);
			return "admin";
		} else {
                    loggedIn = false;
                    message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
                    return "login";
		}
                
	}
*/
	//logout event, invalidate session
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login";
	}
        
        public String encriptaSenha(String original) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = algorithm.digest(original.getBytes("UTF-8"));
        
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        String senha = hexString.toString();
        return senha;
    }
}
