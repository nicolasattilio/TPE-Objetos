/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamusical;

import java.util.*;

/**
 *
 * @author Mequi
 */
public class Pista extends ElementoMusical {

	private int id, anio;
	private String titulo, artista, tituloAlbum, genero, comentario;
	private double duracion;

	public Pista(int id, String titulo, double duracion, String artista, String tituloAlbum, int anio, String genero,
			String comentario) {
		this.id = id;
		this.titulo = titulo;
		this.duracion = duracion;
		this.artista = artista;
		this.tituloAlbum = tituloAlbum;
		this.anio = anio;
		this.genero = genero;
		this.comentario = comentario;
	}

	public ArrayList<Pista> buscar(Criterio c) {
		ArrayList<Pista> aux = new ArrayList<>();
		if (c.cumple(this))
			aux.add(this);
		return aux;
	}

	public String toString() {
		return "\nTitulo: " + this.getTitulo() + " Artista: " + this.getArtista() + " Album " + this.getAlbum()
				+ " Genero " + this.getGenero() + " Anio " + this.getAnio();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAlbum() {
		return tituloAlbum;
	}

	public void setAlbum(String tituloAlbum) {
		this.tituloAlbum = tituloAlbum;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public double getDuracion() {
		return this.duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public int getCantidadElementos() {
		return 1;
	}
}
