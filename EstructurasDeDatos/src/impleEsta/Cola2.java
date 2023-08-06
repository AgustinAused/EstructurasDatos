package impleEsta;

import TDA.ICola;

public class Cola2 implements ICola{
	private int indice;
	private int arr[];

	@Override
	public void inicializarColar() {
		indice = 0;
		arr = new int[100];
	}

	@Override
	public void colar(int x) {
		arr[indice] = x;
		indice++;		
	}

	@Override
	public void descolar() {
		for (int i=0; i < indice - 1; i++) {
			arr[i] = arr[i+1];
		}
		indice--;
	}

	@Override
	public int primero() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean colaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

}
