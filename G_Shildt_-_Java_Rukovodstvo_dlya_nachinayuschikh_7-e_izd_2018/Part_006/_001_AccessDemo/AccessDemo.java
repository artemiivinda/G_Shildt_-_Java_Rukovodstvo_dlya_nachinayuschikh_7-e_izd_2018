package _001_AccessDemo;

public class AccessDemo {

	public static void main(String[] args) {
		MyClass ob = new MyClass();

		// Доступ к переменной alpha возможен только с помощью
		// специально предназначенных для это йцели методов
		ob.setAlpha(-99);
		System.out.println("ob.alpha: " + ob.getAlpha());

		// Обращение к переменной alpha так, как показанно ниже, недопустимо.
		// ob.alpha = 10; // Ошибка: alpha - закрытая переменная!

		// Следующие обращения вполне допустимы, так как переменные
		// beta и gamma являются открытыми
		ob.beta = 88;
		ob.gamma = 99;
	}

}
