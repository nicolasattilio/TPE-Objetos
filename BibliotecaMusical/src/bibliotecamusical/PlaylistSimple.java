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

	public void setColeccion(Vector<ElementoMusical> coleccion) {
		this.coleccion = coleccion;
	}

	@Override
	public List<ElementoMusical> getLista(){
		return new Vector<ElementoMusical>(this.coleccion);
	}
	@Override
	public ElementoMusical copiar(){ 
		PlaylistSimple g= new PlaylistSimple(getNombre());   
		 for (Enumeration<ElementoMusical> e= coleccion.elements();e.hasMoreElements();)
		 { 
			 ElementoMusical em=((ElementoMusical) e.nextElement()).copiar(); 
			 if (em != null) 
				 g.AgregarElemento(em);
		 }
	         return  g;
	}
	
	public void intercambiaroOrden (ElementoMusical e1,ElementoMusical e2){
		

			if(coleccion.contains(e1) && coleccion.contains(e2)){
				int posicion1 = coleccion.indexOf(e1);
				int posicion2 = coleccion.indexOf(e2);
				coleccion.remove(e1);
				coleccion.remove(e2);
				coleccion.add(posicion1,e2);
				coleccion.add(posicion2,e1);	
			}
	}
	
}


