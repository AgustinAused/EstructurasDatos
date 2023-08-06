package impleEsta;

import TDA.IColasPrioridad;

public class ColasPrioridad implements IColasPrioridad {
	private int[] arr;
	private int[] arrPrio;
	private int indice;

	@Override
	public void inicializarCola() {
		arr = new int[20];
		arrPrio = new int[20];
		indice = 0;

	}

	@Override
	public void acolarPrioridad(int x, int prio) {
		// TODO 
		int j = indice;
		while(j > 0 && arrPrio[j-1] >=  prio) {
			arr[j] = arr[j-1];
			arrPrio[j] = arrPrio[j -1];
			j--;
		}
		arr[j] = x;
		arrPrio[j] = prio;
		indice++;
	}

	@Override
	public void descolar() {
		this.indice--;
	}

	@Override
	public int primero() {
		return this.arr[indice - 1];
	}

	@Override
	public int prioridad() {
		return this.arrPrio[indice - 1];
	}

	@Override
	public boolean colaVacia() {
		return indice < 0;
	}

}
