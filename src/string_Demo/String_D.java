package string_Demo;

public class String_D {
	public static void main(String []args) {
		String s = "iphone$$##350.49$$##10";
		
		String pName = "Phone";
		double price = 0;
		int q = 0;
		
		String [] cs = s.split("");
		for(int i = 0;i<cs.length;i++) {
			System.out.println(cs[i]);
		}
	}
			

}
