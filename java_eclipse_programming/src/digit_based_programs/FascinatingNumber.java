package digit_based_programs;
import java.util.Scanner;
public class FascinatingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if(isFascinating(n))
			System.out.println(n+" is an Fascinating Number");
		else
			System.out.println(n+" is NOT an Fascinating Number");
	}
	public static boolean isFascinating(int n) {
		int n1;
		int n2;
		if(getCount(n)!=3) {
			n1=n*2;
			n2=n*3;
			String num=n+""+n*2+""+n*3;
		}
		
			
	return true;		
	}
	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
		n=n/10;	
		}
	return count;
	}

}
