package pattern.behavioral.strategy;

public class PunchStrategy implements AttackStrategy { //Attack

	@Override
	public void attack() {
		System.out.println("I have strong punch and can attack with it");
	}

}
