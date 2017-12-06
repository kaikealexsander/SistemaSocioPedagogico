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
import model.Estado;
import model.Pais;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author kaikealexsander
 */
public class EstadoDAO implements CrudDAO<Estado> {


    @Override
    public void salvar(Estado entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Estado entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estado> buscar() throws ErroSistema {
      try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_estado");
            ResultSet resultSet = ps.executeQuery();
            List<Estado> estados = new ArrayList<>();
            while(resultSet.next()){
                Estado estado = new Estado();
                estado.setPkEstado(resultSet.getInt("pk_estado"));
                estado.setNome(resultSet.getString("nome"));
                estado.setUf(resultSet.getString("uf"));
                estado.setFkPais(resultSet.getInt("fk_pais"));
                estados.add(estado);
            }
            FabricaConexao.fecharConexao();
            return estados;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os estados!",ex);
        }
    }

    @Override
    public List<Estado> buscar(int codPais) throws ErroSistema {
              try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_estado WHERE fk_pais=?");
            ps.setInt(1, codPais);
            ResultSet resultSet = ps.executeQuery();
            List<Estado> estados = new ArrayList<>(); 
            while(resultSet.next()){
                Estado estado = new Estado();
                estado.setPkEstado(resultSet.getInt("pk_estado"));
                estado.setNome(resultSet.getString("nome"));
                estado.setUf(resultSet.getString("uf"));
                estado.setFkPais(resultSet.getInt("fk_pais"));
                estados.add(estado);
            }
            FabricaConexao.fecharConexao();
            return estados;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os estados!",ex);
        }

    }

    @Override
    public List<Estado> buscar(Estado entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estado busca(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
