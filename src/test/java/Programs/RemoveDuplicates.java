package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 5, 20, 10 };
		Set<Integer> set = new HashSet<Integer>();
		for (int num : numbers) {
			set.add(num);
		}
		Integer[] uniqueNumbers = set.toArray(new Integer[set.size()]);
		System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));
	}

}
