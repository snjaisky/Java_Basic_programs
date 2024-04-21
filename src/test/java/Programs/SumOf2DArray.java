package Programs;

public class SumOf2DArray {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int[] row : matrix) {
			for (int num : row) {
				sum += num;
			}
		}
		System.out.println("Sum of all elements in the 2D array: " + sum);
	}

}
