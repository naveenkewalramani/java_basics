package java_basics;

class Tools {
	public void type() {
		System.out.println("This is a tool");
	}
}

class Hammer extends Tools {
	public void type() {
		System.out.println("This is a hammer");
	}

	public void special() {
		System.out.println("This method is special to hammer");
	}
}

public class UpDownCating {

	public static void main(String[] args) {
		Tools t1 = new Tools();
		t1.type();

		Hammer h1 = new Hammer();
		h1.type();
		h1.special();

		// polymorphism
		Tools t2 = new Hammer();
		t2.type();
		// t2.special(); Method is not accessible in case of polymorphism

		// Upcasting
		Tools t3 = h1;
		t3.type();
		// t3.special(); Method is not accessible in case of upcasting.
		// Actual variable decides what variable can be called

	}
}
