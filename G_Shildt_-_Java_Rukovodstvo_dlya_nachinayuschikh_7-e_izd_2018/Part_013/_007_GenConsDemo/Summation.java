package _007_GenConsDemo;

class Summation {
	private int sum;

	<T extends Number> Summation(T arg) {
		sum = 0;

		for (int i = 0; i <= arg.intValue(); i++)
			sum += i;
	}

	int getSum() {
		return sum;
	}
}
