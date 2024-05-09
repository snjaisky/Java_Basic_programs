package Programs;

public class ReverseString {

	public static void reverse(String value) {

		String input = value;

		String[] words = input.split(" ");

		String reverseSentence = "";

		for (String word : words) {
			String reverseword = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				reverseword = reverseword + word.charAt(i);
			}
			reverseSentence = reverseSentence + reverseword + " ";
		}

		System.out.print(reverseSentence + " ");

	}

	public static void main(String[] args) {
		//reverse(" I am an software tester");
		
		
		

	}

}
