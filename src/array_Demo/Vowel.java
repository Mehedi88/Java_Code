package array_Demo;

public class Vowel {

	public static void main(String[] args) {
		String v = " Tanisha";
		String s [] = v.toLowerCase().split("");
		
	   
	     for(int i = 0; i<s.length;i++) {
	    	 if (s[i].contains("a") || s[i].contains("e") || s[i].contains("i") || s[i].contains("o") || s[i].contains("u")) {
	    		 System.out.println("Vowel is = "+s[i]);
				
			}else {
				System.out.println("Consonent is = " +s[i]);
			}
	    	 
	     }
		

	}

}
