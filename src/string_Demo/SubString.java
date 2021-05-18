package string_Demo;

public class SubString {

	public static void main(String[] args) {
		
		String s = "What a nice day";
		String lastWord = s.substring(s.lastIndexOf("day"));
		for(int i = 0; i<lastWord.length(); i++) {
			System.out.println(lastWord);
			
		}
	}

}
