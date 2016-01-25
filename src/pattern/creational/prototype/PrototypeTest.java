package pattern.creational.prototype;

/* 원형 패턴
 * 새로운 객체를 생성하기 위해 clone(복제)을 이용한다. 
 * new 키워드를 이용한 방법)으로 객체를 생성할 때에 필요한 비용이 엄청난 경우에 이 비용을 없앨 수 있다.
 * 
 * 참고
 * http://blog.naver.com/co_ke1213/150027366604
 * http://donxu.tistory.com/entry/Prototype-pattern-%ED%94%84%EB%A1%9C%ED%86%A0%ED%83%80%EC%9E%85-%ED%8C%A8%ED%84%B4
 */

// Client
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype prototype=new PrototypeImpl(1000); // 원형 객체
		
		for(int i=1;i<10;i++){
			Prototype tempotype=prototype.clone(); // 복사
			
			tempotype.setX(tempotype.getX()*i);
			tempotype.printX();
			
		}
	}

}
