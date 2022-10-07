package _002_Shapes2;

// Подкласс для представления треугольников, производный от класса TwoDShapes

public class Triangle extends TwoDShape {
	String style;

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
