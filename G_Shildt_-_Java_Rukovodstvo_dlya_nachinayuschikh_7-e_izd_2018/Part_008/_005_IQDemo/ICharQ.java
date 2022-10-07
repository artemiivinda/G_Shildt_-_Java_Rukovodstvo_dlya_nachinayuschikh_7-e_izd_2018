package _005_IQDemo;

// Интерфейс для очереди символов

public interface ICharQ {
	// Помещение символа в очередь
	void put(char ch) throws QueueFullException;

	// Извлечение символа из очереди
	char get() throws QueueEmptyException;
}
