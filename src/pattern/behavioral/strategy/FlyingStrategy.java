package pattern.behavioral.strategy;

public class FlyingStrategy implements MovingStrategy {  //move

	@Override
	public void move() {
		System.out.println("I can fly");
	}

}
