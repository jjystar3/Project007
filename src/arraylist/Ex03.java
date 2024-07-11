package arraylist;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<Book>();

		Book book = new Book("태백산맥", "조정래");
		list.add(book);

		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			Book b = list.get(i);
			b.showInfo();
		}
		
		//람다식 for문
		for (Book b : list) {
			b.showInfo();
		}

	}

}

class Book {
	String bookName;
	String author;

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public void showInfo() {
		System.out.println(bookName + "," + author);
	}

}