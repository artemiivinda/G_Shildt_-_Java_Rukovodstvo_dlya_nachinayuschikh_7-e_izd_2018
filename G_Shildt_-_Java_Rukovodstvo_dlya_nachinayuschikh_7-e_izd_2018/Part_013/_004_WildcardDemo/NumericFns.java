package _004_WildcardDemo;

// Использование шаблона аргумента

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

	// Проверить равенство абсолютных значений двух объектов
	boolean absEqual(NumericFns<?> ob) {
		if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;

		// ...
	}
}
