package _009_GenQDemo;

// Исключение, указывающее на переполнение

class QueueFullException extends Exception{
	int size;

	QueueFullException(int s) {
		size = s;
	}

	public String toString() {
		return "\nОчередь заполнена. Максимальный размер очереди " + size;
	}
}
