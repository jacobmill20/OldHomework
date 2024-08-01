package hw;

public interface QueueInterface<E> {
	void enqueue(E e);
	E dequeue();
	boolean isEmpty();
	boolean isFull();
}
