package java_basics;

public class Products {
	// Each object has copy of variables like name,id
	public String name; // instance variables
	public int id; // instance variables

	// Static is shared at class level. same across all objects of that class
	public static String company; // class variable

	public void printDetails() {
		System.out.println("Name: " + this.name + ", Id: " + this.id + ", Company: " + Products.company);
	}

	public Products() {

	}

	public Products(String name, int id, String company) {
		this.name = name;
		this.id = id;
		Products.company = company;
	}

	public static void main(String[] args) {

		Products p1 = new Products();
		Products p2 = new Products("gogle", 120, "Amazon");
		Products p3 = new Products("tie", 121, "Flipkart");
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();
	}
}
