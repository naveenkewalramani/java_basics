package java_basics;

import java.util.Scanner;

class Person {
	String name, gender;
	int age;

	void printName() {
		System.out.println(this.name);
	}

	void printAge() {
		System.out.println(this.age);
	}

	void printGender() {
		System.out.println(this.gender);
	}

	int yearsLeftInRetirement() {
		int retirementAge = 60;
		if (this.age > retirementAge) {
			return -1;
		} else {
			return retirementAge - this.age;
		}
	}
}

// File can have only one public class but multiple non-public class
// class contains data/function/methods
public class Classes {

	public static void main(String[] args) {
		System.out.println("Creating a person please enter name, age and gender(male/female) in new lines");
		try (Scanner input = new Scanner(System.in)) {
			Person person1 = new Person();
			person1.name = input.nextLine();
			person1.age = input.nextInt();
			person1.gender = input.nextLine();
			person1.printName();
			person1.printAge();
			person1.printGender();
			System.out.println("Name of person is " + person1.name);
			System.out.println(person1.yearsLeftInRetirement() + " years are left in my retirment");
		}
	}
}
