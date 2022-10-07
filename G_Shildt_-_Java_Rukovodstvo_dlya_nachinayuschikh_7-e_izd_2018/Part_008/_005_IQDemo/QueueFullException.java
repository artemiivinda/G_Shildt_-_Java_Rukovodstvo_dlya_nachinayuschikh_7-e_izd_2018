package _005_IQDemo;

// Исключение для ошибок связанных с заполнением очереди

public class QueueFullException extends Exception{
	private static final long serialVersionUID = 1L;
	int size;
	
	QueueFullException(int s){
		size = s;
	}
	public String toString() {
		return "\nОчередь заполнена. Максимальный размер " + size;
	}
}
