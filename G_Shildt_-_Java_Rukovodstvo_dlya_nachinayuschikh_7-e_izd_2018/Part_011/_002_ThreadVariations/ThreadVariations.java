package _002_ThreadVariations;

class ThreadVariations {

	public static void main(String[] args) {
		System.out.println("Запуск основного потока.");
		
		// Создание и запуск потока
		MyThread mt = MyThread.createAndStart("Порожденный поток #1");
		
		for(int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}catch(InterruptedException exc) {
				System.out.println("Прерываени основного потока.");
			}
		}
		System.out.println("Завершение основного потока.");
	}

}
