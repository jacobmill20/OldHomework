package hw;

public class MyArrayHwDemo {
	public static void main(String[] args) {
		MyArrayHw test = new MyArrayHw(new int[] {1, 4, 6, 10, -4, 10, 5, -4});
		test.printArray();


//		test.enlarge();
//		test.add(20, 1);
//		test.add( new int[]{10, 1, 3} );
//		test.addOrder( 1, 0);
//		test.addOrder( 0, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
//		test.removeAll(-4);
//		test.repeatEach();
//		test.clear();
//		int[] test2 = test.toArray();
		MyArrayHw cloned = test.clone();
		cloned.printArray();
//		test.ensureCapacity(33);
		
//		test.printArray();
//		printArray(test2);
		

	}
	
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
