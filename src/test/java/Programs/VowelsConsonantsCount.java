package Programs;

public class VowelsConsonantsCount {
	public static void main(String[] args) {
		String str = "hello world";
		int vowels = 0, consonants = 0;
		str = str.toLowerCase();
		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonants++;
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
	}

}
