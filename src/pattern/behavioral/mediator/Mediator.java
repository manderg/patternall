package pattern.behavioral.mediator;

class Mediator implements IMediator {
    //중재자 안에 멤버변수로 선언된 동료 클래스 들이다. 
    BtnView btnView;
    BtnSearch btnSearch;
    BtnBook btnBook;
    LblDisplay show;
 
    // 각각의 구성요소를 멤버변수로 등록해주는 부분이다. 
    public void registerView(BtnView v) {
        btnView = v;
    }
 
    public void registerSearch(BtnSearch s) {
        btnSearch = s;
    }
 
    public void registerBook(BtnBook b) {
        btnBook = b;
    }
 
    public void registerDisplay(LblDisplay d) {
        show = d;
    }
 // Colleague(동료)들에게 명령을 주는 함수들이다. 각각의 클래스들은 다른 버튼에게 직접적으로 제어 하지않고 이 중재자가 가지고있는 함수들을 실행 함으로써 항상 중재자를 거치게 되는 것이다. 
    public void book() {
        btnBook.setEnabled(false);
        btnView.setEnabled(true);
        btnSearch.setEnabled(true);
        show.setText("booking...");
    }
 
    public void view() {
        btnView.setEnabled(false);
        btnSearch.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("viewing...");
    }
 
    public void search() {
        btnSearch.setEnabled(false);
        btnView.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("searching...");
    }
 
}
