package Programs;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		int first = 0, second = 1;
		System.out.print("Fibonacci series up to " + n + " terms: ");
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
