
public class Compare {

	public static void main(String[] args) {
		// = 은 대입 연산으로 사용 중
		int v1 = 1;
		double v2 = 1.0;
		int v3 = 4;
		// 문자열은 여러 방법으로 선언 할 수 있다.
		String v4 = "JAVA";
		String v5 = new String("JAVA");
		
		// 비교 연산
		System.out.println(v1 == v2); // true
		System.out.println(v1 != v2); // true
		System.out.println(v1 < v3); // true
		System.out.println(v4 == v5); // false
		System.out.println(v4.equals(v5)); // true // 문자열 비교는 반드시 equals로 해주자
		
		String id = "admin";
		String pw = "pass";
		// 입력받은 id 와 pw가 각각 admin과 pass면 로그인 완료 시켜주자
		if(id.equals("admin") && pw.equals("pass")) {
			System.out.println("login 되었습니다");
		}
		
	}

}
