package pattern.behavioral.template;


/* 템플릿 메서드 패턴
 * 전체적으로는 동일하면서 [부분적으로는 다른 구문]으로 구성된 메서드의 코드 중복을 최소화할 때
 */
public class Client { //test
	public static void main(String[] args) {
		Door door=new Door();
		HyundaiMotor hyundaiMotor=new HyundaiMotor(door);
		hyundaiMotor.move(Direction.UP);
	}
}
