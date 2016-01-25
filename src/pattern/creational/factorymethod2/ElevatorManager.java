package pattern.creational.factorymethod2;

import java.util.ArrayList;
import java.util.List;

import pattern.behavioral.template.Direction;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID){
		controllers=new ArrayList<ElevatorController>(controllerCount);
		
		for(int i=0;i<controllerCount;i++){
			ElevatorController controller=new ElevatorController(i+1);
			controllers.add(controller);
		}
		this.strategyID=strategyID;
	}
	
	public void setStrategyID(SchedulingStrategyID strategyID){
		this.strategyID=strategyID;
	}
	
	public void requestElevator(int destination, Direction direction){
		ElevatorScheduler scheduler=SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectedElevator=scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
