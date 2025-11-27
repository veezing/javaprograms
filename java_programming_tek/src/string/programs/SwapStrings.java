package string.programs;

public class SwapStrings {
	public static void main(String[] args) {
		String s1 = "Dell";
		String s2 = "Lenovo";

		System.out.println("Before Swap s1 is: " + s1);
		System.out.println("Before Swap s2 is: " + s2);
		System.out.println("====================");
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("After Swap s1 is: " + s1);
		System.out.println("After Swap s2 is: " + s2);
	}

}
