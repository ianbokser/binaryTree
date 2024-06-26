package BT;

public class BTInt<T> {
	private NodeInt raiz;
	private class NodeInt{
		int elem;
		NodeInt R,L;
		NodeInt(int value){
			elem = value;
		};
	};
	public int nodeLength() {
		return nodeLength(this.raiz);
	};
	
	private int nodeLength(NodeInt n){
		if (n == null){
			return 0;
		};
		return 1 + nodeLength(n.L) + nodeLength(n.R);
	};
	
	public int height () {
		return height(this.raiz);
	};
	
	private int height (NodeInt n){
		if (n == null) {
			return 0;
		};
		int h_L = height(n.L);
		int h_R = height(n.R);
		if (h_L > h_R) {
			return 1 + h_L;
		};
		return 1 + h_R;
	};
	
	public boolean include(NodeInt n, int elem){
		if (n==null) {
			return false;
		};
		if (n.elem == elem) {
			return true;
		};
		return include(n.L, elem) || include(n.R, elem);
	};
	
	// adding desbalancing mode
	public void addNode(int elem) {
		raiz = addNode(raiz, elem);
	};
	
	public NodeInt addNode(NodeInt n, int elem) {
		if (n == null) {
			return new NodeInt(elem);
		};
		if (n.R == null) {
			n.R = addNode(n.R, elem);
		}else {
			n.L = addNode(n.L, elem);
		};
		return n;
	};
}

