/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.model.ListDataModel;

/**
 *
 * @author pc
 */
public interface CrudControllerDAO<T, E> {
    public boolean salvar();
    public boolean alterar();
    public String remover();
    public T consultar(E chave);
    public ListDataModel<T> listar();
}
