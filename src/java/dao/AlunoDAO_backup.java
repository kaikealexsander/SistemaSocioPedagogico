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
public class AlunoDAO_backup implements CrudDAO<Aluno> {
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
                int id = ps.executeUpdate(); //retorna o ultimo id inserido.
                ps = conexao.prepareStatement("INSERT INTO tb_aluno(pkAluno, fkPessoa, fkCurso, fkPeriodo, fkArquivo) VALUES (0,?,?,?,?)");
                
 
                 
            } else {
                ps = conexao.prepareStatement("update tb_pessoa set prontuario=?, nome=?, dataNascimento=?, cidade=? where pkPessoa=?");
                ps.setInt(5, entidade.getFkPessoa());
            }
            ps.setString(1, entidade.getProntuario());
            ps.setString(2, entidade.getNome());
            ps.setDate(3, entidade.getDataNascimento());
            ps.setInt(4, entidade.getFkCidade());
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
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from tb_aluno");
            ResultSet resultSet = ps.executeQuery();
            List<Aluno> alunos = new ArrayList<>();
            while(resultSet.next()){
                Aluno aluno = new Aluno();
                aluno.setPkAluno(resultSet.getInt("pkAluno"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setProntuario(resultSet.getString("prontuario"));
                aluno.setDataNascimento(resultSet.getDate("dataNascimentos"));
                aluno.setFkCurso(resultSet.getInt("fkCurso"));
                aluno.setFkCidade(resultSet.getInt("fkCidade"));
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
