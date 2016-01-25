package pattern.behavioral.observer2;

public class Test {
	 public static void main(String[] args) {
		 	//사장이 오는지 감시하는 Watcher
	        Watcher watcher = new Watcher();
	        //3명의 직원과 사장 끄나풀 1명, 사장이 뜨면 알려달라고함 watcher한테
	        Employee pc1 = new Employee("만화책보는 놈");
	        Employee pc2 = new Employee("퍼질러 자는 놈");
	        Employee pc3 = new Employee("포카치는 놈");
	        //spy는 pc3을 보고 있음.
	        //요놈은 꼰질르기의 대가
	        Spy spy = new Spy(pc3);
	        
	        //observer로 등록하는 부분
	        //사장이 뜨면 pc123는 일하는척 , 스파이는 일른다.
	        watcher.addObserver(pc1);
	        watcher.addObserver(pc2);
	        watcher.addObserver(pc3);
	        //spy는 같은 통보를 받지만 하는일은 다르다. 다를 수 있다.
	        watcher.addObserver(spy);
	        
	        watcher.action("사장 뜸.");
	        watcher.deleteObserver(pc3);
	        watcher.deleteObserver(spy);
	        
	        watcher.action("사장 뜸.");
	    }
}
