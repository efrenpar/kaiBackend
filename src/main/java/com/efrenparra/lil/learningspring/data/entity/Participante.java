package com.efrenparra.lil.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.efrenparra.lil.learningspring.utils.Data;

@Entity
@Table(name="PARTICIPANTE")
public class Participante implements Data {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nombreparticipante")
	private String nombreparticipante;
	
	@Column(name="puntuacion")
	private String puntuacion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreparticipante() {
		return nombreparticipante;
	}

	public void setNombreparticipante(String nombreparticipante) {
		this.nombreparticipante = nombreparticipante;
	}

	public String getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
}
