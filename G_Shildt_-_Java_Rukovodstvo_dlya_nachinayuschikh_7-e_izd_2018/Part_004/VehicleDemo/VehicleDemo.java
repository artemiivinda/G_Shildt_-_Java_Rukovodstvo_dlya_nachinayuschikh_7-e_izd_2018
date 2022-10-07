package VehicleDemo;
/*
 * 
 * ���������, � ������� ������������ ����� Vehicle.
 * 
 * ��������� ����� � �������� ����� ��� VehicleDemo.java.
 * 
 * */

// � ���� ������ ����������� ������ ���� Vehicle

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		int range;
		
		// ������������ �������� ����� � ������� minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		// ������ ��������� ������� � ������ ����� ��������
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("����-������ ����� ��������� " + minivan.passengers + 
				" ���������� �� ���������� " + range + " ����.");
	}

}
