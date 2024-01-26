
public class Condition {

	public static void main(String[] args) {
		// dead code

		if (true) {
			System.out.println("조건이 참 일경우만 실행 한다.");
		}
		
		if(false) { // dead code 경고
			System.out.println("무조건 실행 되지 않는다.");
		}
		
		boolean a = true;
		boolean b = false;
		
		if(a) {
			System.out.println("a는 true이므로 실행 된다.");
		}
		
		if(!b) {
			System.out.println("b는 false이므로 실행 되지 않는다.");
			System.out.println("하지만 b를 반전연산자로 바꿔주었다.");
		}
		
	}

}
