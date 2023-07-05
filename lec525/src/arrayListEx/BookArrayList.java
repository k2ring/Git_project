package arrayListEx;

import java.util.ArrayList;

public class BookArrayList {

	public static void main(String[] args) {
		// 사이즈(size)가 고정되어 있지 않고, 늘어나도록 저장하고자 할 때
		// ArrayList 객체 사용

		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만헤세"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("자바의정석", "남궁성"));
		library.add(new Book("돈키호테", "김경식(엮은이)"));

//		Book book3 = new Book("토지", "박경리");
//		library.add(book1);
		
		for (Book book : library) {
			System.out.println("===================");
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		
		
		
		
	}

}
