package core.java.demo;

import java.util.Arrays;

public class SortArray {

	public void sortArrayImplementation() {

		// Array initialised
		int arr[] = { 2, 1, 9, 5, 8, 4, 5, 6, 2, 7 };

		// Sorted Array
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Search element from array
		int index = Arrays.binarySearch(arr, 4);
		System.out.println("Number found @ " + index + " index value");

	}

	public static void main(String[] args) {
		SortArray sa = new SortArray();
		sa.sortArrayImplementation();

	}

}
