package numbers;
import java.util.Scanner;
import java.util.Random;
public class RandomInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lower Bound: ");
		int min=sc.nextInt();
		System.out.println("Enter Upper Bound: ");
		int max=sc.nextInt();
		int randomNumber=getRandom(min, max);
		System.out.println("The Random Number is: "+randomNumber);
	}
	public static int getRandom(int min,int max) {
		Random r1=new Random();
	return min+r1.nextInt(max-min);
	}
}