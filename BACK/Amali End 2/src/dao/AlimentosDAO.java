package dao;

import bean.AlimentosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlimentosDAO {

	public static void adicionar(AlimentosBean alimentos) {
		
		//inserir codxxx
		String sql = "INSERT INTO alimento (ano, estado, municipio, entidade_executora, agricultura_familiar, organico, nome_produto, documento_despesa, u_medida, qt_comprada, valor_unitario, valor_total) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			//inserir codxxx
			stmt.setInt    (1, alimentos.getAno());
			stmt.setString (3, alimentos.getEstado());
			stmt.setString (4, alimentos.getMunicipio());
			stmt.setString (2, alimentos.getEntidade_executora());
			stmt.setBoolean(5, alimentos.getAgricultura_familiar());
			stmt.setBoolean(6, alimentos.getOrganico());
			stmt.setString (7, alimentos.getNome_produto());
			stmt.setInt    (8, alimentos.getDocumento_despesa());
			stmt.setString (9, alimentos.getU_medida());
			stmt.setDouble (10, alimentos.getQt_comprada());
			stmt.setDouble (11, alimentos.getValor_unitario());
			stmt.setDouble (12, alimentos.getValor_total());
			stmt.execute();
			
		}catch(Exception e) {}
		
	}
	
	public static ArrayList<AlimentosBean> listar(){
		
		ArrayList<AlimentosBean> alimentos = new ArrayList<>();
		
		String sql = "SELECT * FROM alimentos";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				AlimentosBean temporario = new AlimentosBean();
				//inserir codxxx
				temporario.setAno (dados.getInt("ano"));
				temporario.setEstado (dados.getString("estado"));
				temporario.setMunicipio (dados.getString("municipio"));
				temporario.setEntidade_executora(dados.getString("entidade_executora"));
				temporario.setAgricultura_familiar (dados.getBoolean("agricultura_familiar"));
				temporario.setOrganico (dados.getBoolean("organico"));
				temporario.setNome_produto (dados.getString("nome_produto"));
				temporario.setDocumento_despesa (dados.getInt("documento_despesa"));
				temporario.setU_medida (dados.getString("u_medida"));
				temporario.setQt_comprada (dados.getDouble("Qt_comprada"));
				temporario.setValor_unitario (dados.getDouble("valor_unitario"));
				temporario.setValor_total (dados.getDouble("valor_total"));
				alimentos.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de alimentos: "+e.toString());
		}
		
		return alimentos;
	}
	
	public static AlimentosBean mostraAlimentos(int codxxx) {
		AlimentosBean alimentos = null;
		
		String sql = "SELECT * FROM alimentos WHERE codxxx = ?";
		
		try {
			
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codxxx);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				alimentos = new AlimentosBean();
				//inserir codxxx
				alimentos.setAno (registro.getInt("ano"));
				alimentos.setEstado (registro.getString("estado"));
				alimentos.setMunicipio (registro.getString("municipio"));
				alimentos.setEntidade_executora(registro.getString("entidade_executora"));
				alimentos.setAgricultura_familiar (registro.getBoolean("agricultura_familiar"));
				alimentos.setOrganico (registro.getBoolean("organico"));
				alimentos.setNome_produto (registro.getString("nome_produto"));
				alimentos.setDocumento_despesa (registro.getInt("documento_despesa"));
				alimentos.setU_medida (registro.getString("u_medida"));
				alimentos.setQt_comprada (registro.getDouble("Qt_comprada"));
				alimentos.setValor_unitario (registro.getDouble("valor_unitario"));
				alimentos.setValor_total (registro.getDouble("valor_total"));
				
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de alimentos: "+e.toString());
		}
		return alimentos;
	}
	
	/*public static void excluir(int cod) {
		String sql = "DELETE FROM alimentos WHERE cod = ?";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, cod);
			int linhasAfetadas = stmt.executeUpdate();
			
			if(linhasAfetadas >0) {
				System.out.println(linhasAfetadas+" Registros foram removidos!");
				}
		}catch(Exception e){
			System.err.println("Erro no Excluir alimentos: "+e.toString());
		}
	}*/
	
	public static void atualizar(AlimentosBean alimentos) {
		
		//inserir codxxx
		String sql = " UPDATE alimentos ano = ?, estado = ?, municipio = ?, regiao = ?, esfera_governo = ?, etapa_ensino = ?, qt_alimentos= ?";
		
		try {
			Connection conexao = ConexaoDB.retornaConexao();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			//inserir codxxx
			stmt.setInt (1, alimentos.getAno());
			stmt.setString (3, alimentos.getEstado());
			stmt.setString (4, alimentos.getMunicipio());
			stmt.setString (2,alimentos.getEntidade_executora());
			stmt.setBoolean (5, alimentos.getAgricultura_familiar());
			stmt.setBoolean (6, alimentos.getOrganico());
			stmt.setString (7, alimentos.getNome_produto());
			stmt.setInt(8, alimentos.getDocumento_despesa());
			stmt.setString (9, alimentos.getU_medida());
			stmt.setDouble (10, alimentos.getQt_comprada());
			stmt.setDouble (11, alimentos.getValor_unitario());
			stmt.setDouble (12, alimentos.getValor_total());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao Editar alimentos: "+e.toString());
		}
	}
	
}
