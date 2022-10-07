package _001_BookDemo;

// Простая программа, демонстрирующая применение пакетов

public class Book {
	protected String title;
	protected String autor;
	protected int pubDate;

	public Book(String t, String a, int p) {
		title = t;
		autor = a;
		pubDate = p;
	}

	public void show() {
		System.out.println(title);
		System.out.println(autor);
		System.out.println(pubDate);
		System.out.println();
	}
}
