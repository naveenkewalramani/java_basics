// Constructors introduced

package java_basics;

class MakeMachine {
	private String name, type, code;
	// Constructors name is same as class with not data type of function

	// Default constructors with no parameter
	public MakeMachine() {
		name = "";
		type = "";
		code = "";
	}

	// Constructors with 1 parameter(set name)
	public MakeMachine(String name) {
		this.name = name;
	}

	// Constructors with 2 parameter(set name and type)
	public MakeMachine(String name, String type) {
		this.name = name;
		this.type = type;
	}

	// Constructor with 3 parameter(name, type code)
	public MakeMachine(String name, String type, String code) {
		this(name, type); // constructor call should be the first statement
		this.code = code;
	}

	public void printDetails() {
		System.out.println(
				"Name of the machine is " + this.name + " and type is " + this.type + " and code is " + this.code);
	}
}

public class Machine {
	public static void main(String[] args) {
		MakeMachine machine1 = new MakeMachine();
		MakeMachine machine2 = new MakeMachine("Alpha");
		MakeMachine machine3 = new MakeMachine("Beta", "Motor");
		MakeMachine machine4 = new MakeMachine("Gamma", "Scope", "122");

		machine1.printDetails();
		machine2.printDetails();
		machine3.printDetails();
		machine4.printDetails();

	}
}
