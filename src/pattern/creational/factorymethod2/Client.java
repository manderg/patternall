package pattern.creational.factorymethod2;

import pattern.behavioral.template.Direction;

/* 팩토리 메서드 패턴
 * 객체의 생성 코드를 별도의 클래스/메서드로 분리함으로써 객체 생성의 변화에 대비
 */
public class Client {

	public static void main(String[] args) {
		ElevatorManager emWithResponseTimeScheduler=
				new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
		emWithResponseTimeScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithThroughtputScheduler=
				new ElevatorManager(2, SchedulingStrategyID.THROUGHTUP);
		emWithThroughtputScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithDynamicScheduler=
				new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
		emWithDynamicScheduler.requestElevator(10, Direction.UP);
	}

}
