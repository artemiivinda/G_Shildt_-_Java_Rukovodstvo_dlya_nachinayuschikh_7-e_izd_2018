package _004_Shapes4;

// Добавление конструкторов в класс TwoDShape

public class TwoDShape {
	private double width;
	private double height;

	// Параметризированный конструктор
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// методы доступа к переменным экземпляра width и height
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
