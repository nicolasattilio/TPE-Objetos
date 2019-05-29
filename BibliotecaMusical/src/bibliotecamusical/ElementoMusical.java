/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamusical;

import java.util.*;

/**
 *
 * @author Mequi
 */
public abstract class ElementoMusical {

	public abstract ArrayList<Pista> buscar(Criterio c);

	public abstract String toString();

	public abstract double getDuracion();

	public abstract int getCantidadElementos();

}
