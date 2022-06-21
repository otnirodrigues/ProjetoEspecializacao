package com.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DAO extends Complaint{
	/**
	 * Criando as conexões com o db.
	 */
	
	
	private static Connection conectar() {
		Connection conexao = null;
		
		try {
			Class.forName("org.sqlite.JDBC").newInstance();
			conexao = DriverManager.getConnection("jdbc:sqlite:agenda\\dbcomplaint.db");
			if (conexao != null) {
                System.out.println("Connected to the database");
                DatabaseMetaData dm = (DatabaseMetaData) conexao.getMetaData();
                conexao.close();
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
			
		}
		System.out.println("conectou");
		return conexao;
	}
	
	
	public void testConectar() {
		try {
			Connection conexao = conectar();
			System.out.println(conexao);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void inserirReclamacaoAnimal (Complaint queixa) {
		Connection conexao = null;
		Statement stmt = null;
        try {
          Class.forName("org.sqlite.JDBC");
          conexao = DriverManager.getConnection("jdbc:sqlite:agenda\\dbcomplaint.db");
          conexao.setAutoCommit(false);
          System.out.println("Conectado com sucesso!");
 
          stmt = conexao.createStatement();
          String sql = "CREATE TABLE reclamacaoAnimal " +
                  "(ID INTEGER PRIMARY KEY autoincrement," +
                  " descricaoQueixa           CHAR(250)    NOT NULL, " + 
                  " nomeAnimal        CHAR(50)     NOT NULL, " + 
                  " quantidadeAnimal        CHAR(50)     NOT NULL, " + 
                  " date_added     datetime)"; 
          stmt.executeUpdate(sql);
          stmt.close();
          conexao.commit();
          conexao.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println("Tabela Criada!");
	}
	
	public void inserirReclamacaoFood (Complaint queixa) {
		Connection conexao = null;
		Statement stmt = null;
        try {
          Class.forName("org.sqlite.JDBC");
          conexao = DriverManager.getConnection("jdbc:sqlite:agenda\\dbcomplaint.db");
          conexao.setAutoCommit(false);
          System.out.println("Conectado com sucesso!");
 
          stmt = conexao.createStatement();
          String sql = "CREATE TABLE reclamacaoFood " +
                  "(ID INTEGER PRIMARY KEY autoincrement," +
                  " descricaoQueixa           CHAR(250)    NOT NULL, " + 
                  " quantidaPessoasDoentes        CHAR(50)     NOT NULL, " + 
                  " quantidaPessoasInternadas        CHAR(50)     NOT NULL, " + 
                  " quantidaPessoasMortas        CHAR(50)     NOT NULL, " + 
                  " date_added     datetime)"; 
          stmt.executeUpdate(sql);
          stmt.close();
          conexao.commit();
          conexao.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println("Tabela Criada!");
	}

	public void inserirReclamacaoDiversas (Complaint queixa) {
		Connection conexao = null;
		Statement stmt = null;
        try {
          Class.forName("org.sqlite.JDBC");
          conexao = DriverManager.getConnection("jdbc:sqlite:agenda\\dbcomplaint.db");
          conexao.setAutoCommit(false);
          System.out.println("Conectado com sucesso!");
 
          stmt = conexao.createStatement();
          String sql = "CREATE TABLE reclamacaoDiversas " +
                  "(ID INTEGER PRIMARY KEY autoincrement," +
                  " descricaoQueixa           CHAR(250)    NOT NULL, " +  
                  " date_added     datetime)"; 
          stmt.executeUpdate(sql);
          stmt.close();
          conexao.commit();
          conexao.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println("Tabela Criada!");
	}
	
	public static void deleteReclamacao()
	  {
	      Connection conexao = null;
	        Statement stmt = null;
	        try {
	          Class.forName("org.sqlite.JDBC");
	          conexao = DriverManager.getConnection("jdbc:sqlite:agenda\\\\dbcomplaint.db");
	          conexao.setAutoCommit(false);
	          System.out.println("Conectado com sucesso!");
	 
	          stmt = conexao.createStatement();
	          String sql = "DELETE from dbcomplaint where ID=1;";
	          stmt.executeUpdate(sql);
	          conexao.commit();
	 
	          ResultSet rs = stmt.executeQuery( "SELECT * FROM dbcomplaint.db;" );
	          while ( rs.next() ) {
	             int id = rs.getInt("id");
	             System.out.println( "ID : " + id );
	             System.out.println( "Descrição : " +  getDescricaoQueixa());
	             System.out.println();
	          }
	          rs.close();
	          stmt.close();
	          conexao.close();
	        } catch ( Exception e ) {
	          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	          System.exit(0);
	        }
	        
	  }
	
	public static ArrayList<Complaint> listarQueixas() {
		ArrayList<Complaint> queixas = new ArrayList<>();
		String read = "select * from contatos order by nome";
		try {
			Connection conexao = conectar();
			PreparedStatement pst = conexao.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String idcon = rs.getString(1);
				queixas.add(new Complaint());
			}
			conexao.close();
			return queixas;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
