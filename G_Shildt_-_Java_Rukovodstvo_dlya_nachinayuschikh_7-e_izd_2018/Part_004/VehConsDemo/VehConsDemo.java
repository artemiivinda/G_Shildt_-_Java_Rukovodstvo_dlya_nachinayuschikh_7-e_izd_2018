package VehConsDemo;

public class VehConsDemo {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		double gallons;
		int dist = 252;

		gallons = minivan.fuelneeded(dist);

		System.out.println("��� ����������� " + dist + " ���� ����-������� ��������� " + gallons + " �������� �������.");

		gallons = sportscar.fuelneeded(dist);

		System.out.println(
				"��� ����������� " + dist + " ���� ����������� ���������� ��������� " + gallons + " �������� �������.");

	}

}
