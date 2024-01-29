package chap06.ex01;

public class Main {

	public static void main(String[] args) {
		
		//Mamal 의 기능을 사용해 보자 - birth() , eat()
		Mamal mal = new Mamal();
		mal.birth();
		mal.eat();
		
		
		//Person - useTool(), social(), talk()
		Person per = new Person();
		per.useTool();
		per.social();
		per.talk();
		
		per.birth();
		per.eat();
		
		// 상속에서 내것처럼 쓴다 == 나를 객체화 하면 부모것도 쓸 수 있다.
		
				

	}

}
