package _004_Shapes4;

// Подкласс для представления треугольников, производный от класса TwoDShape

public class Triangle extends TwoDShape {
	private String style;

	Triangle(String s, double w, double h) {
		super(w, h); // Вызов конструктора суперкласса
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
