package interviewprograms;

public class LongestBinarySubstring {
	public static void main(String[] args) {
		System.out.println(count("abbanahimaanenge",'b'));
	}
	
	public static int count(String s, char target) {	
	int count = 0, max=0;
	
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch==target) {
			count++;
			if(count>max) {
				max=count;
			}
		}
		else
			count=0;
	}
	return max;
	
	}
}
