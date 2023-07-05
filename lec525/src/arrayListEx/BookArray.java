package arrayListEx;

public class BookArray {

	public static void main(String[] args) {

		Book bookArr[] = new Book[5];
		bookArr[0] = new Book("태백산맥", "조정래");
		bookArr[1] = new Book("데미안", "헤르만헤세");
		bookArr[2] = new Book("토지", "박경리");
		bookArr[3] = new Book("자바의정석", "남궁성");
		bookArr[4] = new Book("돈키호테", "김경식(엮은이)");

		for (int i = 0; i < bookArr.length; i++) {
			System.out.println(bookArr[i].getBookName() + ", " + bookArr[i].getAuthor());
//			System.out.println(System.identityHashCode(bookArr[i])); // 해쉬코드 따기
		}

		for (Book book : bookArr) {
			System.out.println("==============");
//			System.out.println(book);
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
	}
}