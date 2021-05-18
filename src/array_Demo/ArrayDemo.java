package array_Demo;

public class ArrayDemo {

	public static void main(String[] args) {
	
		
		int [] arr = new int [4];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int len = arr.length;
		System.out.println(len);
		
//		int sum = arr[0] + arr[1]+arr[2]+arr[3];
//		System.out.println("Sum Of array "+sum);
		
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			sum +=arr[i];	
			
		}
		
		System.out.println("Sum Of array "+sum);
		
		int max = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
		
			
		}
		System.out.println(max);
		
		
		
	}
	
	

}



