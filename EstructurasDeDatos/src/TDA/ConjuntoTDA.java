package TDA;

public interface ConjuntoTDA {
	void InicializarConjunto();
	boolean ConjuntoVacio();
	void Agregar(int x); 
	void Sacar(int x);
	boolean Pertenece(int x);
	int elegir();

}
