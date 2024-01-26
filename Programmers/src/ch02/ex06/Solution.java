package ch02.ex06;

public class Solution {

	public int solution(int n, int k) {
        return 12000 * n + 2000 * (k - (n/10));
//		return (12000 * n + 2000 * k) - (2000 * (n/10));
    }
	
}
