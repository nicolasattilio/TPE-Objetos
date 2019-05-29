/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamusical;

import java.util.ArrayList;

/**
 *
 * @author Mequi
 */
public class BibliotecaMusical {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
	
		//Pistas
		Pista p1= new Pista(1,"El Tiempo No Para",311,"Bersuit Vergarabat","De la Cabeza",2002,"Rock Nacional", null);
		Pista p2= new Pista(2,"Mi caramelo",290,"Bersuit Vergarabat","De la cabeza",2002,"Rock Nacional", null);		
		Pista p3= new Pista(3,"Party Rock Anthem",408,"LMFAO","Sorry for Party Rocking",2011,"Electro pop",null);	
		Pista p4= new Pista(4,"Sorry for Party Rocking",421,"LMFAO","Sorry for Party Rocking",2011,"Electro pop",null);		
		Pista p5= new Pista(5,"Fix you",255,"Coldplay","X&Y",2005,"Rock alternativo",null);	
		Pista p6= new Pista(6,"Speed of Sound",455,"Coldplay","X&Y",2005,"Rock alternativo",null);
		Pista p7= new Pista(7,"Viva la vida",320,"Coldplay","Viva la vida",2008,"Rock alternativo",null);
		Pista p8= new Pista(8,"With or without you",360,"U2","The Joshua Tree",1987,"Rock",null);
		Pista p9= new Pista(9,"Vertigo",355,"U2","How to Dismantle an Atomic Bomb",2004,"rock",null);
		Pista p10= new Pista(10,"City of Blinding Lights",284,"U2","How to Dismantle an Atomic Bomb",2004,"Rock",null);
		Pista p11= new Pista(11,"A la luz de la luna",438,"El Indio Solari","Pajaritos, bravos muchachitos",2013,"rock nacional", null);
		Pista p12= new Pista(12,"Yo Canibal",258,"Patricio Rey y sus Redonditos de ricota","Lobo Suelto, Cordero atado",1993,"Rock Nacional",null);
		
		//Listas de Reproduccion
		
		PlaylistSimple clasicosDelRock=new PlaylistSimple("Clasicos del Rock");
		PlaylistSimple Elindio=new PlaylistSimple("El Indio");
		PlaylistSimple Coldplay=new PlaylistSimple("Coldplay");
		PlaylistSimple loMejor=new PlaylistSimple("Lo Mejor");
		PlaylistSimple coleccion=new PlaylistSimple("Todas mis listas"); 
		
		
		//Punto 2
		coleccion.AgregarElemento(clasicosDelRock);
		coleccion.AgregarElemento(loMejor);
		coleccion.AgregarElemento(Coldplay);
		Coldplay.AgregarElemento(p5);
		Coldplay.AgregarElemento(p6);
		Coldplay.AgregarElemento(p7);	
		Elindio.AgregarElemento(p12);
		Elindio.AgregarElemento(p11);	
		loMejor.AgregarElemento(p3);
		loMejor.AgregarElemento(p4);
		loMejor.AgregarElemento(p7);
		loMejor.AgregarElemento(p12);	
		clasicosDelRock.AgregarElemento(p1);
		clasicosDelRock.AgregarElemento(p2);
		clasicosDelRock.AgregarElemento(p8);
		clasicosDelRock.AgregarElemento(p9);
		clasicosDelRock.AgregarElemento(p10);
		clasicosDelRock.AgregarElemento(p12);
	
		
		//Punto 3
		System.out.println("Coleccion    \n"+coleccion.toString());
		coleccion.AgregarElemento(Elindio);
		
		
		//Punto 4
		Criterio genero= new Cgenero("rock");
		Criterio artista= new Cartista("Lmfao");
		Criterio artista1= new Cartista("Coldplay");
		Criterio Cmayoranio= new CmayorAnio(2006);
		Criterio mayorDuracion= new CmayorTiempo(400);
		Criterio Cnot= new Cnot(artista);	
		Criterio Cand= new Cand(genero,Cnot);
		Criterio Cand1= new Cand(genero,Cmayoranio);
		Criterio Cand2= new Cand(genero,artista1);
		Criterio Cor= new Cor(Cand2,Cand1);
		ArrayList<Pista> lista= new ArrayList<Pista> ();
		System.out.println(	"Duracion de la Playlist Coleccion \n"+coleccion.toString()+"\n");
		lista=coleccion.buscar(mayorDuracion);	
	    System.out.println("lista por criterio mayor"+lista.toString()+"\n"); 
		lista=coleccion.buscar(genero);
	    System.out.println("lista por genero "+lista.toString()+"\n");
	    lista=loMejor.buscar(Cand);
	    System.out.println("lista por Criterio por genero Rock y no sea LFMAO"+lista.toString()+"\n");
		lista=coleccion.buscar(Cor);
	    System.out.println("lista por Criterio por Rock y fecha > 2006 o Rock e interprete = Coldplay "+lista.toString()+"\n");
	    
	    
	    //Punto 5
	    System.out.println(	"Duracion de la Playlist "+loMejor.getNombre()+": "+loMejor.getDuracion()+"\n");
		System.out.println(	"Duracion de la Playlist "+clasicosDelRock.getNombre()+": "+clasicosDelRock.getDuracion()+"\n");
		System.out.println(	"Duracion de la Playlist "+Elindio.getNombre()+": "+Elindio.getDuracion()+"\n");
		System.out.println(	"Duracion de la Playlist "+Coldplay.getNombre()+": "+Coldplay.getDuracion()+"\n");
		System.out.println(	"Duracion de la Playlist "+coleccion.getNombre()+": "+coleccion.getDuracion()+"\n");
		lista=coleccion.buscar(mayorDuracion);
		double suma=0;
		for (Pista p:lista)
			suma+=p.getDuracion();
		System.out.println("Duracion total temas mayores a 400: "+suma+"\n");
		
		
		//Punto 6
		PlaylistSimple g;
		g=loMejor.copiar();
		System.out.println("Copia");
		System.out.println(g.toString());
		g.setNombre("LoMejor++");
	    g.intercambiaroOrden(p3, p7);
		System.out.println("Intercambio  "+g.toString()+"\n");
		
		//Punto 7
		PlaylistAutomatica coleccionAutomatica=new PlaylistAutomatica(coleccion, artista1);
		System.out.println("lista automatica que contenga un Artista  "+coleccionAutomatica.toString());
	
		
		//Punto 8
		Pista p13= new Pista(7,"Paradise  ",365, "Coldplay", "Mylo Xyloto", 2011, "Rock Alternativo", null);
		coleccionAutomatica.agregarElemento(p13);
		System.out.println("agregar pista e imprimir la lista automatica  "+coleccionAutomatica.toString());
	
		
	}
	
	

}
