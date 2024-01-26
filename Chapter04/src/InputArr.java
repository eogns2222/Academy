
public class InputArr {

	public static void main(String[] args) {
		// 배열 생성 후 값 집어넣기
		
		// 10개 짜리 방 생성
		int[] scores = new int[10];
		
		System.out.println("크기 :" + scores.length);
		
		scores[0] = 10; // 0 번 방에 10
		scores[1] = 50; // 1 번 방에 50
		scores[2] = 70; // 2 번 방에 70
		scores[3] = 100; 
		scores[4] = 100; 
		scores[5] = 100; 
		scores[6] = 100; 
		scores[7] = 100; 
		scores[8] = 100; 
		scores[9] = 100; 
		
		for (int i = 3; i < scores.length; i++) {
			scores[i] = 100;
		}
		
		
	}

}
