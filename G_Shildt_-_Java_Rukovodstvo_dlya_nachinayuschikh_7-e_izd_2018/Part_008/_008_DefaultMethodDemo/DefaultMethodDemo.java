package _008_DefaultMethodDemo;

// Использование интерфейсного метода по умолчанию

class DefaultMethodDemo {

	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();

		// Вызов метода getUserID() возможен, поскольку он явно
		// реализован классом MyIFImp
		System.out.println("Идентификатор пользователя " + obj.getUserID());

		// Вызов метода getAdminID() также возможен, поскольку
		// предоставляется его реализация по умолчанию
		System.out.println("Идентификатор администратора: " + obj.getAdminID());
	}

}
