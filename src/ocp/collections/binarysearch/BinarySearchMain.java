package ocp.collections.binarysearch;

import java.util.Arrays;

public class BinarySearchMain {

	static void binarySearch(){
		int[] numbers = {6,9,1,3,8};
		Arrays.sort(numbers); // [1,3,6,8,9]
		System.out.println(Arrays.binarySearch(numbers, 6)); // 1
		System.out.println(Arrays.binarySearch(numbers, 4)); // -3 (-2 -1 = -3)
	}

	public static void main(String[] args) {
		binarySearch();

	}

}
