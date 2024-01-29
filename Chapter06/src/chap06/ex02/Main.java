package chap06.ex02;

public class Main {

	public static void main(String[] args) {
		// 사용하고 싶은 메서드가 각 클래스에 흩어져 있으므로 각각 객체화 해서 불러내야 한다.
		
		int result = 0;
		
//		Operator1 O1 = new Operator1();
//		result = O1.plus(10, 5);
//		System.out.println(result);
//		
//		Operator2 O2 = new Operator2();
//		result = O2.minus(10, 5);
//		System.out.println(result);
//		
//		Operator3 O3 = new Operator3();
//		result = O3.multi(10, 5);
//		System.out.println(result);
//		
//		Operator4 O4 = new Operator4();
//		result = O4.devide(10, 5);
//		System.out.println(result);
		
		// 4칙 연산을 해주자고 객체 4개를 선언 하는것도 귀찮고, 각 클래스에 어떤 메서드가 있는지 확인 하기도 힘들다
		// 그래서 하나의 클래스에 몰아넣어 버리자
		// 사용자 입장에서는 Operator 클래스만 기억하면된다.
		
		Operator1 O1 = new Operator1();
		result = O1.plus(10, 5);
		System.out.println(result);
		result = O1.minus(10, 5);
		System.out.println(result);
		result = O1.multi(10, 5);
		System.out.println(result);
		result = O1.devide(10, 5);
		System.out.println(result);
		
		

	}

}
