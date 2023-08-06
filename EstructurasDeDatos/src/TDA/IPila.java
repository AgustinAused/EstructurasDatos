package TDA;

public interface IPila {

	void inicializar(); //

	void apilar(int num); // siempre que la pila esté inicializada

	void desapilar(); // siempre que la pila esté inicializada y no esté vacía

	int tope(); // siempre que la pila esté inicializada y no esté vacía

	boolean pilaVacia(); // siempre que la pila esté inicializada

}
