package pattern.behavioral.observer;
/* Observer를 관리한다 */
import java.util.ArrayList;
import java.util.List;

import pattern.behavioral.observer.Observer;

public abstract class Subject{

	private List<Observer> observers=new ArrayList<Observer>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyObservers(){
		for(Observer o:observers)
			o.update();
	}

}
