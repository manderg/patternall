package pattern.behavioral.state;


/* state를 이용하는 역할
 * 현재 시스템의 상태를 나타내는 상태 변수와 실제 시스템의 상태를 구성하는 여러가지 변수가 있다.
 */
public class Light {
	private State state;
	
	public Light() {
		state=OFF.getInstance();
	}
	
	public void setState(State state){ // 각 상태 클래스에서 상태 변경을 요청해 상태를 바꿀 수 있도록 하는 메서드
		this.state=state;
	}
	
	public void on_button_pushed(){
		state.on_button_pushed(this);
	}
	
	public void off_button_pushed(){
		state.off_button_pushed(this);
	}
}
