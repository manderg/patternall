package pattern.structural.adapter3;

//프로그램 실행 
//본 예제는 객체 어댑터 패턴과 클래스 어댑터 패턴중에 객체 어댑터 패턴에 해당한다. class adapter pattern
//관련 페이지 : http://warmz.tistory.com/entry/Adapter-Pattern-%EC%96%B4%EB%8C%91%ED%84%B0-%ED%8C%A8%ED%84%B4
public class StartApp {
 public static void main (String ar[]) {
     // 구 모델의 장난감
     OldtypeToy oldToy = new OldToy("old");
     // 신 모델의 장난감
     NewtypeToy newToy = new NewToy("new");
     // 구 모델의 장난감을 어댑터를 통해 신모델처럼 사용
     ToyAdapter adater = new ToyAdapter(oldToy);
      
     //oldToy.use();
     //newToy.use();

     // 신모델 충전
     //newToy.onUSBCharge();

     // 구모델을 신모델 충전으로 사용하기 위해
     // 어뎁터에 추가했으므로, 어뎁터의 충전을 호출 함
     adater.use();
     
     adater.onUSBCharge();
     
 }
}
