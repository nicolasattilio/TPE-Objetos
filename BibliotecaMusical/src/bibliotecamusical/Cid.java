package bibliotecamusical;

public class Cid implements Criterio {
	private int id ;
	
	public Cid(int id) {
		super();
		this.id = id;
	}
	@Override
	public boolean cumple(Pista p) {
		if (p.getId()==id)
			return true;
		return false;
	}

}

