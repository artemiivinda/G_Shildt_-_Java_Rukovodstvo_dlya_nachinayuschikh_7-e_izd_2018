package _008_RethrowDemo;

// Повторное генерирование исключений	

class Rethrow {
	public static void genException() {
		// Длина массива numer превышает длину массива denom
		int[] numer = { 4, 8, 16, 32, 62, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i] / denom[i]);
			} catch (ArithmeticException exc) {
				// Перехват исключения
				System.out.println("Попытка деления на нуль");
			} catch (ArrayIndexOutOfBoundsException exc) {
				// Перехват исключения
				System.out.println("Соответствующий элемент не найден");
				throw exc; // Повторно сгенерировать исключение
			}
		}
	}
}
