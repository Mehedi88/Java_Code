package array_Demo;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

	public static void main(String[] args) {
	
//		String dup = "We are in park park is nice also nice wather";
//		String word [] = dup.split(" ");
//		
//		Map<String, Integer> map = new HashMap<String , Integer>();
//		
//		for(String m : word) {
//			if(map.containsKey(m)) {
//				map.put(m, map.get(m)+1);
//				
//			}else {
//				map.put(m,1);
//			}
//			
//		}
//		for(String key : map.keySet()) {
//			if (map.get(key)>1) {
//				System.out.println(key + " Appear = "+map.get(key) +" Time ");
//				
//			}
//			
//		}

		
		//Another way
		
		String word = "We are are in park park";
		
		int count;
		
		word = word.toLowerCase();
		
		String [] sp = word.split(" ");
		
		for(int i = 0;i<sp.length; i++) {
			count =1;
			
			for(int j = i+1; i<sp.length; j++) {
				if (sp[i].equals(sp[j])) {
					count++;
					
					sp[j] = "0";
				}
				
			}
			if (count>1 && sp[i]!="0") {
				System.out.println(sp[i]);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
