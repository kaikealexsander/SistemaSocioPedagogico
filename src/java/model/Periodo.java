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
public class Periodo {
    
    private Integer pkPeriodo;
    private String periodo;

    public Periodo() {
    }

    public Periodo(Integer pkPeriodo, String periodo) {
        this.pkPeriodo = pkPeriodo;
        this.periodo = periodo;
    }

    public Integer getPkPeriodo() {
        return pkPeriodo;
    }

    public void setPkPeriodo(Integer pkPeriodo) {
        this.pkPeriodo = pkPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
}
