package _008_RethrowDemo;

class RethrowDemo {

	public static void main(String[] args) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Повторный перехват исключения
			System.out.println("Фатальная ошибка - " + "Выполнение программы прервано!");
		}
	}

}
