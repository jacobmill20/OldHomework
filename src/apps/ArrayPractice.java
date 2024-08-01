package apps;

public class ArrayPractice {

	static void printArray(int[] nums) {	// T(nums.length) = O(nums.length)
		// This function is complete. Here to help your test
		System.out.print("printArray(): ");
		for(int i=0; i<nums.length;i++)			// c1, nums.length
			System.out.print(nums[i] + " ");	// c2, nums.length
		System.out.println();					// c3, 1
	}
	
	static void shiftRightArray(int[] nums) {
		// make change to nums. 
		// Shift the elements to the right by 1 position. left most elements goes to the right most pos.
		int temp = nums[nums.length-1];
		for(int i=1; i < nums.length; i++) {
			nums[nums.length-i]=nums[nums.length-1-i];
		}
		nums[0] = temp;
		// nums = [10,2,3,-5]. shiftRightArray(nums) will change it to [-5, 10, 2,3]
		
	}
	
	static int[] generateEvenNumbers(int count) {
		// Return a new int array filled with n even numbers starting from 2. 
		int[] evenArray = new int[count];
		for(int i = 0; i < count; i++) {
			evenArray[i]= 2*(i+1);
		}
		return evenArray;
		// eg) generateEvenNumbers(3) returns [2,4,6]
		// eg) generateEvenNumbers(5) returns [2,4,6,8,10]
		
	}
	
	static int[] insertKeepOrder(int[] nums, int idx, int val) {
		// Return a new int array.
		// insert the given 'val' at index 'idx' pushing numbers to the right.
		int[] newNums = new int[nums.length+1];
		int index = 0;
		for(int i = 0; i < idx; i++) {
			newNums[index] = nums[index];
			index++;
		}
		newNums[idx] = val;
		index++;
		for(int j = index; j < newNums.length; j++) {
			newNums[index] = nums[index-1];
			index++;
		}
		return newNums;
		//		insertKeepOrder([10,20,30],0,5) will return [5, 10, 20, 30]
		//		insertKeepOrder([10,20,30],1,5) will return [10, 5, 20, 30]
		
	}
	
	static int[] reverseNew(int[] nums) {
		// Return a new int array that is reversed version of nums
		int[] newArray = new int[nums.length];
		for(int i = 0; i < nums.length; i++)
			newArray[i] = nums[nums.length-1-i];
		return newArray;
		// eg) reverseNew([1,2,3]) returns [3,2,1]
		// eg) reverseNew([5,1,2,3]) returns [3,2,1,5]
		
	}
	
	public static void main(String[] args) {
		int[] nums1 = new int[] {10,2,3,-5,20,10,4};
		int[] nums2 = new int[] {5,7,9,10,20,48,29,4};
		
		System.out.println("shiftRightArray:");
		shiftRightArray(nums1); //{4, 10, 2, 3, -5, 20, 10}
		printArray(nums1);
		
		// add you test codes below. You have freedom how to test. 
		System.out.println();
		System.out.println("generateEvenNumbers:");
		printArray(generateEvenNumbers(3));
		printArray(generateEvenNumbers(5));
		
		System.out.println();
		System.out.println("insertKeepOrder:");
		printArray(insertKeepOrder(nums1, 3, 100));
		
		System.out.println();
		System.out.println("reverseNew:");
		printArray(reverseNew(nums1));

	}

}
