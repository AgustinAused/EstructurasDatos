package impleEsta;

import TDA.ConjuntoTDA;

public class ConjuntoSta implements ConjuntoTDA{
	private int arr[];
	private int indice;

	@Override
	public void InicializarConjunto() {
		arr = new int[100];
		indice = 0;
	}

	@Override
	public boolean ConjuntoVacio() {
		return (indice == 0);
	}

	@Override
	public void Agregar(int x) {
		if(!this.Pertenece(x)){
			arr[indice] = x;
			indice++;
		}
	}

	@Override
	public void Sacar(int x) {
		int i = 0;
		while(i < indice  && arr[i] != x)
			i++;
		if(i < indice){
			arr[i] = arr[indice-1];
			indice--;
		}
		}

	@Override
	public boolean Pertenece(int x) {
		int i = 0;
		while(i < indice && arr[i] != x) {
			i++;
		}
		return i < indice;
	}

	@Override
	public int elegir() {
		return arr[0];
	}
	
}
