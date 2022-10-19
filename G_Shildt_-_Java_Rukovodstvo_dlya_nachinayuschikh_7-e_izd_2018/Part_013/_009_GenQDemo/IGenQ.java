package _009_GenQDemo;

// Обобщенный интерфейс очереди

public interface IGenQ <T>{
	// Поместить элемент в очередь
	void put(T ch) throws QueueFullException;
	
	// Извлечь элемент из очереди
	T get() throws QueueEmptyException;
}
