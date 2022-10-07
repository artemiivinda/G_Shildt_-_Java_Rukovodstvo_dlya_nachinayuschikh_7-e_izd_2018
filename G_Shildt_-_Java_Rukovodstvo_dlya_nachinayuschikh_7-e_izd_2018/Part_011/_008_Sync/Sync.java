package _008_Sync;

// Использование ключевого слова synchronized для управления доступом

class Sync {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		MyThread mt1 = MyThread.createAndStart("Порожденный поток #1", a);
		
		MyThread mt2 = MyThread.createAndStart("Порожденный поток #1", a);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException exc) {
			System.out.println("Прерывание основного потока.");
		}
	}

}
