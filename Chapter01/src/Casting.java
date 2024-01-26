
public class Casting {

	public static void main(String[] args) {
		char charValue;
		int intValue;
		long longValue;
		float floatValue;
		double doubleValue;
		
		intValue = 74;
		charValue = (char) intValue;
		System.out.println(charValue);
		
		longValue = 500;
		doubleValue = 3.14;
		
		// long -> int
		intValue = (int)longValue;
		
		// double - > float
		floatValue = (float)doubleValue;
		
		System.out.println(intValue);
		System.out.println(floatValue);
	}

}
