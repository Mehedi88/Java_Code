package array_Demo;

public class LargeNumber {

	public static void main(String[] args) {
		
		int [] number = {10,20,10,30,50};
		
		int largeNumber = number[0];
		int smallnumber = number[0];
		
		for(int i = 0; i<number.length; i++) {
			if (largeNumber<number[i]) {
				largeNumber = number[i];
				
			}else if (smallnumber>number[i]) {
				smallnumber = number[i];
				
			}
			
		}
		System.out.println("Large number is "+largeNumber);
		System.out.println("small number is "+smallnumber);
	}

}
