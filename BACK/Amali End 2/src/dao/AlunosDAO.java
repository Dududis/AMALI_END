package dao;

import bean.AlunosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlunosDAO {

	public static void adicionar(AlunosBean alunos) {
		
		String sql = "INSERT INTO alunos (cod_alunos_atendidos, ano, estado, municipio, regiao, esfera_governo, etapa_ensino, qt_alunos) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt (1, alunos.getCod_alunos_atendidos());
			stmt.setInt (2, alunos.getAno());
			stmt.setString (3, alunos.getEstado());
			stmt.setString (4, alunos.getMunicipio());
			stmt.setString(5, alunos.getRegiao());
			stmt.setString (6, alunos.getEsfera_governo());
			stmt.setString (7, alunos.getEtapa_ensino());
			stmt.execute();
			
		}catch(Exception e) {}
		
	}
	
	public static ArrayList<AlunosBean> listar(){
		
		ArrayList<AlunosBean> alunos= new ArrayList<>();
		
		String sql = "SELECT * FROM alunos";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				AlunosBean temporario = new AlunosBean();
				temporario.setCod_alunos_atendidos (dados.getInt("cod_alunos_atendidos"));
				temporario.setAno (dados.getInt("ano"));
				temporario.setEstado (dados.getString("estado"));
				temporario.setMunicipio (dados.getString("municipio"));
				temporario.setRegiao(dados.getString("região"));
				temporario.setEsfera_governo (dados.getString("esfera_governo"));
				temporario.setEtapa_ensino (dados.getString("etapa_ensino"));
				
				alunos.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de alunos: "+e.toString());
		}
		
		return alunos;
	}
	
	public static AlunosBean mostraAlunos(int cod_alunos_atendidos) {
		AlunosBean alunos = null;
		
		String sql = "SELECT * FROM alunos WHERE cod_alunos_atendidos = ?";
		
		try {
			
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, cod_alunos_atendidos);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				alunos = new AlunosBean();
				alunos.setCod_alunos_atendidos(registro.getInt("cod_alunos_atendidos"));
				alunos.setAno(registro.getInt("ano"));
				alunos.setEstado(registro.getString("estado"));
				alunos.setMunicipio(registro.getString("municipio"));
				alunos.setRegiao(registro.getString("regiao"));
				alunos.setEsfera_governo(registro.getString("esfera_governo"));
				alunos.setEtapa_ensino(registro.getString("etapa_ensino"));
				alunos.setQt_alunos(registro.getInt("qt_alunos"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de alunos: "+e.toString());
		}
		return alunos;
	}
	
	/*public static void excluir(int cod) {
		String sql = "DELETE FROM alunos WHERE cod = ?";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, cod);
			int linhasAfetadas = stmt.executeUpdate();
			
			if(linhasAfetadas >0) {
				System.out.println(linhasAfetadas+" Registros foram removidos!");
				}
		}catch(Exception e){
			System.err.println("Erro no Excluir ALunos: "+e.toString());
		}
	}*/
	
	public static void atualizar(AlunosBean alunos) {
		
		String sql = " UPDATE alunos cod_alunos_atendidos = ?, ano = ?, estado = ?, municipio = ?, regiao = ?, esfera_governo = ?, etapa_ensino = ?, qt_alunos= ?";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt (1, alunos.getCod_alunos_atendidos());
			stmt.setInt(2, alunos.getAno());
			stmt.setString(3, alunos.getEstado());
			stmt.setString(4, alunos.getMunicipio());
			stmt.setString(5, alunos.getRegiao());
			stmt.setString(6, alunos.getEsfera_governo());
			stmt.setString(7, alunos.getEtapa_ensino());
			stmt.setInt(8, alunos.getQt_alunos());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao Editar alunos: "+e.toString());
		}
	}
	
}
