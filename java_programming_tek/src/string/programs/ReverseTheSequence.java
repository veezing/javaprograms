package string.programs;

public class ReverseTheSequence {
	public static void main(String[] args) {
		String s = "I am a student";
		String[] str = s.split(" ");
		for(int i = str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}

}
