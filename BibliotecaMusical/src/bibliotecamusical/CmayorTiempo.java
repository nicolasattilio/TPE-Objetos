package bibliotecamusical;

public class CmayorTiempo implements Criterio {
	
	private double duracion;
	
	public CmayorTiempo(double duracion) {
	this.duracion = duracion;
	}
	
	@Override
	public boolean cumple(Pista p) {
		return (p.getDuracion() > duracion);	
	}

}

