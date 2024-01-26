import java.util.Iterator;

public class StmtFor {

	public static void main(String[] args) {
		// for(이녀석이; 이것을 만족한다면; 증가 또는 감소)
		// for 는 반복 횟수가 정해진 상태가 적합

		// 물 10잔 떠 오기

//		for (int cup = 1; cup <= 10; cup++) {
//			System.out.println("물 " + cup + "잔을 떠왔습니다.");
//		}

		// 커피 10잔 만들기(물 1잔에 믹스 2개)
		for (int cup = 1; cup <= 10; cup++) {
			System.out.println("물" + cup + "잔");
			for (int mix = 1; mix <= 2; mix++) {
				System.out.println("    믹스" + mix + "개 첨가");
			}
		}

	}

}
