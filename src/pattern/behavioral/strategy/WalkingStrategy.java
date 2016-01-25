package pattern.behavioral.strategy;

public class WalkingStrategy implements MovingStrategy { //move

	@Override
	public void move() {
		System.out.println("I can walk");
	}

}
