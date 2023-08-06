package TDA;

public interface IColasPrioridad {

	void inicializarCola();

	void acolarPrioridad(int num, int prioridad);  //cola inicializada

	void descolar();//cola inicializada y no vacía

	int primero();//cola inicializada y no vacía

	int prioridad();//cola inicializada y no vacía

	boolean colaVacia(); //cola inicializada

}
