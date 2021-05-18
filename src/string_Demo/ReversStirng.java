package string_Demo;

public class ReversStirng {

	public static void main(String[] args) {
		
		String s = "I live in New York";
		String [] sr = s.split("");
		
		String rev = "";
		for(int i = sr.length-1; i>=0;i--) {
			rev = rev + sr[i];
		}
		System.out.println(rev);
	}

}
