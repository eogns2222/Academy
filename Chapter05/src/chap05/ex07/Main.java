package chap05.ex07;

public class Main {

	public static void main(String[] args) {

		Car car = new Car(); // 객체화
		
		// 시동 걸기 전에 기어 확인
		int gear = car.gear;
		System.out.println("현재 기어:" + gear);
		// 시동 걸기
		car.start();
		// 기어 변경
		car.change(3);
		
	}

}
