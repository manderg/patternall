package pattern.creational.factorymethod2;

import pattern.behavioral.template.Direction;

public interface ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
