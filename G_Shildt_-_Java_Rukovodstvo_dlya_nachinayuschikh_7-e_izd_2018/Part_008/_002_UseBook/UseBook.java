package _002_UseBook;

// Данный класс принадлежит пакету bookpackext

class UseBook {

	public static void main(String[] args) {
		_001_BookDemo.Book books[] = new _001_BookDemo.Book[5];
		
		books[0] = new _001_BookDemo.Book("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018);
		books[1] = new _001_BookDemo.Book("Java: руководство для начинающих, 10-е издание", "Герберт Шилдт", 2018);
		books[2] = new _001_BookDemo.Book("Искуство программирования на Java", "Герберт Шилдт", 2005);
		books[3] = new _001_BookDemo.Book("Красный шторм поднимается", "Том Клэнси", 2006);
		books[4] = new _001_BookDemo.Book("В дороге", "Джек Керуак", 2012);

		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}
	}	
}
