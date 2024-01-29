package chap06.ex08;

public class Mage {

	public static void main(String[] args) {
		
		Spell spell;
		spell = new Ice();
		System.out.println(spell.casting());
		
		spell = new Light();
		System.out.println(spell.casting());
		
		spell = new Fire();
		System.out.println(spell.casting());
	}

}
