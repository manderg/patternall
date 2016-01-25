package pattern.behavioral.strategy2;


public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm Flying!");
	}

}
