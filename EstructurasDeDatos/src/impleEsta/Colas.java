package impleEsta;

import TDA.ICola;

public class Colas implements ICola {

	private int[] arr;
	private int indice;

	@Override
	public void inicializarColar() {
		arr = new int[20];
		indice = 0;
	}

	@Override
	public void colar(int x) {
		for (int i = indice; i > 0; i--) {
			this.arr[i] = this.arr[i-1];
		}
		this.arr[0] = x;
		indice++;
	}

	@Override
	public void descolar() {
		this.indice--;
	}

	@Override
	public int primero() {
		return this.arr[indice-1];
	}

	@Override
	public boolean colaVacia() {
		return (indice == 0);
	}

}
