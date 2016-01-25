package pattern.creational.prototype;

/* 원형 */
public class PrototypeImpl extends Prototype {

	private int x;
	
	public PrototypeImpl(int x) {
		this.x=x;
	}
	
	@Override
	public void setX(int x) {
		this.x=x;
	}

	@Override
	public void printX() {
		System.out.println("Value: "+x);
	}

	@Override
	public int getX() {
		return x;
	}

	
}
