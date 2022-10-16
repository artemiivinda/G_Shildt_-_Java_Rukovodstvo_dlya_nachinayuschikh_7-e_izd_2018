package _002_EnumDemo2;

// ИСпользование встроенных методов перечислений

class EnumDemo2 {

	public static void main(String[] args) {
		Transport tp;

		System.out.println("Константы Transport");

		// Применение метода values()
		Transport[] allTransports = Transport.values();
		for (Transport t : allTransports)
			System.out.println(t);

		System.out.println();

		// Применение метода valueOf()
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp содержит " + tp);
	}

}
