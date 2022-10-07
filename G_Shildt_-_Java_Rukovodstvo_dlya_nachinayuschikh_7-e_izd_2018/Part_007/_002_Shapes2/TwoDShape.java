package _002_Shapes2;

// Использование методов доступа для установки и получения закрытых членов
// Класс, описывающий двумерные объекты

public class TwoDShape {
	private double width; // Теперь эти переменные объявлены как закрытые
	private double height;

	// Методы доступа к закрытым переменным экземпляра width и height
	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeght(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
}
