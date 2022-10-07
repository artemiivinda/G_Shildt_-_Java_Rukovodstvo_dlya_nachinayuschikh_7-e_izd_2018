package _013_Overload;

// Создание подкласса путем расширения класса A

public class B extends A {
	int k;
	
	B(int a, int b, int c){
		super(a, b);
		
		k = c;
	}
	
	// Перегрузка метода show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}
