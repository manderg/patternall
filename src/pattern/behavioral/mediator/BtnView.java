package pattern.behavioral.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//colleague(Command) 인터페이스 를 상속 받아서 구혀한 뷰 버튼이다. 그리고 생성할때 이 중재자를 인자로 전달 받아서 이 중재자에 자기 자신을 캡슐화 해서 등록 해준다. 
//A concrete colleague
class BtnView extends JButton implements Command {
 // 버튼은 중재자 인터페이스를 멤버변수로 가지고있다. 
 IMediator med;
 // 버튼뷰의 생성자 이다. 
 BtnView(ActionListener al, IMediator m) {
     // 부모 클래스의 생성자를 실행한다. 
     super("View");
     // 부모 클래스가 가진 addActionListener 에 actionlistener 를 생성자로 전달한다. 이는        // 스윙에서 버튼이 클릭시 actionListner 클래스 안에 있는 actionperformed 메서드를 실행        // 하겠다는 의미이다.  
     addActionListener(al);
     // 멤버변수 중재자에 인자로 전달 받은 중재자를 담아준다. 
     med = m;
     // 생성자 안에서 중재자에 자기 자신을 캡슐화 해서 등록해준다. 
     med.registerView(this);
 }
 
 // Command 인터페이스에서 오버라이드한 execute 함수를 정의하였다. 모든 concreate colleague 에서 정의 되어 저야 되는 부분이다. 나중에 버튼이 눌러 졋을때 실행되어지는 부분이 된다. 
 public void execute() {
     // 버튼 생성시에 인자로 전달받은 중재자 클래스의 view()를 실행한다. 
     med.view();
 }

}
