package _008_Shapes6;

// Расширение класса TwoDShape

public class Triangle extends TwoDShape {
	private String style;

	// Конструктор по умолчанию
	Triangle() {
		super();

		style = "none";
	}

	Triangle(String s, double w, double h) {
		super(w, h); // вызов конструктора суперкласса

		style = s;
	}

	// Конструктор с одним аргументом для построения треугольника
	Triangle(double x) {
		super(x);

		style = "закрашенный";
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
