package IfDemo;
/*
 * Демонстрация применения инструкции if.
 * 
 * Присвойте файлу с исходным кодом имя IfDemo.java.
 * 
 * */

class IfDemo {

	public static void main(String[] args) {
		int a, b, c;

		a = 2;
		b = 3;

		if (a < b)
			System.out.println("a меньше b");

		// Следующая строка никогда не будет выведена
		if (a == b)
			System.out.println("Вы не должны увидеть этот текст");

		System.out.println();

		c = a - b; // Переменная "с" содержит значение -1

		System.out.println("с содержит -1");
		if (c >= 0)
			System.out.println("с - не отрицательное число");
		if (c < 0)
			System.out.println("с - отрицательное число");

		System.out.println();

		c = b - a; // Переменная "с" теперь содержит значение 1

		System.out.println("с содержит 1");
		if (c >= 0)
			System.out.println("с - не отрицательное число");
		if (c < 0)
			System.out.println("c - отрицательное число");
	}

}
