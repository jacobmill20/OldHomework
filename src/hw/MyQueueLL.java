package hw;

public class MyQueueLL<E> implements QueueInterface<E> {
	SLLNode<E> front = null, rear=null;
	
	public void enqueue(E e) {
		// 1. Create a node for the new element
		// 2. Add the new node at the rear of the queue
		// 3. Update the reference to the rear of the queue
		SLLNode<E> newNode = new SLLNode<E>(e);
		if(isEmpty()) { // both front and rear are null
			front = newNode;
		}
		else {
			rear.next = newNode;
		}
		rear = newNode;
	}
	public E dequeue() {
		// Be careful to handle when the queue has one element
		//Temporary variable to hold the value being returned
		E temp = front.info;
		//Set front to next node or to null if it is the last element
		if (front == rear) {
			front = null;
			rear = null;
		} else {
			front = front.next;
		}
		return temp;
	}
	public boolean isEmpty() { return front == null; }
	public boolean isFull() { return false; }	

}
