package pattern.behavioral.iterator;

/* 원소를 접근하고 순회하는 데 필요한 인터페이스 제공 */
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
