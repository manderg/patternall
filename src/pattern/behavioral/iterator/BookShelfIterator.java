package pattern.behavioral.iterator;


/* ConcreteIterator
 * Iterator에 정의된 인터페이스를 구현하는 클래스, 순회 과정 중 집합 객체 내에서 현재 위치를 기억
 */
public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index; // 현재 위치
	
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf=bookShelf;
		this.index=0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		Book book=bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
