package bibliotecamusical;

public class CmayorAnio implements Criterio {
	private int anio;
	
	public CmayorAnio(int anio) {
	this.anio = anio;
	}
	
	@Override
	public boolean cumple(Pista p) {
		return (p.getAnio() > anio);
		
	}

}

