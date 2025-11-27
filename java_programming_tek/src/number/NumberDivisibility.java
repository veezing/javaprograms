package number;

public class NumberDivisibility {
	public static void main(String[] args) {
		int num=67;
		if(num%5==0 && num%3==0)
			System.out.println("Hi Bye");
		else if(num%3==0)
			System.out.println("Hi");
		else if(num%5==0)
			System.out.println("Bye");
		else
			System.out.println("Not Divisible by 3 or 5");
	}

}