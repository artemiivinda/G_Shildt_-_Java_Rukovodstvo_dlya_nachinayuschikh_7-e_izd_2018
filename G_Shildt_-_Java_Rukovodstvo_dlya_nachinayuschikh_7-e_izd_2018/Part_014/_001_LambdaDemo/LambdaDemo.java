package _001_LambdaDemo;

// Демонстрация двух простых лямбда выражений

class LambdaDemo {

	public static void main(String[] args) {
		MyValue myVal; // Объявление ссылки на интерфейс

		// Здесь лямбда-выражение - это просто константа. При его назначении
		// переменной myVal создается экземпляр класса, в котором
		// лямбда-выражение реализует метод getValue() интерфейса MyValue.
		myVal = () -> 98.6;

		// Вызвать метод getValue(), представляемый ранее назначенным
		// лямбда-выражением
		System.out.println("Постоянное значение: " + myVal.getValue());

		// Создать параметризированно елямбда-выражение и назначить его
		// ссылке на экземпляр MyParamValue. Это лямбда-выражение возвращает
		// обратную величину своего аргумента.
		MyParamValue myPval = (n) -> 1.0 / n;

		// Вызвать метод getValue(v) посредством ссылки myPval.
		System.out.println("Обратная величина 4 равна " + myPval.getValue(4.0));

		System.out.println("Обратная величина 8 равна " + myPval.getValue(8.0));

		// Лямбда-выражение должно быть совместимо с методом, который определяется
		// функциональным интерфейсом. Поэтому приведенные ниже два фрагмента
		// кода не будут работать.
//		myVal = () -> "three"; // Ошибка: тип String несовместим с типом Double!

//		myPval = () -> Math.random(); // Ошибка: требуется параметр!
	}

}
