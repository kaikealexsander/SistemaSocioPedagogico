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
public class DisciplinaAtestado {
    private Integer pkDiscAtestado;
    private int fkRegimedomiciliar;
    private int fkDisciplina;

    public DisciplinaAtestado() {
    }

    public DisciplinaAtestado(Integer pkDiscAtestado, int fkRegimedomiciliar, int fkDisciplina) {
        this.pkDiscAtestado = pkDiscAtestado;
        this.fkRegimedomiciliar = fkRegimedomiciliar;
        this.fkDisciplina = fkDisciplina;
    }

    public Integer getPkDiscAtestado() {
        return pkDiscAtestado;
    }

    public void setPkDiscAtestado(Integer pkDiscAtestado) {
        this.pkDiscAtestado = pkDiscAtestado;
    }

    public int getFkRegimedomiciliar() {
        return fkRegimedomiciliar;
    }

    public void setFkRegimedomiciliar(int fkRegimedomiciliar) {
        this.fkRegimedomiciliar = fkRegimedomiciliar;
    }

    public int getFkDisciplina() {
        return fkDisciplina;
    }

    public void setFkDisciplina(int fkDisciplina) {
        this.fkDisciplina = fkDisciplina;
    }

    
}
