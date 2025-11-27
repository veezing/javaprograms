package switch_case;
//Perform operations on 2 numbers by taking user input
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		double a=sc.nextDouble();
		System.out.println("Enter the 2nd Number: ");
		double b=sc.nextDouble();
		System.out.println("Enter the operation(+,-,*,/ or %): ");
		char operation=sc.next().charAt(0);
		switch(operation) {
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/':
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		case '%':
			System.out.println(a+"%"+b+"="+(a%b));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	System.out.println("Program Ends!!");	
	}
}