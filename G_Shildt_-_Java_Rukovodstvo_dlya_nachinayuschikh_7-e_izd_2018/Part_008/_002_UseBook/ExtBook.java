package _002_UseBook;

// Пример использования модификатора protected

class ExtBook extends _001_BookDemo.Book {
	private String publisher;

	public ExtBook(String t, String a, int d, String p) {
		super(t, a, d);
		publisher = p;
	}

	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String p) {
		publisher = p;
	}

	// Следующие инструкции допустимы, посколько подклассы имеют право доступа
	// к членам класса, объявленным защищенными
	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		title = t;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String a) {
		autor = a;
	}

	public int getPubDate() {
		return pubDate;
	}

	public void setPubDate(int d) {
		pubDate = d;
	}
}
