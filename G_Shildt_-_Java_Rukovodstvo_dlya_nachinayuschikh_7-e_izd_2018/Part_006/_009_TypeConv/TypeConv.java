package _009_TypeConv;

public class TypeConv {

	public static void main(String[] args) {
		Overload2 ob = new Overload2();
		
		int i = 10;
		double d = 10.1;
		
		byte b = 99;
		short s = 10;
		float f = 11.5F;
		
		ob.f(i);	// Вызов метода ob.f(int)
		ob.f(d);	// Вызов метода ob.f(double)
		
		ob.f(b);	// Вызов метода ob.f(int) с преобразованием типов
		ob.f(s);	// Вызов метода ob.f(int) с преобразованием типов
		ob.f(f);	// Вызов метода ob.f(double) с преобразованием типов
	}

}
