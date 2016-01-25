package pattern.behavioral.mediator;

//중재자 인터페이스다. 동료(버튼)등의 구성요소을 등록하는 메서드와 버튼들이 상호작용을 하게 될함수들을 가지고있다. 
//Abstract Mediator
interface IMediator {
 // 각 버튼들을 눌렀을때 상호 간에 명령을 주게될 메서드 들이다.
 public void book();
 public void view();
 public void search();
 // 중재안에 동료들을 등록하게 될 메서드 들이다.
 public void registerView(BtnView v);
 public void registerSearch(BtnSearch s);
 public void registerBook(BtnBook b);
 public void registerDisplay(LblDisplay d);
}
