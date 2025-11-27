package switch_case;

import java.util.Scanner;

public class Conversion {
	public void selectOperation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1==> To Convert Decimal to Binary");
		System.out.println("Enter 2==> To Convert Binary to Decimal");
		System.out.println("Enter 3==> To Convert Decimal to Octal");
		System.out.println("Enter 4==> To Convert Octal to Decimal");
		System.out.println("Enter 5==> To Convert Decimal to Hexadecimal");
		System.out.println("Enter 6==> To Convert Hexadecimal to Decimal");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You Have Selected Decimal to Binary Conversion");
			System.out.println("Enter the Decimal Number: ");
			int n=sc.nextInt();
			String binary=convertDecimalToBinary(n);
			System.out.println(binary);
			break;
		case 2:
			System.out.println("You Have Selected Binary to Decimal Conversion");
			System.out.println("Enter the Binary Number: ");
			int p=sc.nextInt();
			String decimal=convertBinaryToDecimal(p);
			System.out.println(decimal);
			break;
		case 3:
			System.out.println("You Have Selected Decimal to Octal Conversion");
			System.out.println("Enter the Decimal Number: ");
			int q=sc.nextInt();
			String octal=convertDecimalToOctal(q);
			System.out.println(octal);
			break;
		case 4:
			System.out.println("You Have Selected Octal to Decimal Conversion");
			System.out.println("Enter the Number: ");
			int r=sc.nextInt();
			String dec=convertOctalToDecimal(r);
			System.out.println("The Decimal of "+r+" is: "+dec);
			break;
		case 5:
			System.out.println("You Have Selected Decimal to Hexadecimal Conversion");
			System.out.println("Enter the Number: ");
			int s=sc.nextInt();
			String hexadecimal=convertDecToHex(s);
			System.out.println(hexadecimal);
			break;
		case 6:
			System.out.println("You Have Selected Hexadecimal to Decimal Conversion");
			System.out.println("Enter the Number: ");
			sc.nextLine();
			String t=sc.nextLine();
			String decim=convertHexToDec(t);
			System.out.println(decim);
			break;
		default:
			System.out.println("Invalid Operation!! Select from Valid Inputs");
			selectOperation();
		}
	}
	private String convertDecimalToBinary(int n) {
		String bin=""; int num=n;
		while(n>0) {
			int rem=n%2;
			bin=rem+bin;
		n=n/2;	
		}
	return "The Binary of "+num+" is:"+bin;
	}
	private String convertBinaryToDecimal(int n) {
		int twoMul=1;
		int num=n;
		int dec=0;
		while(n>0) {
			int rem=n%10;
			if(rem>1)
				return "Illegal Input! Binary Should have only 0 or 1";
			else 
				dec+=rem*twoMul;
		twoMul*=2;	
		n=n/10;	
		}
	return "The Decimal of "+num+" is: "+dec;	
	}
	private String convertDecimalToOctal(int n) {
		String oct=""; int num=n;
		while(n>0) {
			int rem=n%8;
			oct=rem+oct;
		n=n/8;	
		}
	return "The Octal of "+num+" is:"+oct;
	}
	private String convertOctalToDecimal(int n) {
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
	private String convertDecToHex(int n) {
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
	private String convertHexToDec(String s) {
		int dec=0;
		int sixteenMul=1;
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
				dec=dec+(c-48)*sixteenMul;
			else if(c>='A'&&c<='F')
				dec=dec+(c-55)*sixteenMul;
			else if(c>='a'&&c<='f')
				dec=dec+(c-87)*sixteenMul;
			else
				return "Invalid Hexadecimal Number Provided";
		sixteenMul*=16;
		}
	return "The Decimal of "+s+" is: "+dec;	
	}
}
