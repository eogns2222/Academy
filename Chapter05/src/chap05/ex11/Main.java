package chap05.ex11;

import chap05.ex08.OverCalc;

public class Main {

	public static void main(String[] args) {

		// Info 는 같은 패키지 안에 있기 때문에 그냥 객체화 가능
		Info info = new Info();
		System.out.println(info.age);
		System.out.println(info.job);
		
		// chap05.ex08에 있는 OverCalc를 불러온다.
		OverCalc over = new OverCalc(); // 패키지가 다르므로 import 문을 사용해야 함
		String result = over.plus("public", "+");
		System.out.println(result);
	}

}
