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
public class PlaylistSimple extends Playlist{
	private Vector<ElementoMusical> coleccion;
	private String nombre;

	public PlaylistSimple(String n){
		this.coleccion = new Vector<>();
		this.nombre=n;
	}

	public PlaylistSimple(Vector<ElementoMusical> coleccion){
		this.coleccion = coleccion;
		
	}
	
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void AgregarElemento(ElementoMusical p){
		coleccion.add(p);
	}

	public void AgregarElementoMusical(Pista p, int pos){
		coleccion.add(pos, p);
	}
	public void Eliminar(Pista p) {
		coleccion.remove(p);
	}

	public int GetPosicion(Pista p){
		return coleccion.indexOf(p);
	}

	public Vector<ElementoMusical> getColeccion(){
		return new Vector<ElementoMusical>(this.coleccion);
	}

	@Override
	public List<ElementoMusical> getLista(){
		return new Vector<ElementoMusical>(this.coleccion);
	}

	public PlaylistSimple copiar(){ 
		PlaylistSimple g= new PlaylistSimple("Copia de"+getNombre()); 
			for(ElementoMusical cancionCopia:this.coleccion)
				g.AgregarElemento(cancionCopia);
			return  g;
	}
	
	public void intercambiaroOrden (ElementoMusical e1,ElementoMusical e2){
		

			if(coleccion.contains(e1) && coleccion.contains(e2)){
				int posicion1 = coleccion.indexOf(e1);
				int posicion2 = coleccion.indexOf(e2);
				Collections.swap(coleccion, posicion1, posicion2);
			}
	}
	
}


