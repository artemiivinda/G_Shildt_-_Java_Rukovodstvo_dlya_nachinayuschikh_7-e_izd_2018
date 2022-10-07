package _009_UseThrowableMethods;

// Использованеи метотдов класса Throwable

class ExcTest {
	static void genException() {
		int[] nums = new int[4];

		System.out.println("До генерации исключения");

		// Генерация исключение в связи с
		// выходом индекса за пределы массива
		nums[7] = 10;
		System.out.println("Эта строка не будет отображаться");
	}
}
