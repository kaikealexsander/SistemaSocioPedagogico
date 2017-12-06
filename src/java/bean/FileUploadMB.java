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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean(name="fileUploadMB")
@RequestScoped
public class FileUploadMB{

    public FileUploadMB() {   
    }

    public void doUpload(FileUploadEvent fileUploadEvent) { 
             UploadedFile uploadedFile = fileUploadEvent.getFile();  
             String fileNameUploaded = uploadedFile.getFileName(); 
             long fileSizeUploaded = uploadedFile.getSize();
             String infoAboutFile = "Arquivo recebido: " +fileNameUploaded+" "+
                 "Tamanho do Arquivo: "+fileSizeUploaded+" ";
             FacesContext facesContext = FacesContext.getCurrentInstance();
             facesContext.addMessage(null, new FacesMessage("Sucesso", 			                                                                       infoAboutFile));
   }
    
}
