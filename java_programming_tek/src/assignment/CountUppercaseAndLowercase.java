package assignment;

public class CountUppercaseAndLowercase {
	public static void main(String[] args) {
		String s= "My nAmE iS jAVa pRoGrAm";
		int upperCount=0, lowerCount=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A'&&c<='Z')
				upperCount ++;
			else if(c>='a'&&c<='z')
				lowerCount ++;
			}
		System.out.println("Number of Uppercase Letters in String are: "+ upperCount);
		System.out.println("Number of Lowercase Letters in String are: "+ lowerCount);
		 
		}


}
