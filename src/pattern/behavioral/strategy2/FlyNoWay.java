package pattern.behavioral.strategy2;


public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't Fly!");
	}

}
