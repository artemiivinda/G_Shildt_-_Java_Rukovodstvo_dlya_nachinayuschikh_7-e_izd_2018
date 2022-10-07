package _004_MoreThreads;

class MoreThreads {

	public static void main(String[] args) {
		System.out.println("Запуск основного потока.");

		MyThread mt1 = MyThread.createAndStart("Порожденный поток #1");
		MyThread mt2 = MyThread.createAndStart("Порожденный поток #2");
		MyThread mt3 = MyThread.createAndStart("Порожденный поток #3");

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Прерывание основного потка");
			}
		}
		System.out.println("Завершение основного потка");
	}

}
