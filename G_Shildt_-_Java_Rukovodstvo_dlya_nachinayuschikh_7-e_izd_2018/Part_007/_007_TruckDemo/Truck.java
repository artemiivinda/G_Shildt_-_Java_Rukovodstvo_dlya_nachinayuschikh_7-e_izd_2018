package _007_TruckDemo;

// Расширение класса Vehicle для грузовиков

public class Truck extends Vehicle {
	private int cargocap; // Грузоподъемность, выраженная в фунтах

	// Конструктор класса Truck
	Truck(int p, int f, int m, int c) {
		// Инициализация членов класса Vehicle c использованием конструктора этого
		// класса
		super(p, f, m);
		cargocap = c;
	}

	// Методы доступа к переменной cargocap
	int getCargo() {
		return cargocap;
	}

	void putCargo(int c) {
		cargocap = c;
	}

}
