package chap06.ex05;

public class Promotion {
	

	public static void main(String[] args) {
		
		VertBtate 척추동물;
		// 닭, 오리, 개 , 고양이는 모두 척추 동물 이므로 이 안에 들어 갈 수 있다.
		척추동물 = new Dog();
		척추동물 = new Cat();
		척추동물 = new Duck();
		척추동물 = new Chicken();
		
//		// 고양이는 조류에 속하나?
//		Birds birds = new Cat();
//	
//		// 닭은 포유류에 속하나?
//		Mammal mal = new Chicken();
//		

	}

}
class VertBtate{}

class Mammal extends VertBtate{}
class Birds extends VertBtate{}

class Dog extends Mammal{}
class Cat extends Mammal{}

class Duck extends Birds{}
class Chicken extends Birds{}

