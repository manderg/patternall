package pattern.behavioral.template;


public class LGMotor extends Motor { //concrete class

	public LGMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("LGMotor : "+direction);
	}

}
