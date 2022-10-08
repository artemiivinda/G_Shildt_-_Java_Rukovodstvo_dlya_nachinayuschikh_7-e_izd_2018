package _009_Sync2;

class SumArray {
	private int sum;

	int sumArray(int[] nums) {
		sum = 0; // Обнуление суммы

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + " будет " + sum);
			try {
				Thread.sleep(10); // Разрешение переключения между задачами
			} catch (InterruptedException exc) {
				System.out.println("Поток прерван.");
			}
		}
		return sum;
	}
}
