package number;

public class DenominationOfCurrency {
	public static void main(String[] args) {
		int num = 7431;
		int [] notes = {500,200,100,50,20,10,5,2,1};
		for(int i=0; i<notes.length;i++) {
			int deno=num/notes[i];
			System.out.println(notes[i]+" - "+deno);
			num=num%notes[i];
		}
	}

}