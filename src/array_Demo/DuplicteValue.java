package array_Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicteValue {

	public static void main(String[] args) {
		
		int [] number = {10,20,10,25,20,};
		Arrays.sort(number);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(number[0]);
		
		for(int i = 1; i<number.length;i++) {
			if(number[i] != number[i-1]) {
				arr.add(number[i]);
				
			}
			
		}
		for(int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
			
		}
		

	}

}
