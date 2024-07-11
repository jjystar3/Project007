package array;

public class Ex06 {

	public static void main(String[] args) {

		Book[] library = new Book[5];

		for (int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " ");
		}

		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for (int i = 0; i < library.length; i++) {
			System.out.print("\n" + library[i]);
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

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + "]";
	}

}