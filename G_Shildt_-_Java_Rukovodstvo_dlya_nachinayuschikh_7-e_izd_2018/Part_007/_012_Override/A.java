package _012_Override;

// Переопределение метода

public class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}

	// Отображение переменных
	void show() {
		System.out.println("i и j: " + i + " " + j);
	}
}
