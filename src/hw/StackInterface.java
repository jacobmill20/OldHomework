package hw;

public interface StackInterface<E> {
	void push(E e);
	E pop();
	E peek();
	boolean isEmpty();
	boolean isFull();
}
