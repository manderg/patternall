package pattern.behavioral.observer2;

import java.util.Observable;

public class Watcher extends Observable {
	public void action(String string){
		 System.out.println("======="+string+"========");
	     setChanged(); //(사장이 떴을때만) 변화가 일어났다는 것을 알림
	     notifyObservers(string);//상세정보를 담는다(사장인지, 부장인지)
	     //Observer들은 Observable들에가 통보를 받는 입장이다.
	}
}
