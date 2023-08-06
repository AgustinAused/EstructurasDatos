package impleEsta;

import TDA.IPila;

public class PilaTDA implements IPila {
	private int[] arr;
	private int indice;
	@Override
	public void inicializar() {
		arr =  new int[100];
		indice = 0;
	}
	@Override
	public void apilar(int num) {	
		arr[indice] = num;
		indice++;
	}
	@Override
	public void desapilar() {
	
		indice--;
	}
	@Override
	public int tope() {
		return arr[indice - 1];
	}
	@Override
	public boolean pilaVacia() {
		return (indice == 0);
	}

}
