package _005_IQDemo;

// Демонстрация трех реализаций интерфейса ICharQ

class IQDemo {

	public static void main(String[] args) {
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);

		ICharQ IQ;

		char ch;
		int i;

		IQ = q1;

		// Помещение ояда символов в очередь фиксированного размера
		for (i = 0; i < 10; i++)
			try {
				IQ.put((char) ('A' + i));
			}
			catch(Exception exc) {
				return;
			}

		// Отображение содержимого очереди
		System.out.print("Содержимое фиксированной очереди: ");
		for (i = 0; i < 10; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch);
			}
			catch(Exception exc) {
				return;
			}
		}
		System.out.println();

		IQ = q2;

		// Помещение ряда символов в динамическую очередь
		for (i = 0; i < 10; i++)
			try {
				IQ.put((char) ('Z' - i));
			}
		catch(Exception exc) {
			return;
		}

		// Отображение содержимого очереди
		System.out.print("Содержимое динамической очереди: ");
		for (i = 0; i < 10; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch);
			}
			catch(Exception exc) {
				return;
			}
		}

		System.out.println();

		IQ = q3;

		// Помещение ряда символов в кольцевую очередь
		for (i = 0; i < 10; i++)
			try {
				IQ.put((char) ('A' + i));
			}
		catch(Exception exc) {
			return;
		}

		// Отображение содержимого очереди
		System.out.print("Содержание кольцевой очереди: ");
		for (i = 0; i < 10; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch);
			}
			catch(Exception exc) {
				return;
			}
		}

		System.out.println();

		// Помещение дополниетльных символов в кольцевую очередь
		for (i = 10; i < 20; i++)
			try {
				IQ.put((char) ('A' + i));
			}
		catch(Exception exc) {
			return;
		}

		// Отображение содержимого очереди
		System.out.print("Содержимое кольцевой очереди: ");
		for (i = 0; i < 10; i++) {
			try {
				ch = IQ.get();
				System.out.print(ch);
			}
			catch(Exception exc) {
				return;
			}
		}
		System.out.println();

		System.out.println("/nСохранение и использование даннх" + " кольцевой очереди.");

		// Помещение символов в кольцевую очередь с последующим их извлечением
		for (i = 0; i < 20; i++) {
			try {
				IQ.put((char) ('A' + i));
				ch = IQ.get();
			}
			catch(Exception exc) {
				return;
			}
			System.out.print(ch);
		}
	}

}
