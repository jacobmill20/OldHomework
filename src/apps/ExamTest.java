package apps;

public class ExamTest {

	public static void main(String[] args) {
		int[] myArray = new int[] {1, 2, 3, 4};
		reverse(myArray);
		printArray(myArray);

	}
	static void reverse(int[] nums) {
		int[] temp = nums;
		for (int i = 0; i < nums.length; i++)
			nums[i] = temp[temp.length - 1 - i];
	}
	static void printArray(int[] nums) {
		System.out.print("printArray:");
		for(int i=0; i<nums.length;i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}

}
