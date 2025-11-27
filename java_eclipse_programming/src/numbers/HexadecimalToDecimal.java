package numbers;
import java.util.Scanner;
public class HexadecimalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		String s=sc.nextLine();
		String decimal=convertHexToDec(s);
		System.out.println(decimal);
	}
	public static String convertHexToDec(String s) {
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
