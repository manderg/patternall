package pattern.creational.factorymethod;

import pattern.creational.factorymethod.CreditCard;

public class CardFactory extends Factory {
	//어떤 객체가 생성되는지는 여기서 결정함
	/* Product 을 상속받은 robot 클래스를 만들고 Factory를 상속받은 RobotFactory클래스를 만들어 구현하면됨.*/
	@Override
	protected Product createProduct(String owner) {
		
		return new CreditCard(owner);
	}
	
}
