package _002_ExcDemo2;

// Исключение может быть сгенерировано одним методом, а перехвачено другим

class ExcTest {
	// Генерация исключения
	static void genException() {
		int[] nums = new int[4];

		System.out.println("До генерации исключения");

		// Выход за пределы массива
		nums[7] = 10;
		System.out.println("Эта строка не будет отображаться");
	}
}
