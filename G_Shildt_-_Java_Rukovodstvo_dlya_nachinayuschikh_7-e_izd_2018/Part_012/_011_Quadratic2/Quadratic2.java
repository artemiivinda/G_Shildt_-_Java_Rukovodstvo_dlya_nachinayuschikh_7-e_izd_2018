package _011_Quadratic2;

// Использование статического импорта для помещения методов sqrt() и pow()
// в область видимости
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadratic2 {

	public static void main(String[] args) {
		// a, b и c представляют коэффициенты квадратного уравнения ax2 + bx + c = 0
		double a, b, c, x;

		a = 4;
		b = 1;
		c = -3;

		// Найти первый корень
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Первый корень: " + x);

		// Найти второй корень
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Второй корень: " + x);
	}

}
