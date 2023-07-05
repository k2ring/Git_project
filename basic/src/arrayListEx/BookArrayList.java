package arrayListEx;

import java.util.ArrayList;

public class BookArrayList {

	public static void main(String[] args) {
		//사이즈(size)가 고정되어 있지 않고, 늘어나도록 저장하고자 할 경우에는 ArrayList 객체 사용
		
		ArrayList<Book> library= new ArrayList<Book>();

		
//		library.add(new Book("태백산맥","조정래"));
		
		Book book1=new Book("태백산맥1","조정래1");
		library.add(book1);
		Book book2=new Book("태백산맥2","조정래2");
		library.add(book2);
		Book book3=new Book("태백산맥3","조정래3");
		library.add(book3);
		Book book4=new Book("태백산맥4","조정래4");
		library.add(book4);
		Book book5=new Book("태백산맥5","조정래5");
		library.add(book5);
		
		
		
		
		
		for(Book book : library) {
			System.out.println(book.getBookName()+","+book.getAuthor());
		}
		
		
		
		
	}

}
