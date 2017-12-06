/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import util.ErroSistema;

/**
 *
 * @author kaikealexsander
 */
public interface CrudDAO<E> {//E representa a entidade model
    
    public void salvar(E entidade)throws ErroSistema;
    public void deletar(E entidade)throws ErroSistema;
    public List<E> buscar()throws ErroSistema;
    public List<E> buscar(int c)throws ErroSistema;
    public List<E> buscar(E entidade)throws ErroSistema;
    public E busca(int c)throws ErroSistema;
    
}
