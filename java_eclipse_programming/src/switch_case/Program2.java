package switch_case;
import java.util.Scanner;
//take character input and print whether it is a vowel, digit or any other character.
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c=sc.next().charAt(0);
		switch(c) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("This is a Vowel Character");
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println("This is a Digit Character");
			break;
		default:
			System.out.println("This is Other Character");
		}
	}

}
