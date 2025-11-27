package numbers;
//Print and Count all the numbers upto 100 which are divisible by 7
public class Program4 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				System.out.print(i+" ");
				count++;
			}
		}
	System.out.println("\nTotal Numbers divisible by 7 are: "+count);	
	}

}
