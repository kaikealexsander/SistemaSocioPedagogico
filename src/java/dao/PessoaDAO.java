/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author kaikealexsander
 */
public class PessoaDAO implements CrudDAO<Pessoa>{

    @Override
    public void salvar(Pessoa entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Pessoa entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> buscar()throws ErroSistema{

        try{
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("Select * from tb_pessoa");
            ResultSet resultSet = ps.executeQuery();
            List<Pessoa> pessoas = new ArrayList<>();
            while(resultSet.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setPkPessoa(resultSet.getInt("PkPessoa"));
                                
            }
            FabricaConexao.fecharConexao();
           return pessoas;

        } catch(SQLException ex){
            throw new ErroSistema("Erro ao buscar Pessoa", ex);
        }
    }

    @Override
    public List<Pessoa> buscar(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> buscar(Pessoa entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
