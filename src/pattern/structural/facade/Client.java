package pattern.structural.facade;


/* 퍼사드 패턴
 * 어떤 서브시스템의 일련의 인터페이스에 대한 통합된 인터페이스를 제공한다.
	퍼사드에서 고수준 인터페이스를 정의하기 때문에 서브시스템을 더 쉽게 사용할 수 있다.
	http://secretroute.tistory.com/entry/Head-First-Design-Patterns-%EC%A0%9C7%EA%B0%95-Adapter-%ED%8C%A8%ED%84%B4%EA%B3%BC-Facade-%ED%8C%A8%ED%84%B4
	http://devyongsik.tistory.com/195
 */

public class Client {

	public static void main(String[] args) {
		
		// 퍼사드 클래스에서는 서브시스템 클래스들을 캡슐화 하지 않는다 ! 그러므로 각 객체에 대한 메서드 또한 쓸 수 있다.
		Car car=new Car();
		Heater heater=new Heater();
		SideMirror sideMirror=new SideMirror();
		Navigation navi=new Navigation();
		
		RemoteControl remote=new RemoteControl(car, heater, navi, sideMirror);
		remote.remoteStartUP(); // 사용자는 내부 동작은 알 필요없고 이 퍼사드 패턴의 메소드만 사용하면 된다.
		
		System.out.println("-------------");
		remote.remoteStartOFF();
	}

}
