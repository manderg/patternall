package pattern.behavioral.template;

/* 문의 상태 정의 */
public class Door {
	private DoorStatus doorStatus;
	
	public Door(){
		doorStatus=DoorStatus.CLOSED;
	}
	
	public DoorStatus getDoorStatus(){
		return doorStatus;
	}
	
	public void close(){
		doorStatus=DoorStatus.CLOSED;
	}
	
	public void open(){
		doorStatus=DoorStatus.OPENED;
	}
}
