package java_basics;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		switch (text) {
		case "start":
			System.out.println("System is started");
			break;
		case "stop":
			System.out.println("System is stopped");
			break;
		default:
			System.out.println("System does not understand " + text + "command");
			break;
		}
	}
}
