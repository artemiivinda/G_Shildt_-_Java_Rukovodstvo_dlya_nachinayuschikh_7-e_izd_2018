package _003_EnumDemo3;

// Использование конструктора, переменной экземпляра и метода перечисления

class EnumDemo3 {

	public static void main(String[] args) {
		Transport tp;

		// Отобразить скорость самолета
		System.out.println("Типичная скорость самолета: " + Transport.AIRPLANE.getSpeed() + " км в ч\n");

		// Отобразить все виды транспорта и скорости их движения
		System.out.println("Типичные скорости движения транспортных средств");

		for (Transport t : Transport.values())
			System.out.println(t + ": " + t.getSpeed() + " км в час");
	}

}
