package array;

public class Task5 {
	//WAJP to find digit from character array
	public static void main(String[] args) {
		char[] c= {'a','1','5','y','9','r'};
		for(int i =0;i<c.length;i++) {
			if(c[i]>='0'&&c[i]<='9') {
				System.out.print(c[i]+" ");
			}
		}
		
		
	}

}
