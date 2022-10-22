package _009_MethodRefDemo;

// Данный класс определяет три статических метода, которые проверяют целое число на соответствие
// определенным условиям

class MyIntPredicates {
	// Статический метод, который возвращает true, если заданное число простое
	static boolean isPrime(int n) {

		if (n < 2)
			return false;
		for (int i = 2; i <= n / i; i++) {
			if ((n % i) == 0)
				return false;
		}
		return true;
	}

	// Статический метод, который возвращает true, если заданно е число четное
	static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	// Статический метод, который возвращает true, если заданное число положительное
	static boolean isPositive(int n) {
		return n > 0;
	}
}
