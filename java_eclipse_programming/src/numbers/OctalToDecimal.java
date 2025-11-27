package numbers;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		String decimal=convertOctalToDecimal(n);
		System.out.println("The Decimal of "+n+" is: "+decimal);
	}
	public static String convertOctalToDecimal(int n) {
		int dec=0;
		int eightMul=1;
		int rem=0;
		int num=n;
		while(n>0) {
			rem=n%10;
			if(rem>7)
				return "Illegal Input! Only 0 to 7 allowed in Octal";
			else 
				dec+=rem*eightMul;
		eightMul*=8;
		n/=10;
		}
		return "The Decimal of "+num+" is: "+dec;
	}

}
