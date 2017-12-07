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
import model.Cidade;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author kaikealexsander
 */
public class CidadeDAO implements CrudDAO<Cidade> {

    @Override
    public void salvar(Cidade entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Cidade entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cidade> buscar() throws ErroSistema {
      try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_cidade");
            ResultSet resultSet = ps.executeQuery();
            List<Cidade> cidades = new ArrayList<>();
            while(resultSet.next()){
                Cidade cidade = new Cidade();
                cidade.setPkCidade(resultSet.getInt("pk_cidade"));
                cidade.setNome(resultSet.getString("nome"));
                cidade.setFkEstado(resultSet.getInt("fk_estado"));
                cidades.add(cidade);
            }
            FabricaConexao.fecharConexao();
            return cidades;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os cidades!",ex);
        }
    }
    
    public List<Cidade> buscar(Integer codigo) throws ErroSistema {
        int c = codigo;
      try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_cidade WHERE pk_cidade =?");
            ps.setInt(1, c);

            
            ResultSet resultSet = ps.executeQuery();
            List<Cidade> cidades = new ArrayList<>();
            while(resultSet.next()){
                Cidade cidade = new Cidade();
                cidade.setPkCidade(resultSet.getInt("pk_cidade"));
                cidade.setNome(resultSet.getString("nome"));
                cidade.setFkEstado(resultSet.getInt("fk_estado"));
                cidades.add(cidade);
            }
            FabricaConexao.fecharConexao();
            return cidades;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os cidades!",ex);
        }
    }

    @Override
    public List<Cidade> buscar(Cidade entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
       public Cidade busca(Integer codigo) throws ErroSistema {
        int c = codigo;
      try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_cidade WHERE pk_cidade =?");
            ps.setInt(1, c);

            
            ResultSet resultSet = ps.executeQuery();
            Cidade cidade = null;
            while(resultSet.next()){
                cidade = new Cidade();
                cidade.setPkCidade(resultSet.getInt("pk_cidade"));
                cidade.setNome(resultSet.getString("nome"));
                cidade.setFkEstado(resultSet.getInt("fk_estado"));
            }
            FabricaConexao.fecharConexao();
            return cidade;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os cidades!",ex);
        }
       }

    @Override
    public List<Cidade> buscar(int codigo) throws ErroSistema {
          int c = codigo;
      try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_cidade WHERE pk_cidade =?");
            ps.setInt(1, c);

            
            ResultSet resultSet = ps.executeQuery();
            List<Cidade> cidades = new ArrayList<>();
            while(resultSet.next()){
                Cidade cidade = new Cidade();
                cidade.setPkCidade(resultSet.getInt("pk_cidade"));
                cidade.setNome(resultSet.getString("nome"));
                cidade.setFkEstado(resultSet.getInt("fk_estado"));
                cidades.add(cidade);
            }
            FabricaConexao.fecharConexao();
            return cidades;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os cidades!",ex);
        }
    }

    @Override
    public Cidade busca(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    
}
