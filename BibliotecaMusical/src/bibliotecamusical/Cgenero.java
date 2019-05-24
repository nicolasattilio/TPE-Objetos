package bibliotecamusical;

public class Cgenero implements Criterio{
	private String genero;
	
	public Cgenero(String genero) {
		this.genero = genero;
}
	@Override
	public boolean cumple(Pista p) {
		return p.getGenero().toLowerCase().contains(genero.toLowerCase());
		
	}

}

