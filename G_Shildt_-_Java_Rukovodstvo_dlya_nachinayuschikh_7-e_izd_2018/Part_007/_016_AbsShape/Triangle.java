package _016_AbsShape;

// Подкласс для представления треугольников, производный от класса TwoDShape

public class Triangle extends TwoDShape {
	private String style;

	// Конструктор по умолчанию
	Triangle() {
		super();
		style = "none";
	}

	// Конструктор класса Triangle
	Triangle(String s, double w, double h) {
		super(w, h, "треугольник");
		style = s;
	}

	// Конструктор с одним аргументом для построения треугольника
	Triangle(double x) {
		super(x, "треугольник"); // Вызвать конструктор суперкласса
		style = "закрашенный";
	}

	// Создание одного объекта на основе другого
	Triangle(Triangle ob) {
		super(ob); // Передача объекта конструктору класса TwoDShape
		style = ob.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
