package impleEsta;

import TDA.ConjuntoTDA;
import TDA.DiccionarioMultipleTDA;

public class DicMltiple implements DiccionarioMultipleTDA {
	class Elemento {
		int clave;
		int valores[];
		int cantValores;
	}

	private int indice;
	private Elemento elementos[];

	@Override
	public void InicializarDiccionario() {
		elementos = new Elemento[100];
		indice = 0;

	}

	@Override
	public void Agregar(int clave, int valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Eliminar(int clave) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EliminarValor(int calve, int valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public ConjuntoTDA Recuperar(int clave) {        

		return null;
	}
 
	@Override
	public ConjuntoTDA Claves() {
		var c = new ConjuntoSta();
		c.InicializarConjunto();
		for (int i = 0; i < indice; i++) {
			c.Agregar(elementos[i].clave);
		}
		return c;
	}

	// metodos privados de la estructura para buscar
	private int clave2Indice(int clave) {
		int i = indice - 1;
		while (i >= 0 && elementos[i].clave != clave) {
			i--;
		}
		return i;
	}
	private int valor2Indice(Elemento e, int valor) {
		int i = e.cantValores - 1;
		while(i >= 0 && e.valores[i] != valor) {
			i--;
		}
		return i;
	}

}
