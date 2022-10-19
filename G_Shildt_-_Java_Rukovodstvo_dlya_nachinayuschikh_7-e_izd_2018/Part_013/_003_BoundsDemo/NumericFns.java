package _003_BoundsDemo;

// В этой версии класса NumericFns аргументом типа, заменяющим параметр типа T,
// должен стать класс Number или производный от нег подкласс, как показано ниже.

class NumericFns<T extends Number> {
	T num;

	// Передать конструктору ссылку на числовой объект
	NumericFns(T n) {
		num = n;
	}

	// Вернуть обратную величину
	double reciprocal() {
		return 1 / num.doubleValue();
	}

	// Вернуть дробную часть
	double fraction() {
		return num.doubleValue() - num.intValue();
	}

	// ...
}
