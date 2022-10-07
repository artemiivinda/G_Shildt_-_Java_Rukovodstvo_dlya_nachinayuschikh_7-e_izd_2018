package _010_TypeConv2;

//Добавление версии метода f (byte)

public class Overload2 {
	void f(byte x) {
		System.out.println("Внутри f(byte): " + x);
	}

	void f(double x) {
		System.out.println("Внутри f(double): " + x);
	}

	void f(int x) {
		System.out.println("Внутри f(int): " + x);
	}
}
