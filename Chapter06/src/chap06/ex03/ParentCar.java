package chap06.ex03;

public class ParentCar {
	
	public void start() {
		System.out.println("시동을 건다.");
		
	}
	
	public int run() {
		return 50;
		
	}
	
	public void stop() {
		System.out.println("정차하다.");
		
	}
	//final 은 read only 이기 때문에 오버라이드 할 수 없다.
	// 오버라이드는 기존 메서드를 수정하는 작업 이니깐
	public final void test() {
		System.out.println("자가 점검");
		
		
	}
	

}
