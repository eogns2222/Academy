package ch04.ex02;

public class Solution {

	public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        
        // for
//        for (int i = 0; i < num_list.length; i++) {
//        	// 1. 들어온 배열의 값이 홀수인지 짝수인지 구분
//			if(num_list[i] % 2 == 0) { // 짝수이면 answer[0] 의 값이 1 증가
//				answer[0] += 1;
//			}else { // 아니면 answer[1] 의 값이 1증가
//				answer[1] += 1;
//			}
//		}
        
        // 향상된 for (이게 더 간편해 보임)
        for (int n : num_list) {
        	if(n % 2 == 0) {
				answer[0] ++;
			}else { 
				answer[1] ++;
			}
		}
        
        return answer;
        
    }
	
}
