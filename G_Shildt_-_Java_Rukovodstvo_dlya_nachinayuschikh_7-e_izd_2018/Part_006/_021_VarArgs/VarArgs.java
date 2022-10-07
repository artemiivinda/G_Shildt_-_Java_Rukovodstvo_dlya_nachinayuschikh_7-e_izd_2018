package _021_VarArgs;

//Демонстрация использования метода с переменным числом аргументов

public class VarArgs {

	// Метод vaTest() допускаетпеременное число аргументов
	static void vaTest(int... v) {
		System.out.println("Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");

		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);

		System.out.println();
	}

	public static void main(String[] args) {
		// Метод vaTest() может вызываться с переменным числом аргументов
		vaTest(10); // 1 аргумента
		vaTest(1, 2, 3); // 3 аргумента
		vaTest(); // без аргументов
	}

}
