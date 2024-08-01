package hw;

public class MyBTSDemo {

	public static void main(String[] args) {
		MyBST<Integer> tr1 = new MyBST<Integer>();
		tr1.add(5);
		tr1.add(2);
		tr1.add(3);
		tr1.add(4);
		tr1.add(6);
		tr1.add(1);

		System.out.println(tr1.size());
		System.out.println(tr1.sum());
		System.out.println(tr1.height());
	}
}
