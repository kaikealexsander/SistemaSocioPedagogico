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
public class SolicitacaoSite {
    private Integer pkSolicita;
    private int fkAluno;
    private String descricao;

    public SolicitacaoSite() {
    }

    public SolicitacaoSite(Integer pkSolicita, int fkAluno, String descricao) {
        this.pkSolicita = pkSolicita;
        this.fkAluno = fkAluno;
        this.descricao = descricao;
    }

    public Integer getPkSolicita() {
        return pkSolicita;
    }

    public void setPkSolicita(Integer pkSolicita) {
        this.pkSolicita = pkSolicita;
    }

    public int getFkAluno() {
        return fkAluno;
    }

    public void setFkAluno(int fkAluno) {
        this.fkAluno = fkAluno;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
