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
public class ConclusaoAtendimento {
    
    private Integer pkConclusao;
    private int fkAtendimento;
    private String conclusao;

    public ConclusaoAtendimento() {
    }

    public ConclusaoAtendimento(Integer pkConclusao, int fkAtendimento, String conclusao) {
        this.pkConclusao = pkConclusao;
        this.fkAtendimento = fkAtendimento;
        this.conclusao = conclusao;
    }

    public Integer getPkConclusao() {
        return pkConclusao;
    }

    public void setPkConclusao(Integer pkConclusao) {
        this.pkConclusao = pkConclusao;
    }

    public int getFkAtendimento() {
        return fkAtendimento;
    }

    public void setFkAtendimento(int fkAtendimento) {
        this.fkAtendimento = fkAtendimento;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    
}
