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
public class RegimeDomiciliar {
    
    private Integer pkRegime;
    private int fkAluno;
    private Date dataInicio;
    private Date dataFim;
    private int fkProfessor;
    private int fkArquivo;

    public RegimeDomiciliar() {
    }

    public RegimeDomiciliar(Integer pkRegime, int fkAluno, Date dataInicio, Date dataFim, int fkProfessor, int fkArquivo) {
        this.pkRegime = pkRegime;
        this.fkAluno = fkAluno;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.fkProfessor = fkProfessor;
        this.fkArquivo = fkArquivo;
    }

    public Integer getPkRegime() {
        return pkRegime;
    }

    public void setPkRegime(Integer pkRegime) {
        this.pkRegime = pkRegime;
    }

    public int getFkAluno() {
        return fkAluno;
    }

    public void setFkAluno(int fkAluno) {
        this.fkAluno = fkAluno;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getFkProfessor() {
        return fkProfessor;
    }

    public void setFkProfessor(int fkProfessor) {
        this.fkProfessor = fkProfessor;
    }

    public int getFkArquivo() {
        return fkArquivo;
    }

    public void setFkArquivo(int fkArquivo) {
        this.fkArquivo = fkArquivo;
    }

    
}
