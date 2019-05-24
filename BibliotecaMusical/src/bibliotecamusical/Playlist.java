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
public abstract class Playlist extends ElementoMusical {

	public ArrayList<Pista> buscar(Criterio c) {
		ArrayList<Pista> aux = new ArrayList<>();
		for (ElementoMusical e : getLista())
				aux.addAll(e.buscar(c));
		return aux;
	}

	public abstract List<ElementoMusical> getLista();

	@Override
	public double getDuracion() {
		double aux = 0;
		for (ElementoMusical e : getLista())
			aux += (e.getDuracion());
		return aux;
	}

	@Override
	public int getCantidadElementos() {
		int aux = 0;
		for (ElementoMusical e : getLista())
			aux += (e.getCantidadElementos());
		return aux;
	}

	@Override
	public String toString() {
		String aux = "";
		for (ElementoMusical e : getLista())
			aux += (e.toString()+"\n");
		return aux;
	}
}
