package com.model;

public class Complaint {

	private static String descricaoQueixa;
	private String nomeAnimal;
	private String quantidadeAnimal;
	private String quantidaPessoasDoentes;
	private String quantidaPessoasInternadas;
	private String quantidaPessoasMortas;
	private String dia;
	private String mes;
	private String ano;
	
	
	public Complaint() {
		super();
		
	}
	

	


	public Complaint(String descricaoQueixa, String nomeAnimal, String quantidadeAnimal, String quantidaPessoasDoentes,
			String quantidaPessoasInternadas, String quantidaPessoasMortas, String dia, String mes, String ano) {
		super();
		this.descricaoQueixa = descricaoQueixa;
		this.nomeAnimal = nomeAnimal;
		this.quantidadeAnimal = quantidadeAnimal;
		this.quantidaPessoasDoentes = quantidaPessoasDoentes;
		this.quantidaPessoasInternadas = quantidaPessoasInternadas;
		this.quantidaPessoasMortas = quantidaPessoasMortas;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	public static String getDescricaoQueixa() {
		return descricaoQueixa;
	}


	public void setDescricaoQueixa(String descricaoQueixa) {
		this.descricaoQueixa = descricaoQueixa;
	}


	public String getNomeAnimal() {
		return nomeAnimal;
	}


	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}


	public String getQuantidadeAnimal() {
		return quantidadeAnimal;
	}


	public void setQuantidadeAnimal(String quantidadeAnimal) {
		this.quantidadeAnimal = quantidadeAnimal;
	}


	public String getQuantidaPessoasDoentes() {
		return quantidaPessoasDoentes;
	}


	public void setQuantidaPessoasDoentes(String quantidaPessoasDoentes) {
		this.quantidaPessoasDoentes = quantidaPessoasDoentes;
	}


	public String getQuantidaPessoasInternadas() {
		return quantidaPessoasInternadas;
	}


	public void setQuantidaPessoasInternadas(String quantidaPessoasInternadas) {
		this.quantidaPessoasInternadas = quantidaPessoasInternadas;
	}


	public String getQuantidaPessoasMortas() {
		return quantidaPessoasMortas;
	}


	public void setQuantidaPessoasMortas(String quantidaPessoasMortas) {
		this.quantidaPessoasMortas = quantidaPessoasMortas;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
}
