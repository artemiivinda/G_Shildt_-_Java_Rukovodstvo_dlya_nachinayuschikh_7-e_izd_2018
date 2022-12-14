package _013_Qdemo2;

//Класс, реализующий очередь для хранения символов

public class Queue {
	private char[] q; // Массив для хранения элементов очереди

	private int putloc, getloc; // Индексы для вставки и извлечения
								// элементов очереди

	// Создание очереди на основе массива исходных значений
	Queue(char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length + 1];

		for (int i = 0; i < a.length; i++)
			put(a[i]);
	}

	// Создание пустой очереди заданного размера
	Queue(int size) {
		q = new char[size + 1]; // Выделение пмяти для очереди
		putloc = getloc = 0;
	}				

	// Создание очереди на основе имеющегося объекта Queue
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		// Копирование элементов в очередь
		for (int i = getloc + 1; i <= putloc; i++)
			q[i] = ob.q[i];
	}

	// Извлечение символа из очереди
	char get() {
		if (getloc == putloc) {
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}

		return q[getloc++];
	}

	// Помещение символа в очередь
	void put(char ch) {
		if (putloc == q.length - 1) {
			System.out.println(" - Очередь заполнена");
			return;
		}

		q[putloc++] = ch;
	}
}
