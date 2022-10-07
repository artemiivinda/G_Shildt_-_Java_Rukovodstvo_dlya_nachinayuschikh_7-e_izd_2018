package _005_IQDemo;

// Исключение для ошибок, связанных с пустой очередью

public class QueueEmptyException extends Exception{
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "\nОчередь пуста";
	}
}
