package pattern.structural.adapter3;

//구모델 장난감
public class OldToy implements OldtypeToy {

	private String myName = "";
    
    public OldToy(String myName) {
        this.myName = myName;
    }
     
    @Override
    public void use() {
        System.out.println(myName+" : use this");
    }
 
    // 구모델은 플러그를 통해 충전 함.
    @Override
    public void onPlug() {
        System.out.println(myName+" : plug on");
    }
 
    @Override
    public String getName() {
        return myName;
    }

}
