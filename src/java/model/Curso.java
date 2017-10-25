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
public class Curso {
    private Integer pkCurso;
    private String curso;

    public Curso() {
    }

    public Curso(Integer pkCurso, String curso) {
        this.pkCurso = pkCurso;
        this.curso = curso;
    }

    public Integer getPkCurso() {
        return pkCurso;
    }

    public void setPkCurso(Integer pkCurso) {
        this.pkCurso = pkCurso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
