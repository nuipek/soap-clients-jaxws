package com.ipartek.formacion;

import java.io.Serializable;

public class LibroBiblia implements Serializable {

	private static final long serialVersionUID = -136567876010467464L;
	
	private int codigo;
	private String titulo;
	
	public LibroBiblia() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "LibroBibila [codigo=" + codigo + ", titulo=" + titulo + "]";
	}
	
	

}
