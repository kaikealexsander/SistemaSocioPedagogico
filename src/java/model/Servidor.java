/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kaikealexsander
 */
public class Servidor {
    
    private Integer pkServidor;
    private int fkPessoa;
    private int fkCargo;
    private String senha;

    public Servidor() {
    }

    public Servidor(Integer pkServidor, int fkPessoa, int fkCargo, String senha) {
        this.pkServidor = pkServidor;
        this.fkPessoa = fkPessoa;
        this.fkCargo = fkCargo;
        this.senha = senha;
    }

    public Integer getPkServidor() {
        return pkServidor;
    }

    public void setPkServidor(Integer pkServidor) {
        this.pkServidor = pkServidor;
    }

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }

    public int getFkCargo() {
        return fkCargo;
    }

    public void setFkCargo(int fkCargo) {
        this.fkCargo = fkCargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
