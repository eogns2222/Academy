
public class StmtDowhile {

	public static void main(String[] args) {

		int cnt = 11;
		
		while (cnt < 10) { // 조건을 먼저 보고
			cnt++; // 실행을 한다.
		}
		System.out.println("while cnt : " + cnt);
		
		cnt = 11;
		do {
			cnt++; // 일단 실행하고
		} while (cnt < 10); // 조건을 본다. (반복여부를 결정)
		System.out.println("do while cnt : " + cnt);
		
		// 조건이 만족되지 못하는 상황으로 시작할 때는 두 구문이 다르게 반응 한다.
		
	}

}
