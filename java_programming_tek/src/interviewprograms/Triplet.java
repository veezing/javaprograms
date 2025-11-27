package interviewprograms;

public class Triplet {
	public static void main(String[] args) {
		int triCount=0, quadCount=0;
		String s = "0111223333110000";
		
		for(int i=0;i<s.length()-2;i++) {
			char ch = s.charAt(i);
			if(ch==s.charAt(i+1) && ch ==s.charAt(i+2)) {
				
				if(i+3<s.length() && ch == s.charAt(i+3)) {
					quadCount++;
					i=i+3;
				}else {
					triCount++;
					i=i+2;
				}
			}
		}
		System.out.println("Triplets "+triCount);
		System.out.println("Quadrets "+quadCount);
	}

}
