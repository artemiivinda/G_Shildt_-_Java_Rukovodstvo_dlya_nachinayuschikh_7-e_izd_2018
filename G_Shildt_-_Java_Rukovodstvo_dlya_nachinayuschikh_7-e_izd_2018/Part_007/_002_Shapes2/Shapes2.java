package _002_Shapes2;

public class Shapes2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.setWidth(4.0);
		t1.setHeght(4.0);
		t1.style = "закрашенный";
		
		t2.setWidth(8.0);
		t2.setHeght(12.0);
		t2.style = "контурный";
		
		System.out.println("Информаци о t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь - " +t1.area());
		
		System.out.println();
		
		System.out.println("Информаци о t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь - " +t2.area());
	}

}
