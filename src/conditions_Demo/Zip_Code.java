package conditions_Demo;

public class Zip_Code {
	public static void main(String[] args) {
	
		int zip = 10100;

		if (zip <= 10100 && zip <= 10999) {
			System.out.println("Manhattan");
		} else if (zip <= 10400 && zip <= 10333) {
			System.out.println("Queens");

		} else if (zip <= 10200 && zip <= 10221) {
			System.out.println("Bronx");

		} else if (zip <= 11001 && zip <= 20011) {
			System.out.println("Brooklyn");

		} else {
			System.out.println("This is not a new york city zipcode");
		}
	}
}
