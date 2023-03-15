package br.edu.infnet.appcarolazevedo23.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name ="TExames")
public class Exame {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String descricao;
	 
	@ManyToMany(mappedBy = "exames", cascade = CascadeType.DETACH)
	private List<Consulta> consultas;

	public Exame() {		
	}
	
	public Exame(Integer id, String descricao, List<Consulta> consultas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.consultas = consultas;
	}
	
	@Override
	public String toString() {

		return this.getDescricao();
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
	public String getDescricao() {

		return descricao;
	}
	public void setDescricao(String descricao) {

		this.descricao = descricao;
	}
	
	  public List<Consulta> getConsultas() { return consultas; } public void
	  setConsultas(List<Consulta> consultas) { this.consultas = consultas; }
	 
}
