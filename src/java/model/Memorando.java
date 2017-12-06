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
public class Memorando {
    
    private Integer pkMemorando;
    private String numero;
    private Date dataEnvio;
    private Date dataRecebimento;
    private Integer fk_arquivo;

    public Memorando() {
    }

    public Memorando(Integer pkMemorando, String numero, Date dataEnvio, Date dataRecebimento, Integer fk_arquivo) {
        this.pkMemorando = pkMemorando;
        this.numero = numero;
        this.dataEnvio = dataEnvio;
        this.dataRecebimento = dataRecebimento;
        this.fk_arquivo = fk_arquivo;
    }

    public Integer getPkMemorando() {
        return pkMemorando;
    }

    public void setPkMemorando(Integer pkMemorando) {
        this.pkMemorando = pkMemorando;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Integer getFkArquivo() {
        return fk_arquivo;
    }

    public void setFkArquivo(Integer fk_arquivo) {
        this.fk_arquivo = fk_arquivo;
    }
    
}
