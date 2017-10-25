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
public class Cargo {
    private Integer pkCargo;
    private String cargo;

    public Cargo() {
    }

    public Cargo(Integer pkCargo, String cargo) {
        this.pkCargo = pkCargo;
        this.cargo = cargo;
    }

    public Integer getPkCargo() {
        return pkCargo;
    }

    public void setPkCargo(Integer pkCargo) {
        this.pkCargo = pkCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
}
