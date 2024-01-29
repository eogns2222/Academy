package chap06.ex06;

public class Cat extends Mamal {

	@Override
	public void birth() {// 같은 포유류라 하여도, 새끼를 낳는 수는 각각 다르기에 오버라이드 한다.
		System.out.println("새끼를 6마리 낳는다.");
	}

	public void bark() {// Mammal 이 아닌 Dog 의 고유 특성(메서드)
		System.out.println("야옹 하고 운다.");

	}

}