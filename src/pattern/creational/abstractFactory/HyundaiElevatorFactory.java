package pattern.creational.abstractFactory;

public class HyundaiElevatorFactory extends ElevatorFactory {

	private static ElevatorFactory factory;
	private HyundaiElevatorFactory(){}
	
	public static ElevatorFactory getInstance(){
		if(factory==null)
			factory=new HyundaiElevatorFactory();
		
		return factory;
	}
	
	
	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}

}
