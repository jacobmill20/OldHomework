package hw;

public class MyArrayForChar {
	char[] nums;
	int numElements;
	public MyArrayForChar(){ // O(1)	// cost, times
		nums = new char[5]; 		
		numElements = 0;		
	}
	public MyArrayForChar(int capacity) { // O(capacity)
		nums = new char[capacity];
		numElements = 0;
	}
	public MyArrayForChar(char[] nums1) { // O(nums1.length)
		nums = new char[nums1.length];
		for(int i=0;i<nums1.length;i++)
			nums[i] = nums1[i];
		numElements = nums1.length;
	}
	public void printArray() { // O(numElements)
		System.out.printf("printArray(%d,%d): ", numElements, nums.length);
		for(int i=0;i<numElements;i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}
	private void enlarge() { // O(nums.length)
		// increase the size of the array 'nums'
		char[] newNums = new char[nums.length * 2]; // O(nums.length)
		for(int i=0;i<numElements;i++)			  // O(numElements)
			newNums[i] = nums[i];
		nums = newNums;
	}
	public void add(char val) { // worst-cast: O(nums.length), best/avg case: O(1)
		if(isFull()) // O(1)
			enlarge(); // O(nums.length)
		nums[numElements++] = val; // O(1)
	}
	public void removeAt(int idx) { // O(1)
		// remove any number at position 'idx'
		// don't have to keep the order of numbers
		if(idx<0 || idx >= numElements)
			return;
		nums[idx] = nums[numElements-1];
		numElements--;
	}
	public int remove(char val) { // O(numElements)
		// remove a number, if any, equal to 'val'
		// first, need search for the number equal to val
		int idx = linearSearch(val); // O(numElements)
		if(idx < 0)
			return 0;
		removeAt(idx);
		return 1;
	}
	public int removeAll(char val) { // O(numElements)
//		int cnt=0;
//		while (remove(val) > 0)
//			cnt++;
//		return cnt;
		int cnt=0; // number of elements remove;
		int j=0;
		for(int i=0;i<numElements;i++) {
			if(nums[i] != val)
				nums[j++] = nums[i];
			else
				cnt++;
		}
		numElements = j;
		return cnt;
	}
	
	public int linearSearch(char val){ // best:O(1), worst:O(numElements)
		for(int i=0;i<numElements;i++) { // best:O(1), worst:O(numElements)
			if(nums[i] == val)			
				return i;				
		}
		return -1;						
	}
	public char findMax() { // O(numElements)
		// return the maximum value in the array 'nums'
		char maxV = nums[0];
		for(int i=1;i<numElements;i++) {
			if (nums[i] > maxV)
				maxV = nums[i];
		}
		return maxV;
	}
	public char findMin() { // O(numElements)
		// return the minimum value in the array 'nums'
		char minV = nums[0];
		for(int i=1;i<numElements;i++) {
			if (nums[i] < minV)
				minV = nums[i];
		}
		return minV;
	}
	public void sort() { // O(numElements^2)
		// selection sort. select first mininum to keep at 0, select second min to keep at 1,...
		int minIdx;
		char temp;
												// cost, 	times
		for(int j=0;j<numElements;j++) {		// c1,		numElements+1 (j=0,1,2,...,numElements)
			minIdx = j;							// c2,		numElements (j=0,1,2,...,numElements-1)
			for(int i=j+1;i<numElements;i++)	// c3,		1/2*numElements^2 => j=0(i=1,2,...,numElements)=N, j=1(i=2,3...numElements)=N-1, N-2, ..., 1
				if(nums[i] < nums[minIdx])		// c4,		1/2*numElements^2
					minIdx = i;					// c5,		1/2*1/2*numElements^2
			// swap nums[j] and nums[minIdx]
			temp = nums[j];						// c6,		numElements
			nums[j] = nums[minIdx];				// c7,		numElements
			nums[minIdx] = temp;				// c8,		numElements
		}
	}
	public char sum() {
		char total = 0;
		for(int i=0;i<numElements;i++)
			total += nums[i];
		return total;
	}
	public int size() { return numElements; }
	public boolean isFull() { return numElements == nums.length; } // O(1)
	public boolean isEmpty() { return numElements == 0; }	// O(1)
}
