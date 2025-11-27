package digit_based_programs;

public class Continue {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%3==0||i%10==3) {
				continue;
			}
		System.out.println(i);
		}
	
	}
}
