package _005_MoreThreadsEx;

// Использование метода isAlive()

class MoreThreadsEx {

	public static void main(String[] args) {
		System.out.println("Запуск основного потока");

		MyThread mt1 = MyThread.createAndStart("Порожденный поток#1");
		MyThread mt2 = MyThread.createAndStart("Порожденный поток#2");
		MyThread mt3 = MyThread.createAndStart("Порожденный поток#3");

		do {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Прерывание основного потка");
			}
		} while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
		System.out.println("Завершение основного потока");
	}

}
