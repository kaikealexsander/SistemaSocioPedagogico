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
public class Encaminhamento {
    private Integer pkEncaminhamento;
    private int fkAtendimento;
    private int fkServdestino;

    public Encaminhamento() {
    }

    public Encaminhamento(Integer pkEncaminhamento, int fkAtendimento, int fkServdestino) {
        this.pkEncaminhamento = pkEncaminhamento;
        this.fkAtendimento = fkAtendimento;
        this.fkServdestino = fkServdestino;
    }

    public Integer getPkEncaminhamento() {
        return pkEncaminhamento;
    }

    public void setPkEncaminhamento(Integer pkEncaminhamento) {
        this.pkEncaminhamento = pkEncaminhamento;
    }

    public int getFkAtendimento() {
        return fkAtendimento;
    }

    public void setFkAtendimento(int fkAtendimento) {
        this.fkAtendimento = fkAtendimento;
    }

    public int getFkServdestino() {
        return fkServdestino;
    }

    public void setFkServdestino(int fkServdestino) {
        this.fkServdestino = fkServdestino;
    }

    
}
