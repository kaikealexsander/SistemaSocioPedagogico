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
public class AtendimentoPsicologico {
    
    private Integer pkAtendpsico;
    private int fkAluno;
    private String anotação;

    public AtendimentoPsicologico() {
    }

    public AtendimentoPsicologico(Integer pkAtendpsico, int fkAluno, String anotação) {
        this.pkAtendpsico = pkAtendpsico;
        this.fkAluno = fkAluno;
        this.anotação = anotação;
    }

    public Integer getPkAtendpsico() {
        return pkAtendpsico;
    }

    public void setPkAtendpsico(Integer pkAtendpsico) {
        this.pkAtendpsico = pkAtendpsico;
    }

    public int getFkAluno() {
        return fkAluno;
    }

    public void setFkAluno(int fkAluno) {
        this.fkAluno = fkAluno;
    }

    public String getAnotação() {
        return anotação;
    }

    public void setAnotação(String anotação) {
        this.anotação = anotação;
    }
     

}
