package pattern.structural.adapter3;

//구모델 인터페이스
public interface OldtypeToy {
	public void use();
    
    public void onPlug();       // 구모델의 충전 타입.
    public String getName();
}
