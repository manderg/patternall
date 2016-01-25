package pattern.structural.adapter3;

//신모델 인터페이스
public interface NewtypeToy {
    public void use();
 
    public void onUSBCharge();  // 신모델의 충전타입.
    public String getName();
}
