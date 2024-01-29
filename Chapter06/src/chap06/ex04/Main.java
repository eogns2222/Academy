package chap06.ex04;

public class Main {

	public static void main(String[] args) {
		// 다형성을 사용하기 전(첫째~다섯째)
		// 사용할 객체가 여러개 라면 여러개의 객체를 담을 변수를 선언해 줘야 한다.
		// 만약 사용할 객체의 개수가 100개 라면, 몇개의 변수를 선언해야 하는가.
		
		
		Child ch = new Child();
		ch.useroom();
		
		ChildOne ch1 = new ChildOne();
		ch1.useroom();
		
		ChildTwo ch2 = new ChildTwo();
		ch2.useroom();
		
		ChildThree ch3 = new ChildThree();
		ch3.useroom();
		
		ChildFour ch4 = new ChildFour();
		ch4.useroom();
		
		System.out.println();
		// 다형성을 사용 한 후
		// 하나의 변수(부모타입)에 여러 객체(자식타입)를 수용할 수 있다.
		ParentHouse house;
		house = new Child();
		house.useroom();
		
		house = new ChildOne();
		house.useroom();
		
		house = new ChildTwo();
		house.useroom();
		
		house = new ChildThree();
		house.useroom();
		
		house = new ChildFour();
		house.useroom();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
