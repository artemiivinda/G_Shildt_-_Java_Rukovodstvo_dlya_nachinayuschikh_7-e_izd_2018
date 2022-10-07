package _006_JoinThreads;

class JoinThreads {

	public static void main(String[] args) {
		System.out.println("Запуск основного потока.");

		MyThread mt1 = MyThread.createAndStart("Порожденный поток #1");
		MyThread mt2 = MyThread.createAndStart("Порожденный поток #2");
		MyThread mt3 = MyThread.createAndStart("Порожденный поток #3");

		try {
			mt1.thrd.join();
			System.out.println("Порожденный поток #1 - присоединен.");
			mt2.thrd.join();
			System.out.println("Порожденный поток #2 - присоединен.");
			mt3.thrd.join();
			System.out.println("Порожденный поток #3 - присоединен.");
		} catch (InterruptedException exc) {
			System.out.println("Прерывание основного потока.");
		}
		System.out.println("Завершение основного потока.");
	}

}
