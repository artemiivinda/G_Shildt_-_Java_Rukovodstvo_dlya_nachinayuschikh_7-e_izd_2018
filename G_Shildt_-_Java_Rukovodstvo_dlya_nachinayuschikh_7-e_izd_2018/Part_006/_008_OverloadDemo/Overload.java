package _008_OverloadDemo;

//Перегрузка методов

public class Overload {
	void ovlDemo() {
		System.out.println("Без параметров");
	}

	double ovlDemo(double a, double b) {
		System.out.println("Два парметра типа double: " + a + " " + b);
		return a + b;
	}

	void ovlDemo(int a) {
		System.out.println("Один параметр: " + a);
	}

	int ovlDemo(int a, int b) {
		System.out.println("Два параметра: " + a + " " + b);
		return a + b;
	}
}