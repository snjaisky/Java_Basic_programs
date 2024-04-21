package Programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2))
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		else
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
	}

}
