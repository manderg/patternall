package pattern.structural.decorator;


public abstract class DisplayDecorator extends Display { //데코레이터

	private Display decoratedDisplay;
	
	public DisplayDecorator(Display decoratedDisplay){ // 기본 기능에 추가하기 위한 클래스
		this.decoratedDisplay=decoratedDisplay;
	}
	
	@Override
	public void draw() {
		decoratedDisplay.draw();
	}

}
