package TDA;

public interface ICola {
	void inicializarColar();

	void colar(int x); // siempre tiene que estar inicializada

	void descolar(); // inicializada y no vacia

	int primero(); // inicializada y no vacia

	boolean colaVacia(); // Cola inicializada

}
