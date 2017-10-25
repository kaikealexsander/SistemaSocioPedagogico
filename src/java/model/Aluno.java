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
    private int fkPessoa;
    private int fkCurso;
    private int fkPeriodo;
    private int fkArquivo;

    public Aluno() {
    }

    public Aluno(Integer pkAluno, int fkPessoa, int fkCurso, int fkPeriodo, int fkArquivo) {
        this.pkAluno = pkAluno;
        this.fkPessoa = fkPessoa;
        this.fkCurso = fkCurso;
        this.fkPeriodo = fkPeriodo;
        this.fkArquivo = fkArquivo;
    }

    public Aluno(Integer pkAluno, int fkPessoa, int fkCurso, int fkPeriodo, int fkArquivo, Integer pkPessoa, String prontuario, String nome, Date dataNascimento, int fkCidade) {
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

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }

    public int getFkCurso() {
        return fkCurso;
    }

    public void setFkCurso(int fkCurso) {
        this.fkCurso = fkCurso;
    }

    public int getFkPeriodo() {
        return fkPeriodo;
    }

    public void setFkPeriodo(int fkPeriodo) {
        this.fkPeriodo = fkPeriodo;
    }

    public int getFkArquivo() {
        return fkArquivo;
    }

    public void setFkArquivo(int fkArquivo) {
        this.fkArquivo = fkArquivo;
    }
    
    
}
