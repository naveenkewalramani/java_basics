package java_basics;

public class HelloWorld {
	
	public static void main (String [] args) {
		System.out.println("Hi, this is my inital code");
		int number = 10; // 32 bit value
		short shortNumber = 2; // 16 bit value
		long longNumber = 1010100; //64 bit value
		double doubleNumber = 29.22; //
		float floatNumber = 9.23f; //small version of double
		char myChar = 'I';
		boolean bool = true;
		int returnNumber = testFunctionInteger(number);
		short returnShortNumber = testFunctionShort(shortNumber);
		System.out.println(returnNumber);
		System.out.println(returnShortNumber);
		System.out.println(longNumber);
		System.out.println(doubleNumber);
		System.out.println(floatNumber);
		System.out.println(myChar);
		System.out.println(bool);
	}
	
	private static int testFunctionInteger(Integer number) {
		System.out.println("This function will print a integer number");
		System.out.println(number);
		return number+2;
	}
	
	private static short testFunctionShort(Short number) {
		System.out.println("This function will print a short integer number");
		System.out.println(number);
		return (short) (number + 2);
	}

}