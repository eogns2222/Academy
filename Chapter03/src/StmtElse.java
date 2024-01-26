
public class StmtElse {

	public static void main(String[] args) {
		// if else 문
		
		System.out.println("가게에 간다.");

		int tofuBox = 0;
		
		/*
		if (tofuBox > 0) {
			System.out.println("두부를 사온다.");
		}
		if (tofuBox < 1) {
			System.out.println("순두부를 사온다.");
		}
		*/
		
		if (tofuBox > 0) {
			System.out.println("두부를 사온다.");
		} else {
			System.out.println("순두부를 사온다.");
		}
		
		System.out.println("집으로 온다.");
		
	}

}
