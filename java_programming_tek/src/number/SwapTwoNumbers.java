package number;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a=10,b=6;
		System.out.println("Before Swap a= "+a+" , b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap a= "+a+" , b= "+b);
	}

}