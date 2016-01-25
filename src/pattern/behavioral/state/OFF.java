package pattern.behavioral.state;


/* Concreate State
 * Context 객체가 요청한 작업을 자신의 방식으로 실제 실행
 */

public class OFF implements State {

	private static OFF off=new OFF();
	private OFF(){}
	
	public static OFF getInstance(){
		return off;
	}
	
	@Override
	public void on_button_pushed(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light On!");
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("반응 없음");
	}

}
