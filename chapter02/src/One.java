
public class One {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		x++;
		++y;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		x = 1;
		y = 1;
		int result1 = (++x) + 10; // x가 먼저 증가 ->2, 10 더하면 = 12
		int result2 = (y++) + 10; // y와 10을 더해서 11, 이후 y는 1 증가해서 2
		System.out.println("result1=" + result1); // 12
		System.out.println("result2=" + result2); // 11
		
		// ++가 뒤에 붙는다.(아령들고 나서 1세기) -> 카운트에 주로 활용
		// ++가 앞에 붙는다.(증가한 내용을 이용해 다른행동을 할 때)
		
		// 반전 연산(! not)
		boolean yn = true;
		System.out.println(yn); // true
		
		yn = !yn;
		System.out.println(yn); // false
		
		yn = !yn;
		System.out.println(yn); // true
	}

}
