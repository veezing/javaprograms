package string.programs;

public class SwapFirstAndLastWord {
	public static void main(String[] args) {
		String s = "I am from Delhi";
		String[] str = s.split(" ");

		String temp = str[str.length - 1];
		str[str.length - 1] = str[0];
		str[0] = temp;

		for (String s1 : str) {
			System.out.print(s1 + " ");
		}
	}

}
