package hw;

public class MyArrayDemoTwo {
	static void printArray(int[] nums) { // O(nums.length) 
		// display all elements to the screen
											// cost, times
		for(int i=0;i< nums.length;i++) {	// c1,	 nums.length + 1 (i=0,1,...,nums.length)
			System.out.print(nums[i] + " ");// c2,	 nums.length
		}		
		System.out.println();				// c3,   1
	}
	public static void main(String[] args) {
//		MyArrayForString names = new MyArrayForString();
//		names.add("john"); names.add("Tom"); names.add("Matt"); names.add("Tom");
//		names.printArray();
//		System.out.println(names.linearSearch("Tom"));
//		System.out.println(names.findMax());
//		names.sort(); names.printArray();
//		names.removeAt(0); names.printArray();
//		names.removeAll("Tom"); names.printArray();
		
//		String s1 = "10,10,9,6,10,10,10";
//		MyArray scores = new MyArray();
//		for(String a:s1.split(","))
//			scores.add(Integer.valueOf(a));
//		scores.printArray();
//		scores.remove(scores.findMin());
//		System.out.println("The average = " + (double)scores.sum()/scores.size());
//		String s1 = "abc";
//		String s2 = "ccc";
//		System.out.println( s1.compareTo(s2) ); // negative int, 0, positive int
//		System.out.println( s2.compareTo(s1) ); // negative int, 0, positive int
		
//		MyArrayForInt nums1 = new MyArrayForInt();
////		nums1.printArray();
////		System.out.println(nums1.isEmpty());
////		System.out.println(nums1.isFull());
//		nums1.add(20); nums1.add(30); nums1.add(10); nums1.add(5); nums1.add(20);		
//		nums1.printArray();
		
////		nums1.remove(30); nums1.printArray();
////		nums1.remove(20); nums1.printArray();
//		nums1.removeAll(20); nums1.printArray();
		
//		nums1.removeAt(0); nums1.printArray();
//		nums1.removeAt(0); nums1.printArray();
//		nums1.removeAt(1); nums1.printArray();
//		nums1.removeAt(3); nums1.printArray();
//		nums1.removeAt(1); nums1.printArray();
		
//		System.out.println(nums1.linearSearch(30));
//		System.out.println(nums1.linearSearch(20));
//		System.out.println(nums1.linearSearch(50));
		
//		System.out.println(nums1.isEmpty());
//		System.out.println(nums1.isFull());		
//		nums1.add(10);		
//		nums1.printArray();
//		System.out.println(nums1.isEmpty());
//		System.out.println(nums1.isFull());		
		
		MyArrayForDouble nums1 = new MyArrayForDouble();
		nums1.printArray();
		System.out.println(nums1.isEmpty());
		System.out.println(nums1.isFull());
		nums1.add(20); nums1.add(30); nums1.add(10); nums1.add(5); nums1.add(20);		
		nums1.printArray();
	
		nums1.remove(30); nums1.printArray();
		nums1.remove(20); nums1.printArray();
	
		nums1.removeAt(0); nums1.printArray();
		
		nums1.add(3.5); nums1.printArray();
		nums1.add(8.25); nums1.printArray();
		nums1.add(2.7); nums1.printArray();
		
		System.out.println(nums1.linearSearch(8.25));
		System.out.println(nums1.linearSearch(20));
		System.out.println(nums1.linearSearch(50));
		
		System.out.println(nums1.findMin());
		System.out.println(nums1.findMax());
		
		nums1.sort(); nums1.printArray();
		
		System.out.println();
		System.out.println();
	
		
		MyArrayForChar chars1 = new MyArrayForChar();
		chars1.printArray();
		System.out.println(chars1.isEmpty());
		System.out.println(chars1.isFull());
		chars1.add('A'); chars1.add('B'); chars1.add('C'); chars1.add('D'); chars1.add('E');		
		chars1.printArray();
	
		chars1.remove('B'); chars1.printArray();
		chars1.removeAll('C'); chars1.printArray();
	
		chars1.removeAt(0); chars1.printArray();
		
		chars1.add('Z'); chars1.printArray();
		chars1.add('t'); chars1.printArray();
		chars1.add('s'); chars1.printArray();
		
		System.out.println(chars1.linearSearch('D'));
		System.out.println(chars1.linearSearch('E'));
		System.out.println(chars1.linearSearch('a'));
		
		System.out.println(chars1.findMin());
		System.out.println(chars1.findMax());
		
		chars1.sort(); chars1.printArray();
		
	}
}
