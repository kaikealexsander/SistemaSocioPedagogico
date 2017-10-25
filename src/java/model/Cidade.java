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
public class Cidade {
    private Integer pkCidade;
    private String nome;
    private Integer fkEstado;

    public Cidade() {
    }

    public Cidade(Integer pkCidade, String nome, Integer fkEstado) {
        this.pkCidade = pkCidade;
        this.nome = nome;
        this.fkEstado = fkEstado;
    }

    public Integer getPkCidade() {
        return pkCidade;
    }

    public void setPkCidade(Integer pkCidade) {
        this.pkCidade = pkCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getFkEstado() {
        return fkEstado;
    }

    public void setFkEstado(Integer fkEstado) {
        this.fkEstado = fkEstado;
    }

    
}
