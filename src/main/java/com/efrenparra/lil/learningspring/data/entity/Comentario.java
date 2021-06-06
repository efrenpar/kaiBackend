package com.efrenparra.lil.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.efrenparra.lil.learningspring.utils.Data;


@Entity
@Table(name="COMENTARIO")
public class Comentario implements Data{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nickname")
	private String nickname;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="valoracion")
	private int valoracion;
	
	@Column(name="estado")
	private int estado;
	
	@Column(name="ofusquidad")
	private int ofusquidad;
	
	@Column(name="participante")
	private int participante;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getOfusquidad() {
		return ofusquidad;
	}

	public void setOfusquidad(int ofusquidad) {
		this.ofusquidad = ofusquidad;
	}

	public int getParticipante() {
		return participante;
	}

	public void setParticipante(int participante) {
		this.participante = participante;
	}
	
	
	

}
