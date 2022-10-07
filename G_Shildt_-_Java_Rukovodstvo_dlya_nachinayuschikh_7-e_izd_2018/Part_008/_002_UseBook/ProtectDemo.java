package _002_UseBook;

class ProtectDemo {

	public static void main(String[] args) {
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018, "Вильямс");
		books[1] = new ExtBook("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018, "Вильямс");
		books[2] = new ExtBook("Искуство программирования на Java", "Герберт Шилдт", 2005, "Диалектика");
		books[3] = new ExtBook("Красный шторм поднимается", "Том Клэнси", 2006, "Эксмо");
		books[4] = new ExtBook("В дороге", "Джек Керуак", 2012, "Азбука");
		
		for(int i = 0; i < books.length; i++) books[i].show();
		
		// Поиск книг по автору
		System.out.println("Все книги Герберта Шилдта.");
		for(int i = 0; i < books.length; i++) 
			if(books[i].getAutor() == "Герберт Шилдт")
				System.out.println(books[i].getTitle());
		
//		books[0].title = "test title"; // Ошибка: доступ запрещен!
	}

}
