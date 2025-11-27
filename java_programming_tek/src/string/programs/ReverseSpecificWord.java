package string.programs;

public class ReverseSpecificWord {
	public static void main(String[] args) {
		String str = "I am from Delhi";
		String[] split = str.split(" ");
		
		for (String words : split) {
			String rev = words;
			
			if (words.equals("from")) {
				rev = "";
				for (int i = words.length() - 1; i >= 0; i--) {

					rev = rev + words.charAt(i);
				}
				System.out.print(rev + " ");
			} else
				System.out.print(rev + " ");
		}
	}
	
	public static String reverseString(String str) {
		String rev="";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+ str.charAt(i);
		}
		return rev;
		
	}

}
