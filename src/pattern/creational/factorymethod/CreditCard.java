package pattern.creational.factorymethod;

public class CreditCard extends Product{
	public static final String USED_MSG = "의 CreditCard를 사용합니다";
	
	private String owner;
	
	public CreditCard(String owner){
		System.out.println(owner+"의 CreditCard를 만듭니다");
		this.owner = owner;
	}
	
	public void use(){
		System.out.println(owner+USED_MSG);
	}
}
