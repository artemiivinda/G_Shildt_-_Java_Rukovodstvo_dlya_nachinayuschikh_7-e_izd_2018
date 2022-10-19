package _003_BoundsDemo;

// Демонстрация класса NumericFns

class BoundsDemo {

	public static void main(String[] args) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);

		System.out.println("Обратная велична iOb - " + iOb.reciprocal());
		System.out.println("Дробная велична iOb - " + iOb.fraction());

		System.out.println();

		// Применение класса ouble также допустимо
		NumericFns<Double> dOb = new NumericFns<Double>(5.25);

		System.out.println("Обратная велична dOb - " + dOb.reciprocal());
		System.out.println("Дробная велична dOb - " + dOb.fraction());

		// Слудующая строка кода не будет компилироваться, так как
		// класс String не является производным от класса Number.
//		NumericFns<String> sOb = new NumericFns<String>("Ошибка!");
	}

}
