package hw;

public class MyQueueDemo {
	public static void main(String[] args) {
		MyQueueLL<Integer> mynums1 = new MyQueueLL<Integer>();
		mynums1.enqueue(10); mynums1.enqueue(20); mynums1.enqueue(-5);
		System.out.println(mynums1.dequeue()); // 10
		System.out.println(mynums1.isEmpty()); // false
		System.out.println(mynums1.dequeue()); // 20
		System.out.println(mynums1.isEmpty()); // false

		MyQueueLL<String> names = new MyQueueLL<String>();
		names.enqueue("John"); names.enqueue("Tom"); names.enqueue("Jane");
		System.out.println(names.dequeue()); // John
		System.out.println(names.isEmpty()); // false
		System.out.println(names.dequeue()); // Tom
		System.out.println(names.isEmpty()); // false
		System.out.println(names.dequeue()); // Jane
		System.out.println(names.isEmpty()); // true
		
	}
}
