package hw;

public class RecursionPractice {
	public static void printAlphabetsHelper(char ch)
	{
		/*Code goes here.*/
		if (ch == 'Z') {
			System.out.println(ch);
			return;
		}
		System.out.print(ch + " ");
		printAlphabetsHelper((char)(ch + 1));	// change this as needed
	}
	public static void printAlphabets()
	{
		// This is complete. Nothing to do in this function.
		// this is a wrapper function that simply rely on recursive function printAlphabetHelper(ch)
		// This prints "ABCDEFGHIJKLMNOPQRSTUVWXYZ" one character after another.
		printAlphabetsHelper('A');
	}

	public static boolean isLarger(int a, int b)
	{
		// Assume both a and b are non-negative integers.
		// NOT ALLOWED TO USE '<' or '>' operators, only '==' is allowed. Use recursion
		// if a is larger, then returns true
		// Or (including equal), returns false

		/*Code goes here.*/
		if(a == b)
			return true;
		if(a == 0)
			return false;
		return isLarger(a - 1, b);
	// change this as needed
	}

	public static void printPrimeFactorsHelper(int n, int divisor)
	{
		// if n is divided by divisor, then print divisor 
		//		and recursive call with (n/divisor, divisor)
		// if n is not divided by divisor, recursive call with (n, divisor+1)
		// stop when n is too small 
		/*Code goes here.*/
		if (n < divisor)
			return;
		if (n % divisor == 0) {
			System.out.print(divisor + " ");
			printPrimeFactorsHelper(n/divisor, divisor);
			return;
		}
		printPrimeFactorsHelper(n, divisor + 1);
			
	}
	public static void printPrimeFactors(int n)
	{
		// This is complete. Nothing to do in this function.
		// This prints prime factors of n. 
		// eg) printPrimeFactors(60) will print 2 2 3 5
		printPrimeFactorsHelper(n, 2);
		System.out.println();
	} 

	public static int sumAll(SLLNode<Integer> node) 
	{ 
		// sum all values in the list
		// eg) List 10,-5,10,20 --> sumAll() returns 35.  
		/*Code goes here.*/
		int sum = node.info;
		if(node.next == null) {
			return sum;
		}
		sum = sum + sumAll(node.next);
		return sum;
	}

	public static int findMax(SLLNode<Integer> node)
	{
		// returns the maximum value in the linked list
		/*Code goes here.*/
		int max = node.info;
		if(node.next == null) {
			return max;
		}
		int nextMax = findMax(node.next);
		if (max < nextMax)
			max = nextMax;
		return max;	// change this as needed
	}

	public static void printLinkedListReverse(SLLNode<Integer> node)
	{
		// print the linked list contents in reverse order.
		// For example of a list A-->B-->C
		// this prints "C B A"
		/*Code goes here.*/
		if(node.next == null) {
			System.out.print(node.info + " ");
			return;
		}
		printLinkedListReverse(node.next);
		System.out.print(node.info + " ");
	}

	public static boolean subsetSum(SLLNode<Integer> node, int target)
	{
		// returns true if any of subset of numbers[] sum to target
		// For example, The list is {2,3,5,7,11}, target=12
		// a subset {5,7} sums to 12. 
		// Another subset {2,3,7} sums to 12 too.
		// If no such subset exist, it returns false.
		/*Code goes here.*/
		if(target == 0)
			return true;
		if(node == null)
			return false;
		if(subsetSum(node.next, target-node.info))
			return true;
		return subsetSum(node.next, target);
	}

	public static SLLNode<Integer> remove(SLLNode<Integer> node, int val)
	{
		// remove the first instance of 'val'
		// eg) List 10,-5,10,20,10,4 --> -5,10,20,10,4 after remove(10)  

		// return if the given list is null
		// if node has info equal to val, skip this node and return whatever is returned from its recursive call
		// if node has info NOT equal to val, return this node with its connection to whatever is returned from its recursive call 
		/*Code goes here.*/
		if (node == null)
			return null;
		if (node.info == val) {
			return node.next;
		}
		node.next = remove(node.next, val);
		return node;
	}
		
	
	public static SLLNode<Integer> removeAll(SLLNode<Integer> node, int val) 
	{ // requirement: worst-case time complexity O(N) while N is the number elements in the list
		
		// similar to remove() above.
		// remove all instances of 'val'
		// eg) List 10,-5,10,20,10,4 --> -5,20,4 after removeAll()  
		/*Code goes here.*/
		if (node == null)
			return null;
		if (node.info == val) {
			return removeAll(node.next, val);
		}
		node.next = removeAll(node.next, val);
		return node;
		
	}
	
	// Following functions are here just to help testing
	static SLLNode<Integer> buildLinkedList(int[] nums) { // O(nums.length)
		SLLNode<Integer> head = null;
		for(int i=nums.length-1;i>=0;i--) {
			SLLNode<Integer> newNode = new SLLNode<Integer>(nums[i]);
			newNode.next = head;
			head = newNode;
		}
		return head;
	}
	static void printLinkedList(SLLNode<Integer> node) { // O(numElements)
		System.out.print("printLinkedList(): ");
		while( node != null) {
			System.out.print(node.info + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//printAlphabets();
		//System.out.println(isLarger(1,100));
		//printPrimeFactors(60);
		
		SLLNode<Integer> ls = buildLinkedList(new int[] {20,-5,10,25,10,4,20,-5});
		System.out.println("The total sum is "+sumAll(ls));
		System.out.println("The Max number is "+findMax(ls));
		//printLinkedListReverse(ls);
//		System.out.println(subsetSum(buildLinkedList(new int[]{2,3,5,7,11}), 12));
//		System.out.println(subsetSum(buildLinkedList(new int[] {2,3,5,7,11}), 50));
//		System.out.println(subsetSum(buildLinkedList(new int[] {2,1,1,9}), 11));
//		System.out.println(subsetSum(buildLinkedList(new int[] {2,8}), 11));
//		System.out.println(subsetSum(buildLinkedList(new int[] {5}), 11));
		//ls = remove(ls, 10); System.out.print("List is ..."); printLinkedList(ls);
		//ls = removeAll(ls, -5);	System.out.print("List is ..."); printLinkedList(ls);
	}

}