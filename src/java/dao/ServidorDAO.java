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
//			ps = conexao.prepareStatement("Select uname, senha from tb_servidor WHERE uname = ? and senha = ?");
			ps = conexao.prepareStatement("SELECT prontuario, senha FROM tb_servidor,tb_pessoa WHERE pk_pessoa=fk_pessoa AND prontuario = ? AND senha = ?");
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
    public void salvar(Servidor entidade) throws ErroSistema{
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;
            if(entidade.getPkServidor()== null){
                ps = conexao.prepareStatement("INSERT INTO tb_pessoa (pk_pessoa, nome, prontuario, dataNascimento, fk_cidade ) VALUES (0,?,?,?,?)");
                ps.setString(1, entidade.getNome());
                ps.setString(2, entidade.getProntuario());
                ps.setDate(3, new Date(entidade.getDataNascimento().getTime()));
                ps.setInt(4, entidade.getFkCidade());
                ps.setInt(5, entidade.getPkServidor());
                int id = ps.executeUpdate(); //retorna o ultimo id inserido.
                ps = conexao.prepareStatement("INSERT INTO tb_servidor(pk_servidor, fk_pessoa, fk_cargo, senha) VALUES (0,?,?,?)");
                ps.setInt(1, id);
                ps.setInt(2, entidade.getFkCargo());
                ps.setString(3, entidade.getSenha());
                ps.execute();
            } else {
                //ps = conexao.prepareStatement("UPDATE tb_pessoa SET prontuario=?, nome=?, dataNascimento=?, fk_cidade=? where pk_pessoa=?");
                ps = conexao.prepareStatement("UPDATE tb_servidor AS SERV INNER JOIN tb_pessoa AS PESSOA "
                        + "ON PESSOA.pk_pessoa=SERV.fk_pessoa"
                        + " SET prontuario=?, nome=?, dataNascimento=?, fk_cidade=?, fk_cargo=?, senha=? "
                        + "WHERE pk_servidor=?");
                ps.setString(1, entidade.getProntuario());
                ps.setString(2, entidade.getNome());
                ps.setDate(3, new Date(entidade.getDataNascimento().getTime()));
                ps.setInt(4, entidade.getFkCidade());
                ps.setInt(5, entidade.getFkCargo());
                ps.setString(6, entidade.getSenha());
                ps.setInt(7, entidade.getPkServidor());
                ps.executeUpdate();
                
            }/*
            pk_pessoa, prontuario, nome, dataNascimento, fk_cidade 
            */
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar!", ex);
        }
    }
    
    @Override
    public void deletar(Servidor entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servidor> buscar() throws ErroSistema {
        try {/*SELECT * FROM `tb_servidor` WHERE 1*/
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM `tb_servidor`,`tb_pessoa` WHERE `pk_pessoa`=`fk_pessoa`");
            ResultSet resultSet = ps.executeQuery();
            List<Servidor> servidors = new ArrayList<>();
            while(resultSet.next()){
                Servidor servidor = new Servidor();
                servidor.setPkServidor(resultSet.getInt("pk_servidor"));
                servidor.setFkPessoa(resultSet.getInt("fk_pessoa"));
                servidor.setFkCargo(resultSet.getInt("fk_cargo"));
                /*pessoa*/
                servidor.setNome(resultSet.getString("nome"));
                servidor.setDataNascimento(resultSet.getDate("data_nascimento"));
                servidor.setProntuario(resultSet.getString("prontuario"));
                servidor.setFkCidade(resultSet.getInt("fk_cidade"));
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

    @Override
    public Servidor busca(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}


