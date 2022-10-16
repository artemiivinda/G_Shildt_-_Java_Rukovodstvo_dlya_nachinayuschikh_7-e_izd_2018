package _003_EnumDemo3;

enum Transport {
	CAR(100), TRUCK(80), AIRPLANE(900), TRAIN(120), BOAT(35);

	private int speed; // Типичная скорость транспортного средства

	// Конструктор
	Transport(int s) {
		speed = s;
	}

	// Метод
	int getSpeed() {
		return speed;
	}
}
