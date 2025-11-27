package string.programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter String to Reverse: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Reverse String is: "+reverseString(str));
		sc.close();
		
	}
	
	public static String reverseString(String str) {
		String rev="";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+ str.charAt(i);
		}
		return rev;
		
	}

}