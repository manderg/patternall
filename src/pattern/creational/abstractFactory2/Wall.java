package pattern.creational.abstractFactory2;


public class Wall implements Mapsite {

	public Wall() {
		
	}

	@Override
	public void enter() {
		System.out.println("이건 벽이다.");
	}

}
