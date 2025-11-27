package interviewprograms;

import java.util.Arrays;

public class MultipleOfRemainingNUmbersFromArray {
	 public static void main(String[] args) {
	       int [] a = {1,2,3,4,5,6};
	       int multiple = getMultiple(a);
	       for(int i=0; i<a.length; i++){
	          a[i]=multiple/a[i];
	       }
	      
	       System.out.print(Arrays.toString(a));
	       
	       
	    }
	    
	    public static int getMultiple(int [] a){
	        int mul = 1;
	       for(int i=0; i<a.length; i++){
	           mul = mul*a[i];
	       }
	       return mul;
	    }

}
