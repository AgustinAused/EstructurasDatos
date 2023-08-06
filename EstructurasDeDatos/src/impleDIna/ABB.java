package impleDIna;

import TDA.ABBTDA;

class ABB implements ABBTDA {
    NodoABB raiz;
    
    @Override
    public void InicializarArbol() {
        raiz = null;
    }

	@Override
	public int raiz() {
		return raiz.info;
	}

	@Override
	public ABBTDA hijoIzq() {
		return raiz.hijoIzq;
	}

	@Override
	public ABBTDA hijoDer() {
		return raiz.hijoDer;
	}

	@Override
	public boolean arbolVacio() {
		return raiz == null;
	}

	@Override
	public void agregarElem(int x) {
		if (raiz == null ) {
			raiz = new NodoABB();
			raiz.info = x;
			raiz.hijoDer = new ABB();
			raiz.hijoIzq = new ABB();
			raiz.hijoDer.InicializarArbol();
			raiz.hijoIzq.InicializarArbol();
		} else if (raiz.info > x ){
			raiz.hijoIzq.agregarElem(x);
		} else if(raiz.info < x){
			raiz.hijoDer.agregarElem(x);
		}
		
	}

	@Override
	public void eliminarElem(int x) {
		if(raiz != null) {
			if (raiz.info == x && raiz.hijoDer.arbolVacio() && raiz.hijoIzq.arbolVacio()) {
				raiz = null;
			} else if(raiz.info == x  && !raiz.hijoIzq.arbolVacio()) {
				raiz.info = this.mayor(raiz.hijoIzq);
				raiz.hijoIzq.eliminarElem(raiz.info);
			} else if(raiz.info == x  && !raiz.hijoDer.arbolVacio()) {
				raiz.info = this.menor(raiz.hijoDer);
				raiz.hijoDer.eliminarElem(raiz.info);
			} else if(raiz.info < x) {
				raiz.hijoDer.eliminarElem(x);
			}else {
				raiz.hijoIzq.eliminarElem(x);
			}
		}
		
	}

	private int menor(ABBTDA a) {
		if(a.hijoIzq().arbolVacio()) {
			return a.raiz();
		}else {
			return menor(a.hijoIzq());
		}
	}

	private int mayor(ABBTDA a) {
		if(a.hijoIzq().arbolVacio()) {
			return a.raiz();
		}else {
			return mayor(a.hijoDer());
		}
		
	}
}

