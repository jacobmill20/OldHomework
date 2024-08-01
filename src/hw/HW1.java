//Jacob Miller
//Homework 1

package hw;

public class HW1 {

	static String score2letterGrade(double max, double score) {
		double percent = score/max;
		if (percent >= 0.9)
			return "A";
		else if (percent >= 0.8 && percent < 0.9)
			return "B";
		else if (percent >= 0.7 && percent < 0.8)
			return "C";
		else if (percent >= 0.6 && percent < 0.7)
			return "D";
		else
			return "F";
	}
	
	static void displayLinearSpace(double start, double end, int count) {
		double interval = (end-start)/(count-1); 		//Isolate the interval between numbers depending on the count
		for (int i = 0; i < count; i++) { 				//Print each number and add the interval each time
			System.out.print((start + interval*i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.println("__Part 1__");
		System.out.println(score2letterGrade(100,90)); //A
		System.out.println(score2letterGrade(100,81)); //B
		System.out.println(score2letterGrade(100,70)); //C
		System.out.println(score2letterGrade(100,68)); //D
		System.out.println("Now max is 110");
		System.out.println(score2letterGrade(110,90)); //B
		System.out.println(score2letterGrade(110,81)); //C
		System.out.println(score2letterGrade(110,70)); //D
		System.out.println(score2letterGrade(110,68)); //D
		System.out.println();

		System.out.println("__Part 2__");
		displayLinearSpace(10, 20, 2);
		displayLinearSpace(10, 20, 3);
		displayLinearSpace(10, 20, 4);
		displayLinearSpace(1, 2, 5);

	}

}
