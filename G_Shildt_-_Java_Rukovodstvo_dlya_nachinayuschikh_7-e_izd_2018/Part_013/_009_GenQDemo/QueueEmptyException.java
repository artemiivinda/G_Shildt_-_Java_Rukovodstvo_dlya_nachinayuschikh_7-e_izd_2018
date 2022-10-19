package _009_GenQDemo;

// Исключение, указывающее на исчерпание очереди

class QueueEmptyException extends Exception{
	public String toString() {
		return "\nОчередь пуста.";
	}
}
