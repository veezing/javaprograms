package numbers;

import java.util.Scanner;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		String hexadecimal=convertDecToHex(n);
		System.out.println(hexadecimal);
	}
	public static String convertDecToHex(int n) {
		String hex=""; int num=n;
		while(n>0) {
			int rem=n%16;
			if(rem<=9)
				hex=rem+hex;
			else
				hex=(char)(rem+55)+hex;
		n=n/16;	
		}
	return "The Hexadecimal of "+num+" is: "+hex;	
	}

}
