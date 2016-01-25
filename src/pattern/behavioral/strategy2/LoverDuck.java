package pattern.behavioral.strategy2;


public class LoverDuck extends Duck {

	public LoverDuck(FlyBehavior flyBehavior){
		super.flyBehavior = flyBehavior;
	}

	@Override
	void display() {
		System.out.println("I'm lover Duck!");
	}
	
	
}
