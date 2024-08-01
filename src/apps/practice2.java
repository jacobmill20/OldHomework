/* Java 8 Primitive Types
 * 
 * boolean - 1 bit (1 byte)
 * byte - 1 byte  (-128 - 127)
 * short - 2 bytes  (-32,768 - 32,767)
 * int - 4 bytes
 * long - 8 bytes
 * 
 * float - 4 bytes
 * double - 8 bytes
 * char - 2 bytes
 * 
 * Using a smaller primitive types saves RAM space but does not speed up reading time
 * 
 * Reference types
 * String    eg) String s1 = "Hello";
 * Objects
 */




package apps;

public class practice2 {
	static void printArray(int[] nums) {
		//display all elements to the screen
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	static int linearSearch(int[] nums, int val){
		//return the index of the 'val' if found
		//return -1 if not found
		for(int i=0; i<nums.length;i++) {
			if (nums[i] == val)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
//		int[] nums1;		//declaring int array variable
//		nums1 = new int[10]; //Allocating neccessary memory
		
//		int[] nums1 = new int[20]; //Single line method
		int[] nums1 = new int[] {10,20,40}; //Allocates memory depending on the number of values in list
		
		
//		System.out.println(nums1[0]);
//		System.out.println(nums1[1]);
//		System.out.println(nums1[nums1.length-1]);
		printArray(nums1);
		System.out.println(linearSearch(nums1,20));
		
//		nums1[0] = 100;
//		nums1[1] = 30;
//		System.out.println(nums1[0]);
//		System.out.println(nums1[1]);
//		printArray(nums1);

		
		

	}

}
