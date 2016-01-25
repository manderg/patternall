package pattern.behavioral.state;


/* 스테이트 패턴
 * 상태에 따라 동일한 작업이 다른 방식으로 실행될 때 해당 상태가 작업을 수행하도록 위임하는 것
 */
public class Client {
	public static void main(String[] args) {
		Light light=new Light();
		light.on_button_pushed();
		light.off_button_pushed();
		light.off_button_pushed();
	}
}
