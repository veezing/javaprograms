package numbers;
import java.util.Scanner;
public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=sc.nextInt();
		String octal=convertDecimalToOctal(n);
		System.out.println(octal);
	}
	public static String convertDecimalToOctal(int n) {
		String oct=""; int num=n;
		while(n>0) {
			int rem=n%8;
			oct=rem+oct;
		n=n/8;	
		}
	return "The Octal of "+num+" is:"+oct;
	}

}
