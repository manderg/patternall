package pattern.structural.decorator;


public class CrossingDecorator extends DisplayDecorator {

	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay); // 기본 기능을 가진 객체
	}
	
	public void draw(){
		super.draw(); // 기본 기능
		drawCrossing(); // 추가 기능
	}

	private void drawCrossing() {
		System.out.println("\t교차로 표시");
	}
	
	

}
