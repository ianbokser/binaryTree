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
	
	public boolean include(NodeInt n, NodeInt elem){
		if (n==null) {
			return false;
		};
		if (n.elem == elem) {
			return true;
		};
		return include(n.L, elem) || include(n.R, elem);
	};
}

