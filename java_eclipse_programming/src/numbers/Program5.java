package numbers;
//Print and count all the numbers upto 1000 which are divisible by 7 and also end with 7

public class Program5 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=1000;i++) {
			if(i%7==0 && i%10==7) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal is: "+count);		
	}

}
