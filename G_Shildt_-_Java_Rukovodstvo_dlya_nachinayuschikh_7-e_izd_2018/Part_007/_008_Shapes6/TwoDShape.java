package _008_Shapes6;

// Многоуровневая иерархия

public class TwoDShape {
	private double width;
	private double height;

	// Конструктор по умолчанию
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

	void setWidth(int w) {
		width = w;
	}

	void setHeight(int h) {
		height = h;
	}

	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
}
