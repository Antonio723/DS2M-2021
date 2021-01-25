package br.senai.sp.jandira.model;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.telefone = cep;
	}
}
