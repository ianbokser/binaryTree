package BT;

public class BTInt<T> {
	private NodoInt raiz;
	private class NodoInt{
		int elem;
		NodoInt R,L;
		NodoInt(int value){
			elem = value;
		};
	};
	public int nodoLength() {
		return nodoLength(this.raiz);
	};
	
	private int nodoLength(NodoInt n){
		if (n == null){
			return 0;
		};
		return 1 + nodoLength(n.L) + nodoLength(n.R);
	};
	
}

