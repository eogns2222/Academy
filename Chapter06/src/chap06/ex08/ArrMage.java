package chap06.ex08;

import java.util.Iterator;

public class ArrMage {

	public static void main(String[] args) {
		
		// Ice , Light, Fire 주문을 연속으로 날릴수 있도록 배열과, for 문을 활용해서 구현 해 보자.
		Spell[] arr = new Spell[3];
		arr[0] = new Ice();
		arr[1] = new Fire();
		arr[2] = new Light();
		
		for (Spell spell : arr) {
			System.out.println(spell.casting());
			
			
		}
		
	}

}
