package _016_AbsShape;

// Подкласс для представления прямоугольников, производный от класса TwoDShape

public class Rectangle extends TwoDShape {
	// Конструктор по умолчанию
	Rectangle() {
		super();
	}

	// Конструктор класса Rectangle
	Rectangle(double w, double h) {
		super(w, h, "прямоугольник"); // Вызвать конструктор супер класса
	}

	// Создание квадрата
	Rectangle(double x) {
		super(x, "прямоугольник"); // Вызвать конструктор суперкласса
	}

	// Создание одного объекта на основе другого
	Rectangle(Rectangle ob) {
		super(ob); // Передача объекта конструктору класса TwoDShape
	}

	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}

	double area() {
		return getWidth() * getHeight();
	}
}
