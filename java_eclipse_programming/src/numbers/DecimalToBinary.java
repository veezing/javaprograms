package numbers;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=sc.nextInt();
		String binary=convertDecimalToBinary(n);
		System.out.println(binary);
	}
	public static String convertDecimalToBinary(int n) {
		String bin=""; int num=n;
		while(n>0) {
			int rem=n%2;
			bin=rem+bin;
		n=n/2;	
		}
	return "The Binary of "+num+" is:"+bin;
	}
}