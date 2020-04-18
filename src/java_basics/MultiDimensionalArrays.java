package java_basics;

import java.util.Scanner;

public class MultiDimensionalArrays {

	public static void main(String[] args) {

		// Initialization and Declaration
		int[][] grid1 = { { 1, 2 }, { 3, 4 } };
		// Simple input and printing;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(grid1[i][j]);
			}
		}

		try (// Taking input from user and than printing
		Scanner input = new Scanner(System.in)) {
			int[][] grid2 = new int[2][2];
			for (int i = 0; i < grid2.length; i++) {
				for (int j = 0; j < grid2.length; j++) {
					grid2[i][j] = input.nextInt();
				}
			}
			for (int i = 0; i < grid2.length; i++) {
				for (int j = 0; j < grid2.length; j++) {
					System.out.println(grid2[i][j]);
				}
			}
		}
	}
}
