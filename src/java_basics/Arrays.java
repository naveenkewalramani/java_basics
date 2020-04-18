package java_basics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Integer array");
			intArray();
			System.out.println("String Array");
			stringArr();
			System.out.println("Short Array");
			System.out.println("Please Enter size of array");
			int arr_size = input.nextInt();
			shortArr(arr_size);
		}
	}

	public static void intArray() {
		int[] arr = new int[5];
		try (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i < 5; i += 1) {
				arr[i] = input.nextInt();
			}
		}
		for (int i = 0; i < 5; i += 1) {
			System.out.println(arr[i]);
		}
	}

	public static void stringArr() {
		String[] arr = new String[5];
		try (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i < 5; i += 1) {
				arr[i] = input.nextLine();
			}
		}
		for (int i = 0; i < 5; i += 1) {
			System.out.println(arr[i]);
		}
	}

	public static void shortArr(int arr_size) {
		try (Scanner input = new Scanner(System.in)) {
			short[] arr = new short[arr_size];
			for (int i = 0; i < arr_size; i++) {
				arr[i] = input.nextShort();
			}
			for (int i = 0; i < arr_size; i++) {
				System.out.println(arr[i]);
			}
		}
	}
}
