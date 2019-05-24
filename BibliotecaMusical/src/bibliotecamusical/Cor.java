package bibliotecamusical;

public class Cor implements Criterio {
	private Criterio a1;
	private Criterio a2;

	public Cor(Criterio a1, Criterio a2) {
		this.a1 = a1;
		this.a2 = a2;
	}

	public boolean cumple(Pista p) {

		return (a1.cumple(p)) || (a2.cumple(p));

	}

}

