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
import javax.faces.application.FacesMessage;
import model.Servidor;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author kaikealexsander
 */
public class ServidorDAO implements CrudDAO<Servidor> {

    public static boolean validate(String user, String password) throws ErroSistema {
		Connection con = null;
		PreparedStatement ps = null;

		try {
                        Connection conexao = FabricaConexao.getConexao();
			ps = conexao.prepareStatement("Select uname, senha from tb_servidor WHERE uname = ? and senha = ?");
			ps.setString(1, user);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				//result found, means valid inputs
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
                        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "ERRO: "+ex.getMessage());
			return false;
		} finally {
                    FabricaConexao.fecharConexao();

		}
		return false;
	}

    @Override
    public void salvar(Servidor entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Servidor entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servidor> buscar() throws ErroSistema {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_servidor");
            ResultSet resultSet = ps.executeQuery();
            List<Servidor> servidors = new ArrayList<>();
            while(resultSet.next()){
                Servidor servidor = new Servidor();
                servidor.setPkServidor(resultSet.getInt("pk_servidor"));
                servidor.setSenha(resultSet.getString("senha"));
                servidors.add(servidor);
            }
            FabricaConexao.fecharConexao();
            return servidors;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os servidors!",ex);
        }
    }

    @Override
    public List<Servidor> buscar(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servidor> buscar(Servidor entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
