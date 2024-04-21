package Programs;

import java.util.Arrays;

public class MinMaxArray {
	
	public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 20, 8};
        Arrays.sort(numbers);
        int smallest = numbers[0];
        int largest = numbers[numbers.length - 1];
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

}
