/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import model.Empresa;

/**
 *
 * @author kaikealexsander
 */
    public class EmpresaBean {  
      
        private Empresa selectedEmpresa;  
        private List<Empresa> empresas = new ArrayList<Empresa>();  
      
        public EmpresaBean() {  
            empresas.add(new Empresa(7, "Triadworks"));  
            empresas.add(new Empresa(88, "Ivia"));  
            empresas.add(new Empresa(921, "Thoughtworks"));  
            empresas.add(new Empresa(15, "Caelum"));  
            empresas.add(new Empresa(2, "ImproveIT"));  
        }  
      
        public List<Empresa> getEmpresas() {  
            return empresas;  
        }  
        public Empresa getSelectedEmpresa() {  
            return selectedEmpresa;  
        }  
        public void setSelectedEmpresa(Empresa selectedEmpresa) {  
            this.selectedEmpresa = selectedEmpresa;  
            System.out.println("Empresa selecionada: " + selectedEmpresa.getNome());  
        }  
    }  
