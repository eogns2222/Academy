import java.util.Iterator;

public class TwoD {

	public static void main(String[] args) {
		// 2차원 배열
		// arr 아파트 2개층, 3개 호를 가지고 있다.
		int[][] arr = {
				{00, 01, 02, 03},
				{10, 11, 12, 13}
		};
		
		// royal 아파트는 4개층 4개호가 있다.
		String[][] royal = new String[4][4];
		royal[0][0] = "0층 0호";
		
		for (int i = 0; i < royal.length; i++) {
			
			for (int j = 0; j < royal[i].length; j++) {
				royal[i][j] = i + "층" + j + "호";
				System.out.println(royal[i][j]);
			}
		}
		
	}

}
