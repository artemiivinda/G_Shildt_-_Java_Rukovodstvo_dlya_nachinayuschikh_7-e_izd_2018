package _012_Override;

public class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Отображение переменной k - переопределение метода show() в A
	
	void show() {
		System.out.println("k: " + k);
	}
}
