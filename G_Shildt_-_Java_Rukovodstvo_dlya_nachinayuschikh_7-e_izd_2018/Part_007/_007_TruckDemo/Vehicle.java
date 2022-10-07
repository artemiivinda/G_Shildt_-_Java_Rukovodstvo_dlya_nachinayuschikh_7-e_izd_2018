package _007_TruckDemo;

// Упражнение 7.1
// Создвние подкласса Vehicle для грузовиков

public class Vehicle {
	private int passengers; // Количество пассажиров
	private int fuelcap; // Объем топливного бака (в галлонах)
	private int mpg; // Потребление топлива (в милях на галлон)

	// Конструктор класса Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Дальность поездки транспортного средства
	int range() {
		return mpg * fuelcap;
	}

	// Вычисление объема топлива, требуемого для прохождения заданного пути
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

	// Методы доступа к переменным экземпляра
	int getPassengers() {
		return passengers;
	}

	void setPassengers(int p) {
		passengers = p;
	}

	int getFuelcap() {
		return fuelcap;
	}

	void setFuelcap(int f) {
		fuelcap = f;
	}

	int getMpg() {
		return mpg;
	}

	void setMpg(int m) {
		mpg = m;
	}
}
