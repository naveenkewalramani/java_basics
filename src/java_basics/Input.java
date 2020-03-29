package java_basics;
import java.util.Scanner;
public class Input {
	public static void main(String args []) {
		
		// Scanner Object, can be used multiple type
		Scanner input = new Scanner(System.in);
		
		// First line input store in this variable
		String line = input.nextLine();
		System.out.println(line);
		
		// Second line input store in this variable
		int value = input.nextInt();
		System.out.println(value);
	}
}
