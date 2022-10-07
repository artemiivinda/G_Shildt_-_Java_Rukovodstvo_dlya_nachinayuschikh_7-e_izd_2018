package _005_IQDemo;

// Демонстрация исключений при работе с очердью

class QExcDemo {

	public static void main(String[] args) {
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;

		try {
			// Переполнение очереди
			for (i = 0; i < 11; i++) {
				System.out.println("Попытка сохранения: " + (char) ('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			// Попытка извлечения символа из пустой очереди
			for (i = 0; i < 11; i++) {
				System.out.println("Получение очередного символа: ");
				ch = q.get();
				System.out.println(ch);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
	}

}
