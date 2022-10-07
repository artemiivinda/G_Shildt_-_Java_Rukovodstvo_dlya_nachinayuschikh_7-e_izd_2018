package _009_TypeConv;

/*
 * 
 * Автоматическое преобразование типов может влиять на выбор перегружаемого метода.
 * 
 * */

public class Overload2 {
	void f(double x) {
		System.out.println("Внутри f(double): " + x);
	}

	void f(int x) {
		System.out.println("Внутри f(int): " + x);
	}
}
