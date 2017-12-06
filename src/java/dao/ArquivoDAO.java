/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Arquivo;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author kaikealexsander
 */
public class ArquivoDAO implements CrudDAO<Arquivo> {
/*
    @Override
    public void salvar(Arquivo entidade) throws ErroSistema {
                try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;
            if(entidade.getPkArquivo()== null){
                ps = conexao.prepareStatement("INSERT INTO tb_arquivo (pk_arquivo, arquivo) VALUES (0,?)");
                ps.setBytes(1, entidade.getArquivo());
                 //retorna o ultimo id inserido.
            } else {
                ps = conexao.prepareStatement("UPDATE tb_arquivo SET arquivo=? WHERE pk_arquivo=?");
                ps.setBytes(1, entidade.getArquivo());
                ps.setInt(2, entidade.getPkArquivo());
                //ps.executeUpdate();
            }
            //ps.setInt(6, entidade.getFkCidade());
            ps.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar o arquivo no banco de dados!", ex);
        }
        
    }
*/
    @Override
    public void deletar(Arquivo entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Arquivo> buscar() throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Arquivo> buscar(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Arquivo> buscar(Arquivo entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void salvar(Arquivo arquivo) throws ErroSistema {
        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps;
        String sql;
        if (arquivo.getPkArquivo()== 0) {
            sql = "insert into tb_arquivo(pk_arquivo, arquivo) values(0,?)";
        } else {
            sql = "update tb_arquivo set arquivo = ? where pk_arquivo=?";
        }
        try {
            ps = conexao.prepareStatement(sql);
            ps.setBytes(1, arquivo.getArquivo());
            if (arquivo.getPkArquivo()!= 0) {
                ps.setInt(2, arquivo.getPkArquivo());
            }
            ps.execute();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ArquivoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    throw new ErroSistema("Erro ao tentar salvar o arquivo no banco de dados!", ex);
        }
    }

    public List<Arquivo> listaTodos() throws ErroSistema {
        List jogadores = new ArrayList();
        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps;
        String sql;
        sql = "select * from tb_arquivo";
        try {
            ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Arquivo j = new Arquivo();
                j.setPkArquivo(rs.getInt("pk_arquivo"));
                j.setArquivo(rs.getBytes("arquivo"));
                jogadores.add(j);
            }
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ArquivoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jogadores;
    }

    @Override
    public Arquivo busca(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
