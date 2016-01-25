package pattern.behavioral.iterator;


/* 반복자 패턴
 * 내부 표현부를 노출하지 않고 어떤 집합 객체에 속한 원소들을 순차적으로 접근할 수 있는 방법
 *  iterator 를 쓰면 구현 부분에 독립적이게 된다.
 * 
 * http://shonm.tistory.com/470
 */

public class Client {
	
	public static void main(String[] args) {
		BookShelf bookShelf=new BookShelf(4);
		
		bookShelf.appendBook(new Book("Around the world in 80 Dyas"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		
		Iterator it=bookShelf.iterator();
		
		while(it.hasNext()){
			Book book=(Book)it.next();
			
			System.out.println(book.getName());
		}
	}
	
}
