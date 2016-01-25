package pattern.structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory{
	private static FlyweightFactory singleton = new FlyweightFactory();
	// K : key값으로 사용, V : 요기서는 Flyweight를 말합니다.
	public HashMap<K, V> pool = new HashMap<K, V>(); 
	//key로 사용될 클래스와 value로 사용할 클래스를 따로 지정해주어야한다.
	// 생성자.
	public FlyweightFactory(){}
	// 싱글턴 패턴 사용.
	public static FlyweightFactory getInstance(){
		return singleton;
	}
	// 핵심 코드.
	public synchronized V getFlyweight(K k){
		V v = pool.get(k);
		if (v == null){
			v = new V(k);
			pool.put(k, v);
		}
		return v;
	}
}
