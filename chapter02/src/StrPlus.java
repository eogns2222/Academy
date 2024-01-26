
public class StrPlus {

	public static void main(String[] args) {
		// 문자가 발견되는 시점부터는 더하기(plus)가 아닌 추가(add)가 된다.
		String str1 = "JDK"  + 8 + 0.65;
		System.out.println(str1);
		
		String str2 = 8 + 0.65 + "JDK";
		System.out.println(str2);
		
		String str3 = "8" + 0.65 + "JDK";
		System.out.println(str3);
	}

}
