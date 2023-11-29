package modelo;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private Float cpf;
	private String email;
	private Float telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getCpf() {
		return cpf;
	}
	public void setCpf(Float cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getTelefone() {
		return telefone;
	}
	public void setTelefone(Float telefone) {
		this.telefone = telefone;
	}
	
}
