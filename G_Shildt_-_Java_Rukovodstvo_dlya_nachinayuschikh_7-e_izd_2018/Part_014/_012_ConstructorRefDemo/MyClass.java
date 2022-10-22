package _012_ConstructorRefDemo;

class MyClass {
	private String str;

	// Этот конструктор имеет аргумент
	MyClass(String s) {
		str = s;
	}

	// Это конструктор по умолчанию
	MyClass() {
		str = " ";
	}

	// ...

	String getStr() {
		return str;
	}
}
