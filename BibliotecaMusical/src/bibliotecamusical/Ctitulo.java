package bibliotecamusical;

public class Ctitulo implements Criterio{
	private String nombre;
	
	public Ctitulo(String nombre) {
		this.nombre = nombre.toLowerCase();
}
	@Override
	public boolean cumple(Pista p) {
		return (p.getTitulo().toLowerCase().contains(nombre));
		
	}

}


