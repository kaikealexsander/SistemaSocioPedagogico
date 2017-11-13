/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.CrudDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author kaikealexsander
 */
public class AlunoDAO implements CrudDAO<Aluno> {
//UPDATE `tb_aluno` SET `pk_aluno`,`fk_pessoa`=[value-2],
//`fk_curso`=[value-3],`fk_periodo`=[value-4],`fk_arquivo`=[value-5] WHERE 1
    
    /*
     private Integer pkPessoa;
    private String prontuario;
    private String nome;
    private Date dataNascimento;
    private int fkCidade;
*/
    @Override
    public void salvar(Aluno entidade) throws ErroSistema {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;
            if(entidade.getPkAluno()== null){
                ps = conexao.prepareStatement("INSERT INTO tb_pessoa (pkPessoa, prontuario, nome, dataNascimento, cidade ) VALUES (0,?,?,?,?)");
                ps.setString(1, entidade.getProntuario());
                ps.setString(2, entidade.getNome());
                ps.setDate(3, entidade.getDataNascimento());
                ps.setInt(4, entidade.getFkCidade());
                int id = ps.executeUpdate(); //retorna o ultimo id inserido.
                
                ps = conexao.prepareStatement("INSERT INTO tb_aluno(pkAluno, fkPessoa, fkCurso, fkPeriodo, fkArquivo) VALUES (0,?,?,?,?)");
                
                ps.setInt(1, id);
                ps.setInt(2, entidade.getFkCurso());
                ps.setInt(3, entidade.getFkPeriodo());
                ps.setInt(4, entidade.getFkArquivo());
                ps.execute();
                                 
            } else {
                ps = conexao.prepareStatement("UPDATE tb_pessoa SET prontuario=?, nome=?, dataNascimento=?, cidade=? where pkPessoa=?");
                ps.setString(1, entidade.getProntuario());
                ps.setString(2, entidade.getNome());
                ps.setDate(3, entidade.getDataNascimento());
                ps.setInt(4, entidade.getFkCidade());
                ps.setInt(5, entidade.getFkPessoa());
                ps.execute();
                
                ps = conexao.prepareStatement("UPDATE tb_aluno SET fkCurso=?, fkPeriodo=?,  fkArquivo=? where pkAluno=?");
                ps.setInt(1, entidade.getFkCurso());
                ps.setInt(2, entidade.getFkPeriodo());
                ps.setInt(3, entidade.getFkArquivo());
                ps.setInt(4,entidade.getPkAluno());
                ps.execute();
            }
            
            //ps.setInt(6, entidade.getFkCidade());
            ps.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar!", ex);
        }
    }

    @Override
    public void deletar(Aluno entidade) throws ErroSistema {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps  = conexao.prepareStatement("delete from tb_aluno where id = ?");
            ps.setInt(1, entidade.getPkAluno());
            ps.execute();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao deletar o carro!", ex);
        }
    }

    @Override
    public List<Aluno> buscar() throws ErroSistema {
        try {/*SELECT * FROM `tb_aluno` WHERE 1*/
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM `tb_aluno`,`tb_pessoa` WHERE `pk_pessoa`=`fk_pessoa`");
            ResultSet resultSet = ps.executeQuery();
            List<Aluno> alunos = new ArrayList<>();
            while(resultSet.next()){
                Aluno aluno = new Aluno();
                aluno.setPkAluno(resultSet.getInt("pk_aluno"));
                aluno.setFkPessoa(resultSet.getInt("fk_pessoa"));
                aluno.setFkCurso(resultSet.getInt("fk_curso"));
                aluno.setFkPeriodo(resultSet.getInt("fk_periodo"));
                aluno.setFkArquivo(resultSet.getInt("fk_arquivo"));
                /*pessoa*/
                aluno.setNome(resultSet.getString("nome"));
                aluno.setDataNascimento(resultSet.getDate("data_nascimento"));
                aluno.setProntuario(resultSet.getString("prontuario"));
                alunos.add(aluno);
            }
            FabricaConexao.fecharConexao();
            return alunos;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar os alunos!",ex);
        }
    }

    @Override
    public List<Aluno> buscar(int c) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> buscar(Aluno entidade) throws ErroSistema {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
