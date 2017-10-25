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
public class Estado {
    private Integer pkEstado;
    private String nome;
    private String uf;
    private Integer fkPais;

    public Estado() {
    }

    public Estado(Integer pkEstado, String nome, String uf, Integer fkPais) {
        this.pkEstado = pkEstado;
        this.nome = nome;
        this.uf = uf;
        this.fkPais = fkPais;
    }

    public Integer getPkEstado() {
        return pkEstado;
    }

    public void setPkEstado(Integer pkEstado) {
        this.pkEstado = pkEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getFkPais() {
        return fkPais;
    }

    public void setFkPais(Integer fkPais) {
        this.fkPais = fkPais;
    }

    

}
