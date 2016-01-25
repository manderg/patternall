package pattern.creational.factorymethod;

public class Main {
	/*
	 사용자 이름을 멤버 변수로 가진 CreditCard 클래스가 있고, CreditCard객체가 사용될 때
	 어떤 operation(use())을 하고자 합니다.
	 */
	public static void main(String[] args) {
		Factory factory = new CardFactory();
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("김문성");
		
		card1.use();
		card2.use();
		//CreditCard card = new CreditCard("홍길동");
		//card.use();
	}
	/*보너스 포인트를 추가로 쌓아주는 Bonus Card를 발급하기로 함
		BonusCard card = new BonusCard("김문성");
	 강한연관성이 생기기 때문에 
	 객체 생성 인터페이스를 외부에 공개하고 실제 객체가 생성되는 부분은 안으로 감춰서 구현
	 */
	
	//팩토리 메소드 패턴은 탬플릿메소드 패턴 두번 적용 한것
	//팩토리메소드 : 생성하고자 하는 객체의 클래스(product)와 이를 생성하는 클래스(Factory)의 인터페이스만 공개하여 재사용성을 높입니다.
	//템플릿메소드 : 중복을 없애고 코드 재사용을 위한 객체를 사용하는 방법에 초점 맞춤
	
	
	/*
	 생성할 객체 타입을 예측할 수 없을 때 -> 부모 클래스 타입을 이용
	 생성할 객체의 명세를 하위 클래스에서 정의하고자 하는경우
	 객체 생성의 책임을 하위 클래스에 위임시키고 어느 하위 클래스가 위임했는지에 대한 정보를 은닉하고자 하는 경우
	 */
	
}
