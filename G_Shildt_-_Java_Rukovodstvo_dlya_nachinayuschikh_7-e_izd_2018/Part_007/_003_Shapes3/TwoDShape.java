package _003_Shapes3;

// Добавление конструктора в класс Triangle
// Класс, описывающий двумерные объекты

public class TwoDShape {
	private double width; // Теперь эти переменные объявлены как закрытые
	private double height;

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
