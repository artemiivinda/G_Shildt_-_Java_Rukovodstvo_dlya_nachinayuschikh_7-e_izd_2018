package _005_MoreThreadsEx;

class MyThread implements Runnable {
	Thread thrd;

	// Конструктор нового потока
	MyThread(String name) {
		thrd = new Thread(this, name);
	}

	// Создание и запуск потока с помощью фабричного метода
	public static MyThread createAndStart(String name) {
		MyThread myThrd = new MyThread(name);

		myThrd.thrd.start(); // Запуск потока
		return myThrd;
	}

	// Точка входа для потока
	public void run() {
		System.out.println(thrd.getName() + " - запуск.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("В " + thrd.getName() + ", счетчик " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " - прерван.");
		}
		System.out.println(thrd.getName() + " - завершен.");
	}
}
