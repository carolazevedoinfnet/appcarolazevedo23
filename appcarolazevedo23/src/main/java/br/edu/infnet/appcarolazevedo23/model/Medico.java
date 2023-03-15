package br.edu.infnet.appcarolazevedo23.model;


import javax.persistence.*;

@Entity
@Table (name = "TMedico")
public class Medico {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nome;
	private String sobrenome;
	private String siglaConselho;
	private String codConselho;
	private String[] especialidades;
	private String email;
	private String dtCadastro;


	public Medico() {
	}

	public Medico(Integer id, String nome, String sobrenome, String siglaConselho, String codConselho, String[] especialidade, String email, String dtCadastro) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.siglaConselho = siglaConselho;
		this.codConselho = codConselho;
		this.especialidades = especialidade;
		this.email = email;
		this.dtCadastro = dtCadastro;



	}
	
	@Override
	public String toString() {
	 return this.getNome();
				
	}
	
	
	public void imprimir() {
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

	public String getSiglaConselho() {
		return siglaConselho;
	}

	public void setSiglaConselho(String siglaConselho) {
		this.siglaConselho = siglaConselho;
	}

	public String getCodConselho() {
		return codConselho;
	}

	public void setCodConselho(String codConselho) {
		this.codConselho = codConselho;
	}

	public String[] getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String[] especialidades) {
		this.especialidades = especialidades;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getEspecialidade() {
		if (especialidades ==null)
			return "" ;
		
		String especi = "";
		
		for (String spec : especialidades) {
			if(especi.equals(""))	
				especi = spec;
			else 
				especi = especi + ", " + spec;		
		}
		
		return especi;
	}

	public void setEspecialidade(String[] especialidade) {
		this.especialidades = especialidade;
	}



}
