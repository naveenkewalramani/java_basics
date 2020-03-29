package java_basics;

public class Strings {

	public static void main(String[] args) {
		
		int number = 10;
		String textObject = "Name is Naveen";
		System.out.println(textObject);
		String blankObjectString = "";
		String addTwoString = textObject + blankObjectString;
		System.out.println(addTwoString);
		System.out.println(textObject + blankObjectString);
		System.out.println("Int added to string" + number);
	}
}
