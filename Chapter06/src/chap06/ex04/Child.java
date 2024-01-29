package chap06.ex04;

// 상속 받은 클래스(1개의 자바 파일에 1개 이상의 클래스가 가능)
public class Child extends ParentHouse {

	@Override
	public void useroom() {
		System.out.println("첫째가 방을 사용 한다.");
	}

}

// 하나의 자바파일에는 해당 자바파일과 이름이 동일한 클래스 하나만 public 을 가져 갈 수있다.
class ChildOne extends ParentHouse {
	@Override
	public void useroom() {
		System.out.println("둘째가 방을 사용 한다.");

	}
}

class ChildTwo extends ParentHouse {
	@Override
	public void useroom() {
		System.out.println("셋째가 방을 사용 한다.");
	}

}

class ChildThree extends ParentHouse {
	@Override
	public void useroom() {
		System.out.println("넷쨰가 방을 사용 한다.");
	}

}

class ChildFour extends ParentHouse {
	@Override
	public void useroom() {
		System.out.println("다섯쨰가 방을 사용 한다.");
	}

}
