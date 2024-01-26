
public class StmtWhile {

	public static void main(String[] args) {

		int i = 1;
		
		// while 문은 조건이 참이면 계속 반복한다.
		while (true) {
			System.out.println(i);
			i++;
			if(i == 100) {
				break;
			}
		}
		
		// unreachable code : 현재 이 상황 대로라면 여기 까지 닿지 않는다.
		// 해결방법 1 : 아래코드를 지워준다.
		// 해결방법 2 : while 문이 멈출 수 있는 방법을 마련해 준다.
		int cup = 1;
		System.out.println(cup);
		
	}

}
