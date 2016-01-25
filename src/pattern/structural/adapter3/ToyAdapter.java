package pattern.structural.adapter3;

//신모델과 똑같은 충전방식을 지원하는 구모델 어댑터
public class ToyAdapter implements NewtypeToy{
 OldtypeToy oldtype;
 // 구모델을 생성자를 통해 받음
 public ToyAdapter(OldtypeToy oldtype) {
     this.oldtype = oldtype;
 }
  
 @Override
 public void use() {
     oldtype.use();
 }

 // 구모델 충전 타입을 USB로 전환 후 충전 함.
 @Override
 public void onUSBCharge() {
     System.out.println(oldtype.getName() + "change USB MODE !!");
     oldtype.onPlug();
 }

 @Override
 public String getName() {
     return oldtype.getName();
 }
}
