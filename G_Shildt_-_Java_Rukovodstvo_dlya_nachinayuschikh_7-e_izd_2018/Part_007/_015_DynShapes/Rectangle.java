package _015_DynShapes;

// Подкласс для представления прямоугольников, производный от класса TwoDShape

public class Rectangle extends TwoDShape {
	// Конструктор по умолчанию
	Rectangle() {
		super();
	}

	// Конструктор класса Rectangle
	Rectangle(double w, double h) {
		super(w, h, "прямоугольник"); // Вызов конструктора суперкласса
	}

	// Создание квадрата
	Rectangle(double x) {
		super(x, "прямоугольник"); // Вызов конструктора суперкласса
	}

	// Создание одного объекта на основе другого
	Rectangle(Rectangle ob) {
		super(ob); // Передача объекта конструктотру класса TwoDShape
	}

	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}

	// Переопределение метода area() для класса Rectangle
	double area() {
		return getWidth() * getHeight();
	}
}
