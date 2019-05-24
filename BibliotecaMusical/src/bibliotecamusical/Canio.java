package bibliotecamusical;

public class Canio implements Criterio{
	private int anio;
	
	public Canio(int anio) {
		this.anio = anio;
}
	@Override
	public boolean cumple(Pista p) {
		if (p.getAnio()== anio)
			return true;
		return false;
}

	
	
	
}