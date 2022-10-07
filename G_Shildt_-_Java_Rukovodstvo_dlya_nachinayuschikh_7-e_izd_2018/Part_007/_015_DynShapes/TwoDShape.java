package _015_DynShapes;

// Использование динамической диспетчеризации методов

public class TwoDShape {
	private double width;
	private double height;
	private String name;

	// Конструктор по умолчанию
	TwoDShape() {
		width = height = 0.0;
		name = "none";
	}

	// Параметризированный конструктор
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	// Создание объекта с одинаковыми значениями переменных экземпляра width и
	// height
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}

	// Создание одного объекта на основе другого
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	// Методы доступа к переменным экземпляра
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

	String getName() {
		return name;
	}

	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}

	double area() {
		System.out.println("Метод area() должен быть переопределен");
		return 0.0;
	}
}
