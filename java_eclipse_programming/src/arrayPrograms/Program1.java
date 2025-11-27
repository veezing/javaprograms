package arrayPrograms;

public class Program1 {
	public static void main(String[] args) {
		int [] a = {20,18,35,72,20,16,43};
		System.out.println(getBiggestSmallestDifferrence(a));
	}
	
	public static int getBiggestSmallestDifferrence(int [] a) {
		int biggest = a[0] , smallest = a[0];
		
		for(int x:a) {
			if(x>biggest)
				biggest=x;
			if(x<smallest)
				smallest=x;
		}
		
		
		return biggest-smallest;
		
	}
	
	

}
