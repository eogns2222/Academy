package ch04.ex02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		int[] arr;
		
		arr = new int[] {1, 2, 3, 4, 5};
		result = sol.solution(arr);
		System.out.println("[2,3]==" + Arrays.toString(result));
		
		arr = new int[] {1, 3, 5, 7};
		result = sol.solution(arr);
		System.out.println("[1, 3, 5, 7]==" + Arrays.toString(result));
		
	}

}
