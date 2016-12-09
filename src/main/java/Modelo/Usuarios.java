package Modelo;

import java.time.LocalDate;

public class Usuarios {
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private LocalDate dataNasc;
	
	
	
	
	public Usuarios() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuarios(String nome, String cpf, String email, String senha, LocalDate dataNasc) {
		super();
		this.nome=nome;
		this.cpf=cpf;
		this.email=email;
		this.senha=senha;
		this.dataNasc=dataNasc;
		
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	

}
