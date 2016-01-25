package pattern.behavioral.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//위 버튼들과 동일 하게 구현되어 있다.
//A concrete colleague
class BtnBook extends JButton implements Command {

 IMediator med;

 BtnBook(ActionListener al, IMediator m) {
     super("Book");
     addActionListener(al);
     med = m;
     med.registerBook(this);
 }

 public void execute() {
     med.book();
 }

}

