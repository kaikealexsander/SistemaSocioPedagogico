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
public class Pais {
    private Integer pkPais;
    private String nome;
    private String sigla;

    public Pais() {
    }

    public Pais(Integer pkPais, String nome, String sigla) {
        this.pkPais = pkPais;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Integer getPkPais() {
        return pkPais;
    }

    public void setPkPais(Integer pkPais) {
        this.pkPais = pkPais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setCodigo(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
