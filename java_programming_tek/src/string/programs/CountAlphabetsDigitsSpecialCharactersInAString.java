package string.programs;

public class CountAlphabetsDigitsSpecialCharactersInAString {
	public static void main(String[] args) {
		String s= "abcde123^^@$%";
		int alphaCount=0, digitCount=0, charCount=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0'&&c<='9')
				digitCount++;
			else if((c>='a'&&c<='z')|| (c>='A'&&c<='Z'))
				alphaCount++;
			else
				charCount++;
		}
		System.out.println("Number of Digits in String are: "+digitCount);
		System.out.println("Number of Alphabets in String are: "+alphaCount);
		System.out.println("Number of Special Characters in String are: "+charCount); 
	}

}
