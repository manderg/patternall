package pattern.structural.decorator;

/* 데코레이터 패턴
 * 기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에 각 추가 기능을 Decorator 클래스로 정의한 후 필요한 Decorator 객체를 조합한다
 */
public class Client {
	public static void main(String[] args) {
		Display road=new RoadDisplay();
		road.draw();
		
		Display roadWithLane=new LaneDecorator(new RoadDisplay()); // LaneDecorator + RoadDisplay
		roadWithLane.draw();
		
		Display roadWithTraffic=new TrafficDecorator(new RoadDisplay()); // TrafficDecorator + RoadDisplay
		roadWithTraffic.draw();
		
		Display roadWithCrossing=new CrossingDecorator(new TrafficDecorator(new RoadDisplay())); // CrossingDecorator+TrafficDecorator + RoadDisplay
		roadWithCrossing.draw();
	}
}
