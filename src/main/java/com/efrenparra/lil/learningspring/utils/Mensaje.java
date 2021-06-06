package com.efrenparra.lil.learningspring.utils;

import java.util.ArrayList;

import com.efrenparra.lil.learningspring.data.entity.Comentario;

public class Mensaje {
	
	private int code;
	private String message;
	private boolean succes;
	private ArrayList<Data> data;
	
	public Mensaje(int code, String message, boolean succes, ArrayList<Data>data) {
		this.code = code;
		this.message = message;
		this.succes = succes;
		this.data = data;
	}
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSucces() {
		return succes;
	}
	public void setSucces(boolean succes) {
		this.succes = succes;
	}


	public ArrayList<Data> getData() {
		return data;
	}


	public void setData(ArrayList<Data> data) {
		this.data = data;
	}
}