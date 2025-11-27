package switch_case;

import java.util.Scanner;

public class ConversionDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Conversion conversion=new Conversion();
		char c;
		do {
		conversion.selectOperation();
		System.out.println("Enter Y/y to continue...");
		c=sc.next().charAt(0);
		}while(c=='Y'||c=='y');
	System.out.println("Program Ends!!!");	
	}	
}
