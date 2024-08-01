package exam;

public class ListDemo4 {
	public static SLLNode<Integer> list(int[] nums){
		SLLNode<Integer> ls = null;
		for(int i=nums.length-1; i>=0;i--) {
			SLLNode<Integer> newNode = new SLLNode<Integer>(nums[i]);
			// insert at the beginning
			newNode.next = ls;
			ls = newNode;
		}
		return ls;
	}
	public static void printLinkedList(SLLNode<Integer> node){	
		System.out.print("printLinkedList(): ");
		while(node != null) {
			System.out.print(node.info+" ");
			node = node.next;
		}
		System.out.println();
	}
	public static SLLNode<Integer> delta(SLLNode<Integer> node){
		// Use RECURSION !!!
		// return a new list that shows the value change between numbers in the list
		// For example, list {10,20,5} has value changes 10(=20-10), -15(=5-20). 
		// return an empty list (null) when the input list is empty or has only one number.

		// if the input list is null or does not have more element, return null
		if(node == null || node.next == null) {
			return null;
		}
		// create a new node with the value difference between the current node and it next one.
		SLLNode<Integer> nextNode = node.next;
		SLLNode<Integer> diff = new SLLNode<Integer>(nextNode.info - node.info);
		
		// connect this new node to the remaining list, which will be done by recursion 
		diff.next = delta(nextNode);
		
		// and return the new node
		return diff;

	}
	public static void main(String[] args) {
		printLinkedList(delta(list(new int[] {10,20,5}))); // 10 -15
		printLinkedList(delta(list(new int[] {10}))); // empty
		printLinkedList(delta(list(new int[] {}))); // empty
		printLinkedList(delta(list(new int[] {10,0,30,100}))); // -10 30 70
	}
}
