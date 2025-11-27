package practice;

public class CountVowelConsSplInAString {
	public static void main(String[] args) {
		String str = "*abeow#$";
		int vowel = 0, cons = 0, spl = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowel++;
				else
					cons++;
			}

			else
				spl++;
		}
		System.out.println("Vowel Count " + vowel);
		System.out.println("Consonant Count " + cons);
		System.out.println("Spl Char Count " + spl);
	}

}
