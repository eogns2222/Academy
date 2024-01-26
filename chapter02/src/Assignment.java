
public class Assignment {

	public static void main(String[] args) {
		int result = 0; // 대입 연산자
		
		// 복합대입 연산자
//		result = result + 10;
		result += 10;
		System.out.println(result);
		
//		result = result - 5;
		result -= 5;
		System.out.println(result);
		
//		result = result * 2;
		result *= 2;
		System.out.println(result);
		
//		result = result / 2;
		result /= 2;
		System.out.println(result);
		
//		result = result % 2;
		result %= 2;
		System.out.println(result);
		
		/* 응용 */
		String str = "A";
		str += "B";
		str += "C";
		str += "D";
		str += "E";
		System.out.println(str);
		
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		System.out.println(num);
	}

}
