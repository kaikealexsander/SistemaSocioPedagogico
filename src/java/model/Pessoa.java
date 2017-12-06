/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author kaikealexsander
 */
public class Pessoa {
    
    private Integer pkPessoa;
    private String prontuario;
    private String nome;
    private Date dataNascimento;
    private int fkCidade;

    public Pessoa() {
    }

    public Pessoa(Integer pkPessoa, String prontuario, String nome, Date dataNascimento, int fkCidade) {
        this.pkPessoa = pkPessoa;
        this.prontuario = prontuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.fkCidade = fkCidade;
    }

    public Integer getPkPessoa() {
        return pkPessoa;
    }

    public void setPkPessoa(Integer pkPessoa) {
        this.pkPessoa = pkPessoa;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getFkCidade() {
        return fkCidade;
    }

    public void setFkCidade(int fkCidade) {
        this.fkCidade = fkCidade;
    }

    
}
