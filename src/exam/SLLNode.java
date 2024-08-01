package exam;

public class SLLNode<E> {
	E info;
	SLLNode<E> next;
	public SLLNode(E val) {
		info = val;
		next = null;
	}
	public String toString() { return "Node(" + info + ")"; }
}
