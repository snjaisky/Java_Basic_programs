package Programs;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 3, 20, 8 };
		Arrays.sort(arr);
		
		for (int a : arr) {
			System.out.print(a+ " ");
		}
				
		
		int secondLargest = arr[arr.length - 2];
		System.out.println("Second largest element in the array: " + secondLargest);
	}

}
