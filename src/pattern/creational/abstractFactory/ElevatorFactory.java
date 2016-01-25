package pattern.creational.abstractFactory;

public abstract class ElevatorFactory {
	public abstract Motor createMotor();
	public abstract Door createDoor();
}
