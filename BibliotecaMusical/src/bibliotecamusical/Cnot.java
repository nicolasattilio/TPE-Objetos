package bibliotecamusical;

public class Cnot implements Criterio {
	private Criterio a1;
	

	public Cnot(Criterio a1) {
		this.a1 = a1;
	
	}

	@Override
	public boolean cumple(Pista p) {
		return !a1.cumple(p);

	}

}

