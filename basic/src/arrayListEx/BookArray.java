package arrayListEx;

public class BookArray {

	public static void main(String[] args) {
		
		Book bookArr []= new Book[3];
		
		
		bookArr[0]=new Book("태백산맥"," 조정래");
		bookArr[1]=new Book("데미안"," 헤르만헤세");
		bookArr[2]=new Book("토지"," 박경리");
		
//		for(int i=0;i<3;i++) {
//			System.out.println(bookArr[i]);
//			System.out.println(System.identityHashCode(bookArr[i]));
//		}
		
		System.out.println("=========");
		
		for(int i=0;i<3;i++) {
			System.out.println(bookArr[i].getBookName() + ", " + bookArr[i].getAuthor());
		}
		
		System.out.println("======================");
		
		//향상된 for문
		for(Book book : bookArr) {
			System.out.println(book.getBookName());
		}

	}

}
