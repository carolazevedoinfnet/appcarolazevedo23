package br.edu.infnet.appcarolazevedo23.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Entity
@Table (name = "TConsulta")
public class Consulta {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String categoria;
	@Column(columnDefinition = "DATE")
	private LocalDate data;
	@Column(columnDefinition = "TIME")
	private LocalTime hora;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name ="TConsultaExames",
		joinColumns = {@JoinColumn(name="idConsulta")},
		inverseJoinColumns = {@JoinColumn(name="idExame")})	
	
	private List<Exame> exames;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "idMedico")
	private Medico medico;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "idPaciente")
	private Paciente paciente;
	
	

	public Consulta() {
		
	}
	

	@Override
	public String toString() {
		return String.format("%d - Consulta com %s ,dia: %s, hora: %s.", 
		
				this.id,
				this.categoria,
				this.data,
				this.hora
			
				);
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


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public List<Exame> getExames() {
		return exames;
	}


	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}


	
}
