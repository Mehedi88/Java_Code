package loop;

public class Loop_demo {

	public static void main(String[] args) {
	
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			
			sum = sum + i;
			System.out.println(i + " "+sum);
			
		}
		System.out.println("");
		System.out.println("Total "+sum);
	}

}
