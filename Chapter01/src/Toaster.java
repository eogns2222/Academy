
public class Toaster {

	public static void main(String[] args) {
		String dish = toaster("식빵");
		System.out.println(dish);
	}
	
	static String toaster(String input) {
		System.out.println(input + "이 구워지고 있다.");
		return "구워진" + input;
	}

}
