package _011_OverloadConsDemo;

//Демонстрация перегрузки конструкторов

public class MyClass {
	int x;

	MyClass() {
		System.out.println("Внутри MyClass().");
		x = 0;
	}

	MyClass(double d) {
		System.out.println("Внутри MyClass(double).");
		x = (int) d;
	}

	MyClass(int i) {
		System.out.println("Внутри MyClass(int).");
		x = i;
	}

	MyClass(int i, int j) {
		System.out.println("Внутри MyClass(int, int).");
		x = i * j;
	}
}
