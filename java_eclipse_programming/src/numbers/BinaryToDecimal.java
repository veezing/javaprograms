package numbers;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary Number: ");
		int n=sc.nextInt();
		String decimal=convertBinaryToDecimal(n);
		System.out.println(decimal);
	}
	public static String convertBinaryToDecimal(int n) {
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

}
