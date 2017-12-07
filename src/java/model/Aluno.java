/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author kaikealexsander
 */
public class Aluno extends Pessoa{
    private Integer pkAluno;
    private Integer fkPessoa;
    private Integer fkCurso;
    private Integer fkPeriodo;
    private Integer fkArquivo;

    public Aluno() {
    }

 
    public Aluno(Integer pkAluno, Integer fkPessoa, Integer fkCurso, Integer fkPeriodo, Integer fkArquivo) {
        this.pkAluno = pkAluno;
        this.fkPessoa = fkPessoa;
        this.fkCurso = fkCurso;
        this.fkPeriodo = fkPeriodo;
        this.fkArquivo = fkArquivo;
    }

    public Aluno(Integer pkAluno, Integer fkPessoa, Integer fkCurso, Integer fkPeriodo, Integer fkArquivo, Integer pkPessoa, String prontuario, String nome, java.util.Date dataNascimento, Integer fkCidade) {
        super(pkPessoa, prontuario, nome, dataNascimento, fkCidade);
        this.pkAluno = pkAluno;
        this.fkPessoa = fkPessoa;
        this.fkCurso = fkCurso;
        this.fkPeriodo = fkPeriodo;
        this.fkArquivo = fkArquivo;
    }

    public Integer getPkAluno() {
        return pkAluno;
    }

    public void setPkAluno(Integer pkAluno) {
        this.pkAluno = pkAluno;
    }

   
    public Integer getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(Integer fkPessoa) {
        this.fkPessoa = fkPessoa;
    }

    public Integer getFkCurso() {
        return fkCurso;
    }

    public void setFkCurso(Integer fkCurso) {
        this.fkCurso = fkCurso;
    }

    public Integer getFkPeriodo() {
        return fkPeriodo;
    }

    public void setFkPeriodo(Integer fkPeriodo) {
        this.fkPeriodo = fkPeriodo;
    }

    public Integer getFkArquivo() {
        return fkArquivo;
    }

    public void setFkArquivo(Integer fkArquivo) {
        this.fkArquivo = fkArquivo;
    }

   

    
}
