package pattern.creational.prototype;

public abstract class Prototype implements Cloneable { // Cloneable : Prototype

	// 객체 복사
	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Prototype) super.clone();
	}
	
	public abstract void setX(int x);
	public abstract void printX();
	public abstract int getX();
	
}
