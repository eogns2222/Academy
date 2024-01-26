package ch04.ex01;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		int[] arr;
		
		arr = new int[] {2, 4};
		result = sol.solution(arr);
		System.out.println("1==" + result);
		
		arr = new int[] {-7, 9};
		result = sol.solution(arr);
		System.out.println("2==" + result);
		
	}

}
