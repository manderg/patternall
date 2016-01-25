package pattern.creational.abstractFactory;

public abstract class Door {
	
	private DoorStatus doorStatus;
	
	public Door(){
		doorStatus=DoorStatus.CLOSED;
	}
	
	public DoorStatus getDoorStatus(){
		return doorStatus;
	}
	
	public void close(){ // templet method
		if(doorStatus == DoorStatus.CLOSED)
			return;
		
		doClose();
		doorStatus=DoorStatus.CLOSED;
	}
	protected abstract void doClose(); // hook
	
	public void open(){ // templet method
		if(doorStatus==doorStatus.OPENED)
			return;
		
		doOpen();
		doorStatus=DoorStatus.OPENED;
	}
	protected abstract void doOpen(); // hook
}
