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
public class Arquivo {
    private Integer pkArquivo;
    private byte[] arquivo;

    public Arquivo() {
    }

    public Arquivo(Integer pkArquivo, byte[] arquivo) {
        this.pkArquivo = pkArquivo;
        this.arquivo = arquivo;
    }

    public Integer getPkArquivo() {
        return pkArquivo;
    }

    public void setPkArquivo(Integer pkArquivo) {
        this.pkArquivo = pkArquivo;
    }

    public byte[] getArquivo() {
        return arquivo;
    }

    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }

    
}
