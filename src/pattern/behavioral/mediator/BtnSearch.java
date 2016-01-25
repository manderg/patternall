package pattern.behavioral.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//위 뷰 버튼과 동일하게 구성되어져 있다. 
//A concrete colleague
class BtnSearch extends JButton implements Command {

 IMediator med;

 BtnSearch(ActionListener al, IMediator m) {
     super("Search");
     addActionListener(al);
     med = m;
     med.registerSearch(this);
 }

 public void execute() {
     med.search();
 }

}
