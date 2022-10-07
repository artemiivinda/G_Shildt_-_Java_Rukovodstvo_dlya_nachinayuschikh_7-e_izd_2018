package _013_Overload;

public class Overload {

	public static void main(String[] args) {
		B subOb = new B(1, 2, 3);

		subOb.show("k: "); // Вызов метода show() из класса B
		subOb.show(); // Вызов метода show() из класса A
	}

}
