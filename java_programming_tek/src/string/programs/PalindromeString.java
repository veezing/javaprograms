package string.programs;

public class PalindromeString {
	
	public static void main(String[] args) {
		String str = "Markram";
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			rev = rev+ch;
		}
		
		if(rev.equalsIgnoreCase(str))
			System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is NOT a Palnidrome");
	
	}

}
