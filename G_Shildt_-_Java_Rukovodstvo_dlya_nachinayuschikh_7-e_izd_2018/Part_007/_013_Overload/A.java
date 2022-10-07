package _013_Overload;

// Методы с разными сигнатурами не переопределяются, а перегружаются

public class A {
	int i, j;
	
	A(int a, int b){
		i = a;
		j = b;
	}
	
	// Отображение переменных i и j
	void show() {
		System.out.println("i и j: " + i + " " + j);
	}
}
