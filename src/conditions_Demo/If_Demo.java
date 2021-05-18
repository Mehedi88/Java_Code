package conditions_Demo;

public class If_Demo {

	public static  int rollNumber(String name) {
		
		int num = 0;
		
		if(name == "Tushar") {
			num = 1;
			
		}else if (name == "Arif") {
			num = 2;
			
		}else if (name =="Motion") {
			num = 3;
			
		}
		
		return num;
		
	}
	public static void main(String[] args) {
	int rn = rollNumber("Tushar");
	System.out.println(rn);
		
		
		
	}

}
