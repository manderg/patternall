package pattern.behavioral.mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//actionlistener 를 구현하면서 예시로 실행한 클래스이다. 
class MediatorDemo extends JFrame implements ActionListener {
 // 중재자를 생성 해 주는 부분이다. 
 IMediator med = new Mediator();
 // 중재자예시 생성자 이다.
 MediatorDemo() {
     // 버튼들을 추가할 JPanel을 생성한다. 
     JPanel p = new JPanel();
     // JPanel에 버튼들을 생성해서 add 해주는데 생성시에 자기 자신(actionListener를 구현한)         // 과 위에서 생성한 중재자를 전달 해준다.  
     p.add(new BtnView(this, med));
     p.add(new BtnBook(this, med));
     p.add(new BtnSearch(this, med));
     // 프레임에 라벨을 북쪽(위쪽)에 추가한다. 
     getContentPane().add(new LblDisplay(med), "North");
     // 프레임에 패널을 남쪽(아래쪽)에 추가한다.
     getContentPane().add(p, "South");
     // 프레임 사이즈를 지정한다.
     setSize(400, 200);
     setVisible(true);
 }

 // actionListener 인터페이스의 acitionPerformed 메서드를 오버라이드해서 정의하였다. 
 public void actionPerformed(ActionEvent ae) {
     // 액션이 발생 했을때, ActionEvent 에서 getSource로 액션이 발생한 버튼 클래스를 가져와서        // (Command) 로 upcasting 한다.
     Command comd = (Command) ae.getSource();

     // 업 캐스팅된 클래스에서 execute()를 실행한다. 
     comd.execute();
 }
 // 데모를 실행한다.
 public static void main(String[] args) {
     new MediatorDemo();
 }

}

