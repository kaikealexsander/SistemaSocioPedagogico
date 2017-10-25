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
public class Atendimento {
      private Integer pkAtendimento;
    private int fkAluno;
    private int fkServidor;
    private Date data;
    private String descricao;
    private int fkTurma;
    private int modalidade;
    private int fkStatus;

    public Atendimento() {
    }

    public Atendimento(Integer pkAtendimento, int fkAluno, int fkServidor, Date data, String descricao, int fkTurma, int modalidade, int fkStatus) {
        this.pkAtendimento = pkAtendimento;
        this.fkAluno = fkAluno;
        this.fkServidor = fkServidor;
        this.data = data;
        this.descricao = descricao;
        this.fkTurma = fkTurma;
        this.modalidade = modalidade;
        this.fkStatus = fkStatus;
    }

    public Integer getPkAtendimento() {
        return pkAtendimento;
    }

    public void setPkAtendimento(Integer pkAtendimento) {
        this.pkAtendimento = pkAtendimento;
    }

    public int getFkAluno() {
        return fkAluno;
    }

    public void setFkAluno(int fkAluno) {
        this.fkAluno = fkAluno;
    }

    public int getFkServidor() {
        return fkServidor;
    }

    public void setFkServidor(int fkServidor) {
        this.fkServidor = fkServidor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFkTurma() {
        return fkTurma;
    }

    public void setFkTurma(int fkTurma) {
        this.fkTurma = fkTurma;
    }

    public int getModalidade() {
        return modalidade;
    }

    public void setModalidade(int modalidade) {
        this.modalidade = modalidade;
    }

    public int getFkStatus() {
        return fkStatus;
    }

    public void setFkStatus(int fkStatus) {
        this.fkStatus = fkStatus;
    }
    
    
}
