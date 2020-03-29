package java_basics;

public class Loops {
	
	// Main Method that will be executed on compilation
	public static void main(String [] args) {
		System.out.println("While Loop start");
		whileLoop();
		System.out.println("While loop end");
		System.out.println("For loop begin");
		forLoop();
		System.out.println("For loop end");
		System.out.println("Do while loop");
		doWhileLoop();
		System.out.println("Do while loop");
	}
	
	// Method to execute for loop
	public static void whileLoop() {
		int number = 10;
		int counter = 0;
		while(number > counter ) {
			System.out.println(counter);
			counter += 1;
		}
	}
	
	// Method to execute for loop
	public static void forLoop() {
		int number = 10;
		for (int counter = 0; counter <= number; counter += 1) {
			System.out.println(counter);
		}
	}
	
	// Method to execute for loop
	public static void doWhileLoop() {
		int number = 10;
		int counter = 0;
		do {
			System.out.println("This is " + counter);
			counter += 1;
		}while(counter < number);
	}

}
