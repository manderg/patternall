package pattern.behavioral.mediator;

import java.awt.Font;

import javax.swing.JLabel;

//라벨인데 이놈은 클릭시 이벤트가 없어서 다른놈들과 다르게 구현되어져있다. 일단 생성자는 actionlistenr 를 인자로 전달 받지 않고 중재자만 인자로 전달 받는다. 그리고 colleague 인터페이스를 구현하지 않았다.
class LblDisplay extends JLabel {

 IMediator med;

 LblDisplay(IMediator m) {
     super("Just start...");
     med = m;
     med.registerDisplay(this);
     // 중재자 패턴에선 중요하진 않지만 라벨의 폰트를 지정해주는 부분이다. 
     setFont(new Font("Arial", Font.BOLD, 24));
 }

}
