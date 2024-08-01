package hw;

public class MyArrayHw {
	int[] nums;
	int numElements;
	public MyArrayHw() {
		nums = new int[5];
		numElements = 0;
	}
	public MyArrayHw(int[] numbers) {
		nums = new int[numbers.length];
		for(int i=0;i<nums.length;i++)
			nums[i] = numbers[i];
		numElements = nums.length;
	}
	
	public void setNumElements(int elements) {
		numElements = elements;
	}
	
	public void printArray() {
		System.out.printf("printArray(%d,%d):", numElements, nums.length);
		for(int i=0; i<numElements;i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}
	public void enlarge() {
		int[] new_nums = new int[nums.length * 2];
		for(int i=0;i<numElements;i++)
			new_nums[i] = nums[i];
		nums = new_nums;		
	}
	public void add(int val) {	
		if( isFull() ) 
			enlarge();
		nums[numElements++] = val;
	}
	public void add(int val, int pos) {
		// insert given value 'val' at the given position 'pos'
		int temp = nums[pos];
		nums[pos] = val;
		// Move the element originally at the position to the last position
		add(temp);
		// eg) add(10, 1) for {1,2,3,4} will change it into {1,10,3,4,2} 
	}
	public void addOrder(int val, int pos) {
		// insert given value 'val' at the given position 'pos'
		// Need to keep the orders of existing elements
		// eg) addOrder(10, 1) for {1,2,3,4} will change it into {1,10,2,3,4} 
		
		add(0);
		for(int i = numElements - 1; i > pos; i--)		//Shift every element after pos to the right
			nums[i] = nums[i - 1];
		nums[pos] = val;
	}
	public void add(int[] valArray) {
		// add all elements of valArray to the end of the array.
		for (int i = 0; i < valArray.length; i++)
			add(valArray[i]);
	}
	public void addOrder(int idx, int[] valArray) {
		// add all elements of valArray from the specified position.
		// need to keep order
		// eg) [10,20,30] --> addOrder(1,{1,2}) makes {10,1,2,20,30}
		ensureCapacity(numElements + valArray.length);
		for(int i = 0; i < numElements - idx; i++) {
			nums[idx + i + valArray.length] = nums[idx + i];
		}
		for (int i = 0; i < valArray.length; i++) {
			nums[idx + i] = valArray[i];
		}
		numElements = numElements + valArray.length;
	}
	
	public void remove(int val) {
		int index = linearSearch(val);
		if(index >= 0) {
			nums[index] = nums[numElements-1];	// move the last one to the removed location
			numElements--;
		}
	}
	public void removeOrder(int val) {
		int index = linearSearch(val);
		if(index >= 0) {
			for(int i=index;i<numElements-1;i++)	// shifting values to left
				nums[i] = nums[i+1];
			numElements--;
		}	
	}
	public void removeAll(int val) {
		// {10, 2, 10, -4, 10} -> removeAll(10) will make it as {2, -4}
		// algorithm need to be efficient. worst case time complexity O(N).
		int idx = 0;
		for(int i = 0; i < numElements; i++) {
			if(nums[i] != val && idx == i) {
				nums[idx] = nums[i];
				idx++;
			} else if (nums[i] != val && idx != i) {
				nums[idx] = nums[i];
				nums[i] = 0;
				idx++;
			} else {
				nums[i] = 0;
			}
		}
		numElements = idx;
	}
	
	public void repeatEach() {
		// repeat each number once again.
		// For example, {10, 2, 3} becomes {10, 10, 2, 2, 3, 3}
		int length = numElements*2;
		for(int i = 0; i < length; i = i + 2)
			addOrder(nums[i], i + 1);
	}
	
	public int linearSearch(int k) {
		for(int i=0; i<numElements;i++)
			if (nums[i] == k)
				return i;
		return -1;
	}
	boolean isFull() {
		return numElements == nums.length;
	}
	boolean isEmpty() {
		return numElements == 0;
	}
	public void clear() {
		// remove all the elements in the array.
		// Hint: It is very simple.
		for(int i = 0; i < numElements; i++)
			nums[i] = 0;
		numElements = 0;
	}
	public int[] toArray() {
		// return a copy of the array 'nums'.
		// The array size is supposed to be equal to numElements.
		int[] new_nums = new int[numElements];
		for(int i = 0; i < numElements; i++) {
			new_nums[i] = nums[i];
		}
		return new_nums;
	}
	public MyArrayHw clone() {
		// return a copy of the this object which is of MyArray class.
		MyArrayHw myArrayHwClone = new MyArrayHw(nums);
		myArrayHwClone.setNumElements(numElements);			//created new method to manually set numElements
		return myArrayHwClone;
	}
	public void ensureCapacity(int minCapacity) {
		// increase the capacity if it is less than minCapacity
		// Do nothing if it is already greater than that.
		while(nums.length < minCapacity) {
				enlarge();
		}
	}	
}

