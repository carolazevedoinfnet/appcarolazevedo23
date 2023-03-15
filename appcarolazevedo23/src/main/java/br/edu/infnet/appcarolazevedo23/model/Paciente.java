package br.edu.infnet.appcarolazevedo23.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "TPaciente")
public class Paciente  {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String sobrenome;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate nascimento;
	private String mae;
	private String pai;
	private String sexo;
	private String cpf;
	private String email;
	private Integer telefone;

	public Paciente() {}

	public Paciente(String nome, String sobrenome, LocalDate nascimento, String mae, String pai, String sexo, String cpf, String email, Integer telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nascimento = nascimento;
		this.mae = mae;
		this.pai = pai;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public String toString(){
		return this.getNome();

	}

	public void imprimir(){

		System.out.println(this);
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
}
