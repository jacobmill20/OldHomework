package hw;

public class MyStack<E> implements StackInterface<E> {
	E[] elements;
	int top;
	public MyStack() {
		elements = (E[]) new Object[5];
		top = 0; // index for future new element. top-1 is the index for the last pushed element if any
	}
	private void enlarge() {
		E[] new_elements = (E[]) new Object[elements.length*2];
		for(int i=0;i<top;i++)
			new_elements[i] = elements[i];
		elements = new_elements;
	}
	public void push(E e) {
		if(isFull())
			enlarge();
		elements[top++] = e;
	}
	public E pop() { 
		if(isEmpty())
			return null;
		return elements[--top];
	}
	public E peek() {
		if(isEmpty())
			return null;
		return elements[top-1];
	}
	public boolean isEmpty() { return top == 0;}
	public boolean isFull() { return top == elements.length; }
}