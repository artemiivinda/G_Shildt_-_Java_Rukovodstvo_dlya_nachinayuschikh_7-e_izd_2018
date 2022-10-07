package _011_Shapes7;

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

	// Создвние объекта с одинаковым значениями переменных экземпляра width и heght
	TwoDShape(double x) {
		width = height = x;
	}

	// Создание одного объекта на основе другого
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
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
