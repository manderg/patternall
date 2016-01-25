package pattern.behavioral.strategy;

public class MissileStrategy implements AttackStrategy { //Attack

	@Override
	public void attack() {
		System.out.println("I have Missile and can attack with it");
	}


}
