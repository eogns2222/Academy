package chap05.ex09;

public class Inner {

	public static void main(String[] args) {

		st_msg("hello static method"); // 같은 static 영역의 메서드 끼리는 편하게 부르면 된다.
		// 하지만 영역이 다른 h_msg() 는 부를 수 없다.
		
		Inner i = new Inner();
		i.h_msg("hello method"); // 영역이 다른 것을 부를 때는 같은 클래스라 하더라도 다른 클래스에서 부를 때처럼
		
	}

	static void st_msg(String msg) {
		System.out.println("static member method : " + msg);
	}
	
	void h_msg(String msg) {
		System.out.println("member method : " + msg);
		Inner.st_msg(""); // 다른 영역이므로 static 멤버를 사용할 때는 다른 클래스를 부를 때처럼
	}
	
}
