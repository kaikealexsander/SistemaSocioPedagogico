/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author pc
 */
public interface InterfaceDAO<T, E> {
    public abstract boolean salvar(T objeto);
    public abstract T consultar(E chave);
    public abstract boolean alterar(T objeto);
    public abstract boolean excluir(T objeto);
    public abstract List<T> findAll();
}
