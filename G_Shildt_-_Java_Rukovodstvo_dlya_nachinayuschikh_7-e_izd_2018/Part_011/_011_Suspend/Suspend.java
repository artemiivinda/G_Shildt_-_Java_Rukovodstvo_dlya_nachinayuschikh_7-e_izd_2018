package _011_Suspend;

// Приостановка, возобновление и остановка потока

class Suspend {

	public static void main(String[] args) {
		MyThread mt1 = MyThread.createAndStart("Мой поток");

		try {
			Thread.sleep(1000); // Позволить потоку ob1 начать выполнение

			mt1.mysuspend();
			System.out.println("Приостановка потока.");
			Thread.sleep(1000);

			mt1.myresume();
			System.out.println("Возобновление потока.");
			Thread.sleep(1000);

			mt1.mysuspend();
			System.out.println("Приостановка потока.");
			Thread.sleep(1000);

			mt1.myresume();
			System.out.println("Возобновление потока.");
			Thread.sleep(1000);

			mt1.mysuspend();
			System.out.println("Остановка потока.");
			mt1.mystop();
		} catch (InterruptedException e) {
			System.out.println("Прерывание основного потока ");
		}

		// Ожидание завершения потока
		try {
			mt1.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("Прерывание основного потока ;");
		}
		System.out.println("Выход из основного потока.");
	}

}
