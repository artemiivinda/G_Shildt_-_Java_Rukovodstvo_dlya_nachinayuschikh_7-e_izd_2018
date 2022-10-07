package _011_Shapes7;

// Подкласс, применяемы для представления треугольников и производный от класса TwoDShape

public class Triangle extends TwoDShape {
	private String style;

	// Конструктор по умолчанию
	Triangle() {
		super();
		style = "none";
	}

	// Конструктор класса Triangle
	Triangle(String s, double w, double h) {
		super(w, h); // Вызов конструктора сеперкласса

		style = s;
	}

	// Конструктор с одним аргументом для построения треугольника
	Triangle(double x) {
		super(x); // Вызов конструктора суперкласса

		style = "закрашенный";
	}

	// Создание одного объекта на основе другого
	Triangle(Triangle ob) {
		super(ob); // Передача объекта конструктору суперкласса TwoDShape
		style = ob.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
