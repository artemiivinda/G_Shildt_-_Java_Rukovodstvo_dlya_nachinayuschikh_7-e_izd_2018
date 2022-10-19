package _001_GenDemo;

import org.junit.jupiter.api.Test;

// Демонстрация использования обобщенного класса

class GenDemo {
	
	@Test
	public static void test() {
		System.out.println("JUnit 5!");
	}
	
	public static void main(String[] args) {
		// Создать обобщенную ссылку на целочисленное значение
		Gen<Integer> iOb;

		// Создать объект типа Gen<Integer> и присвоить ссылку на него переменной
		// iOb. Обратите внимание на автоупаковку при инкапсуляции значения 88
		// в объекте типа Integer.
		iOb = new Gen<Integer>(88);

		// Отобразить тип данных, используемых в объекте iOb
		iOb.showType();

		// Получить значения из объекта iOb. Обратите внимание на то, что
		// приведение типов здесь не требуется.
		int v = iOb.getob();
		System.out.println("Значение: " + v);

		System.out.println();

		// Создать объект типа Gen для строк
		Gen<String> strOb = new Gen<String>("Тестирование обобщений");

		// Отобразить тип данных, используемых в объекте strOb
		strOb.showType();

		// Получить значение из объекта strOb. Заметьте, что приведение типов
		// здесь также не требуется.
		String str = strOb.getob();
		System.out.println("Значение: " + str);
		
		test();
	}

}
