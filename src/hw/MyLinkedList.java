package hw;

public class MyLinkedList<E> {
	SLLNode<E> head = null;
	public MyLinkedList() {};
	public MyLinkedList(E[] values) { // O(values.length)
		for(int i=values.length-1;i>=0;i--)
			add(values[i]);
	}
	void printLinkedList() {
		System.out.print("printLinkedList(): ");
		SLLNode<E> node = head;
		while(node != null) {
			System.out.print(node.info + " ");
			node = node.next;
		}
		System.out.println();
	}
	public void add(E val) { // O(1)
		// Step1. Make a new node
		SLLNode<E> newNode = new SLLNode<E>(val);
		// Step2. Make connection from new node to the first node
		newNode.next = head;
		// Step3. update head
		head = newNode;
	}
	public SLLNode<E> search(E val){
		SLLNode<E> node = head;
		while(node != null) {
			if(node.info.equals(val)) // if( node.info == val)
				return node;
			node = node.next;			
		}
		return null;
	}
	public void remove(E val) {
		if(head == null) // empty
			return;
		SLLNode<E> node = head;
		SLLNode<E> prev = null;
		if(node.info.equals(val)) {
			head = node.next;
			return;
		}
		prev = node;
		node = node.next;
		while (node != null) {
			if(node.info.equals(val)) {
				prev.next = node.next;
				return;
			}
			prev = node;
			node = node.next;
		}
	}
	
	public boolean isEmpty() { return head == null;}
	public boolean isFull() { return false; }
	
	public E get(int idx) { // O(idx)
		// return the value at the given index
		// eg) For a list {10,20,30,40}, get(2) will return 30
		// Assume that idx is valid, i.e. 0<= idx < size()
		SLLNode<E> node = head;
		for (int i = 0; i < idx; i++) {
			node = node.next;
		}
		return node.info;
	}
	public void set(int idx, E val) { // O(idx)
		// set the node's value at the given index with given value
		// eg) For a list {10,20,30,40}, set(2,100) will change it into {10,20,100,40}
		// Assume that idx is valid, i.e. 0<= idx < size()
		SLLNode<E> node = head;
		for (int i = 0; i < idx; i++) {
			node = node.next;
		}
		node.info = val;
	}
	public void addAt(int idx, E val) { // O(idx)
		// insert a node of given value at the given index while pushing some nodes to the right
		// eg) For a list {10,20,30,40}, addAt(2,100) will change it into {10,20,100,30,40}
		// Hint: You may want to stop at idx-1 position to make connections.
		// Assume that idx is valid, i.e. 0<= idx <= size()
		SLLNode<E> newNode = new SLLNode<E>(val);
		if(idx == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		SLLNode<E> node = head.next;
		SLLNode<E> preNode = head;
		for (int i = 0; i < idx - 1; i++) {
			node = node.next;
			preNode = preNode.next;
		}
		newNode.next = node;
		preNode.next = newNode;
	}
	public E[] toArray() { // O(numElements)
		// return an array that contains all the elements(numbers) in the list
		
		//Count number of elements
		int numElements = 0;
		SLLNode<E> node = head;
		while(node != null) {
			numElements++;
			node = node.next;
		}
		
		//These two lines of code are the reason why this assignment is late.
		//I spent way too long trying to find how to create a generic array.
		@SuppressWarnings("unchecked")
		E[] arr = (E[])new Object[numElements];
		
		//Reset node and put values into array
		node = head;
		for(int i = 0; i < numElements; i++) {
			arr[i] = node.info;
			node = node.next;
		}
		return arr;
		
	}
	public MyLinkedList<E> clone() { // O(numElements)
		// return a copy of 'this' object. 
		// Any change made to the copy should be independent of this object.
		MyLinkedList<E> cloneList = new MyLinkedList<E>(toArray()); //Should theoretically work
		return cloneList;
		
	}
	public void removeAll(E val) { // O(numElements)
		// remove all the nodes with given value
		// This is a bonus problem (+5 points). 
		// It is hard. Don't spend too much time on this. You don't lose points if you don't do this.
		if(head == null)
			return;
		SLLNode<E> node = head.next;
		SLLNode<E> preNode = head;
		if(preNode.info == val) {
			head = head.next;
			removeAll(val);
			return;
		}
		while(node != null) {
			if(node.info == val) {
				preNode.next = node.next;
				removeAll(val);
				return;
			}
			node = node.next;
			preNode = preNode.next;
		}
	}
}
