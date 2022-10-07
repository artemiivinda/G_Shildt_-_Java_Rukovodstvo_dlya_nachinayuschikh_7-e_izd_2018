package _005_Shapes5;

// Добавление дополнительных конструкторов в класс TwoDShape

public class TwoDShape {
	private double width;
	private double height;

	// Конструктор, заданный по умолчанию
	TwoDShape() {
		width = height = 0.0;
	}

	// Параметризированный конструктор
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// Создание объекта с одинаковыми значениями переменных экземпляра width и
	// height
	TwoDShape(double x) {
		width = height = x;
	}

	// Методы доступа к переменным экземпляра width и height
	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
}
