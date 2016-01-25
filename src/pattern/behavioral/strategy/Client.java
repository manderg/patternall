package pattern.behavioral.strategy;


/* 전략 패턴
 * 전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴
 */

public class Client {

	public static void main(String[] args) {
		Robot taekwonV =new TaekwonV("TaekwonV");
		Robot atom=new Atom("Atom");
		
		/* 각각의 객체가 필요로 하는 기능의 객체를 넣어 사용하면 된다 */
		
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());
		
		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());
		
		System.out.println("My name is "+taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();
		
		System.out.println("My name is "+atom.getName());
		atom.move();
		atom.attack();
		
	}

}

