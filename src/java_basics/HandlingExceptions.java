package java_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions {
	// Way 1
//	public static void main(String args []) throws FileNotFoundException {
//		File f = new File("random.txt");
//		FileReader fr = new FileReader(f);
//	}

	public static void main(String args[]) {
		File f = new File("random.txt");
		try {
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("This is Stack trace");
			e.printStackTrace();
		}
	}
}
