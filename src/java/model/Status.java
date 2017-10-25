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
public class Status {
    
    private Integer pkStatus;
    private String status;

    public Status() {
    }

    public Status(Integer pkStatus, String status) {
        this.pkStatus = pkStatus;
        this.status = status;
    }

    public Integer getPkStatus() {
        return pkStatus;
    }

    public void setPkStatus(Integer pkStatus) {
        this.pkStatus = pkStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
