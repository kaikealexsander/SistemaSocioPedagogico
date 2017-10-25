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
public class Disciplina {
    
    private Integer pkDisciplina;
    private String disciplina;

    public Disciplina() {
    }

    public Disciplina(Integer pkDisciplina, String disciplina) {
        this.pkDisciplina = pkDisciplina;
        this.disciplina = disciplina;
    }

    public Integer getPkDisciplina() {
        return pkDisciplina;
    }

    public void setPkDisciplina(Integer pkDisciplina) {
        this.pkDisciplina = pkDisciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

     
}
