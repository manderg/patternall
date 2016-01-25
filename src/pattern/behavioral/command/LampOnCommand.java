package pattern.behavioral.command;


/* 실행 메소드 구현 클래스 : 실행되는 곳*/
public class LampOnCommand implements Command {

	private Lamp theLamp;
	
	public LampOnCommand(Lamp theLamp){
		this.theLamp=theLamp;
	}
	
	@Override
	public void execute() {
		theLamp.turnOn();
	}

}
