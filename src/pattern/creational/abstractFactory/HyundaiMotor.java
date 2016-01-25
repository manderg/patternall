package pattern.creational.abstractFactory;

public class HyundaiMotor extends Motor {

	public HyundaiMotor() {
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("HyundaioMotor : "+direction);
	}
}
