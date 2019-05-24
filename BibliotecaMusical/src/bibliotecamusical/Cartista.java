package bibliotecamusical;

public class Cartista implements Criterio {
	private String nombre;
	
	public Cartista(String nombre) {
		this.nombre = nombre.toLowerCase();
}
	@Override
	public boolean cumple(Pista p) {
		return (p.getArtista().toLowerCase().contains(nombre));
		
	}

}

