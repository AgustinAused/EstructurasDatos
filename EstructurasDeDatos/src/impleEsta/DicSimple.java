package impleEsta;

import java.util.Iterator;

import TDA.ConjuntoTDA;
import TDA.DiccionarioSimpleTDA;

public class DicSimple implements DiccionarioSimpleTDA {
	class Elemento {
		int clave;
		int valor;
	}

	private Elemento elementos[];
	private int indice;

	@Override
	public void InicializarDiccionario() {
		indice = 0;
		elementos = new Elemento[100];

	}

	@Override
	public void Agregar(int clave, int valor) {
		int pos = clave2Indice(clave);
		if (pos ==-1) {
			pos = indice;
			elementos[pos] = new Elemento();
			elementos[pos].clave = clave;
			indice++;
		}
		elementos[pos].valor = valor;

	}

	@Override
	public void Eliminar(int clave) {
		int pos = clave2Indice(clave);
		if (pos != -1) {
			elementos[pos] = elementos[indice-1];
			indice--;
		}

	}

	@Override
	public int Recuperar(int clave) {
		int i = clave2Indice(clave);
		return elementos[i].valor ;
	}

	@Override
	public ConjuntoTDA claves() {
		var c = new ConjuntoSta();
		c.InicializarConjunto();
		for (int i = 0; i < indice; i++) {
			c.Agregar(elementos[i].clave);
		}
		return c;
	}
	
	private int clave2Indice(int clave) {
		int i = indice-1;
		while(i>=0 && elementos[i].clave != clave) {
			i--;
		}
		return i;
		
		
	}

}
