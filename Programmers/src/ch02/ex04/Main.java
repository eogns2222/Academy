package ch02.ex04;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int result;
		result = sol.solution(2, 3);
		System.out.println("-1==" + result);
		result = sol.solution(11, 11);
		System.out.println("1==" + result);
		result = sol.solution(7, 99);
		System.out.println("-1==" + result);
	}

}
