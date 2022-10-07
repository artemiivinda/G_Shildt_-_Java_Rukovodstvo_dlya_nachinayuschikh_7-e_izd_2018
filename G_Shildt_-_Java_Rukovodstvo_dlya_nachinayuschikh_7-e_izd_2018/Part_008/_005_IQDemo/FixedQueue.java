package _005_IQDemo;

// Класс реализующий очередь фиксированного размера для хранения символов

class FixedQueue implements ICharQ {
	private char[] q; // Массив для хранения элементов очереди
	private int putloc, getloc; // Индексы вставляемых и извлекаемых элементов

	// Создание пустой очереди заданного размера
	public FixedQueue(int size) {
		q = new char[size]; // Выделение памяти для очереди
		putloc = getloc = 0;
	}

	// Помещение символа в очередь
	@Override
	public void put(char ch) throws QueueFullException {
		if (putloc == q.length) {
//			System.out.println(" - Очередь заполнена");
//			return;
			throw new QueueFullException(q.length);
		}

		q[putloc++] = ch;
	}

	// Извлечение символа из очереди
	@Override
	public char get() throws QueueEmptyException {
		if (getloc == putloc) {
//			System.out.println(" - Очередь пуста");
//			return (char) 0;
			throw new QueueEmptyException();
		}

		return q[getloc++];
	}

}
