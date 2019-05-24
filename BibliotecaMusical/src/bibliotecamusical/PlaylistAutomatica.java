package bibliotecamusical;

import java.util.List;
import java.util.ArrayList;

public class PlaylistAutomatica extends Playlist {
	private PlaylistSimple coleccion;
	private Criterio criterio;
	public PlaylistAutomatica(PlaylistSimple c,Criterio criterio) {
		this.coleccion=c;
		this.criterio=criterio;
	}
	public void agregarElemento(ElementoMusical e) {
		coleccion.AgregarElemento(e);
	}
	
	@Override
	public List<ElementoMusical> getLista() {
		ArrayList<ElementoMusical> ret = new ArrayList<>();
		for (Pista p: coleccion.buscar(criterio))
			ret.add(p);
		return ret;
	}

	@Override
	public ElementoMusical copiar() {
		// TODO Auto-generated method stub
		return null;
	}

}
