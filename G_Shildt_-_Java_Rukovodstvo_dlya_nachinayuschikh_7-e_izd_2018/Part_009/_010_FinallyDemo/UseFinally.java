package _010_FinallyDemo;

// Использование блока finally

class UseFinally {
	public static void genException(int what) {
		int t;
		int[] nums = new int[2];

		System.out.println("Получено: " + what);
		try {
			switch (what) {
			case 0:
				t = 10 / what; // Сгенерировать ошибку деления на нуль
				break;
			case 1:
				nums[4] = 4; // Сгенерировать ошибку обращения к массиву
				break;
			case 2:
				return; // Возврат из блока try
			}
		} catch (ArithmeticException exc) {
			// Перехват исключения
			System.out.println("Попытка деления на нуль");
			return; // возврат из блока catch
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Перехват исключения
			System.out.println("Соответствующий элемент не найден");
		} finally {
			System.out.println("Выход из блока try");
		}
	}
}
