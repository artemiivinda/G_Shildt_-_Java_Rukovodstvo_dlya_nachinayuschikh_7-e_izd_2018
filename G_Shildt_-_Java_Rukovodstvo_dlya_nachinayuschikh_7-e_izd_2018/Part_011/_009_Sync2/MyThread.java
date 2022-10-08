package _009_Sync2;

class MyThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int[] a;
	int answer;

	// Конструктор нового потока
	MyThread(String name, int[] nums) {
		thrd = new Thread(this, name);
		a = nums;
	}

	// Создание и запуск потока с помощью фабричного метода
	public static MyThread createAndStart(String name, int[] nums) {
		MyThread myThrd = new MyThread(name, nums);
		myThrd.thrd.start(); // Запуск потока
		return myThrd;
	}

	// Точка входа для потока
	public void run() {
		int sum;
		System.out.println(thrd.getName() + " - запуск.");

		// Синхронизация вызовов sumArray()
		synchronized (sa) {
			answer = sa.sumArray(a);
		}

		System.out.println("Сумма для " + thrd.getName() + " будет " + answer);
		System.out.println(thrd.getName() + " - завершение.");
	}
}
