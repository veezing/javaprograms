package practice;

public class AlternateUppercaseInAGivenString {
	public static void main(String[] args) {
		String s= "Automation testing";
	      for(int i=0;i<s.length();i++){
	          char ch=s.charAt(i);
	          if(i%2==0){
	           // ch=(char) (ch-32);
	        	  ch=Character.toUpperCase(ch);
	          }
	          System.out.print(ch+" ");
	      }
	}

}
