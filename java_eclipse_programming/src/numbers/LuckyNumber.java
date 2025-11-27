package numbers;

public class LuckyNumber {
	public static void main(String[] args) {
		
		String num = "12323110";
		
		System.out.println(num);
		
		while(num.length()>1) {
			int d1 = Character.getNumericValue(num.charAt(0));
			int d2 = Character.getNumericValue(num.charAt(1));
			
			int sum = d1+d2;
			
			if(sum>9) {
				sum = sum/10 + sum%10;
			}
			
			num = sum+num.substring(2);
			
			System.out.println(num);
		}
		
	}
	
	
	
	

}
