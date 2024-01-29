package chap06.ex08;

public class Light extends Spell {
	@Override
	public String casting() {
		return "번개" + super.casting();
	}
}
