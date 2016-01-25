package pattern.behavioral.strategy2;


public abstract class Duck {

	FlyBehavior flyBehavior;

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	public void swim(){
		System.out.println("모든 오리는 수영한다.");
	}
	
}
