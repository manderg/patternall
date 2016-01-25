package pattern.behavioral.command;

/* 실제로 실행되는 기능 구현 (Receiver) : 실행을 시키면 요청 받아 실제 동작하는 곳*/
public class Lamp { //receiver
	public void turnOn(){
		System.out.println("Lamp On");
	}
	
	public void turnOff(){
		System.out.println("Lamp Off");
	}
}
