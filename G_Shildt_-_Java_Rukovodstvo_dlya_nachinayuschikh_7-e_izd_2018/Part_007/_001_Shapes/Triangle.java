package _001_Shapes;

// Подкласс для представления треугольников, производный от класса TwoDShape

public class Triangle extends TwoDShape {
	String style;

	double area() {
		return width * height / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}
