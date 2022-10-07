package _001_AccessDemo;

public class MyClass {
	private int alpha; 	// Закрытый доступ
	public int beta;   	// Открытый доступ
	int gamma; 			// Тип доступа по умолчанию (по сути, public)
	
	int getAlpha() {
		return alpha;
	}
	
	// Методы доступа к переменной alpha. Чле класса могут обращаться
	// к закрытым членам того же класса
	void setAlpha(int a) {
		alpha = a;
	}
}
