package dao;

import bean.RepasseBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RepasseDAO {

	public static void adicionar(RepasseBean repasse) {
		
		//inserir codxxx
		String sql = "INSERT INTO repasse (ano, estado, municipio, esfera_governo, modalidade_ensino, valor_total_escolas) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			//criar codxxx
			stmt.setInt    (1, repasse.getAno());
			stmt.setString (2, repasse.getEstado());
			stmt.setString (3, repasse.getMunicipio());
			stmt.setString (4, repasse.getEsfera_governo());
			stmt.setString (5, repasse.getModalidade_ensino());
			stmt.setDouble (6, repasse.getValor_total_escolas());
			stmt.execute();
			
		}catch(Exception e) {}
		
	}
	
	public static ArrayList<RepasseBean> listar(){
		
		ArrayList<RepasseBean> repasse= new ArrayList<>();
		
		String sql = "SELECT * FROM repasse";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				RepasseBean temporario = new RepasseBean();
				//criar codex
				temporario.setAno (dados.getInt("ano"));
				temporario.setEstado (dados.getString("estado"));
				temporario.setMunicipio (dados.getString("municipio"));
				temporario.setEsfera_governo (dados.getString("esfera_governo"));
				temporario.setModalidade_ensino (dados.getString("modalidade_ensino"));
				temporario.setValor_total_escolas (dados.getDouble("valor_total_escolas"));
				
				repasse.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de repasse: "+e.toString());
		}
		
		return repasse;
	}
	
	
	//precisa colocar um id na tabela e no bean
	public static RepasseBean mostraRepasse(int codxxx) {
		RepasseBean repasse = null;
		
		String sql = "SELECT * FROM repasse WHERE codxxx = ?";
		
		try {
			
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codxxx);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				repasse = new RepasseBean();
				//criar codxxx
				repasse.setAno(registro.getInt("ano"));
				repasse.setEstado(registro.getString("estado"));
				repasse.setMunicipio(registro.getString("municipio"));
				repasse.setEsfera_governo(registro.getString("esfera_governo"));
				repasse.setModalidade_ensino(registro.getString("modalidade_ensino"));
				repasse.setValor_total_escolas(registro.getInt("valor_total_escolas"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de repasse: "+e.toString());
		}
		return repasse;
	}
	
	/*public static void excluir(int cod) {
		String sql = "DELETE FROM repasse WHERE cod = ?";
		
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
	}
	*/
	public static void atualizar(RepasseBean repasse) {
		
		//inserir codxxx
		String sql = " UPDATE repasse ano = ?, estado = ?, municipio = ?, regiao = ?, esfera_governo = ?, modalidade_ensino = ?, valor_total_escolas = ?";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			//inserir codxxx
			stmt.setInt   (1, repasse.getAno());
			stmt.setString(2, repasse.getEstado());
			stmt.setString(3, repasse.getMunicipio());
			stmt.setString(5, repasse.getEsfera_governo());
			stmt.setString(6, repasse.getModalidade_ensino());
			stmt.setDouble(7, repasse.getValor_total_escolas());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao Editar repasse: "+e.toString());
		}
	}
	
}
