package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	private static final String USUARIO = "root";
	private static final String SENHA = "123456";
	private static final String URL_BANCO = "jdbc:mysql://localhost/projeti_teste";
	
	public static Connection retornaConexao() {
		
		Connection conexao = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);
		} catch(SQLException e){
			System.err.println("Erro de Conexão:" + e.toString());
		} catch(ClassNotFoundException e){
			System.err.println("Classe Não Encontrada:" + e.toString());
		}
		
		return conexao;
		
	}
		
}
