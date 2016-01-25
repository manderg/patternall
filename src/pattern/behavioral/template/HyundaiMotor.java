package pattern.behavioral.template;


public class HyundaiMotor extends Motor { //concrete class

	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("HyundaioMotor : "+direction);
	}
}
