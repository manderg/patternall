package pattern.creational.abstractFactory;

public class LGMotor extends Motor {

	public LGMotor() {
		
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("LGMotor : "+direction);
	}

}
