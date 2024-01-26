package ch04.ex03;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		result = sol.solution(5500);
		System.out.println("[1, 0]==" + Arrays.toString(result));
		
		result = sol.solution(15000);
		System.out.println("[2, 4000]==" + Arrays.toString(result));
		
	}

}
