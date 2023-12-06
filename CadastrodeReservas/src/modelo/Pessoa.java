package modelo;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private String email;
	private int telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(int cPFConv) {
		this.cpf = cPFConv;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefoneConv) {
		this.telefone = telefoneConv;
	}
	
}
