package ch04.ex03;

public class Solution {

	public int[] solution(int money) {
        int[] answer = {0,0};
        
        // 몇 잔의 커피를 살 수 있나? -> 나누기
        answer[0] = money / 5500;
        // 얼마 남는가? -> 나머지
//        answer[1] = money - (5500 * answer[0]);
        answer[1] = money % 5500;
        
        return answer;
    }
	
}
