package CompFuel;

public class CompFuel {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		double gallons;
		int dist = 252;

		// ������������ �������� ����� ������� minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// ������������ �������� ����� ������� sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		gallons = minivan.fuelneeded(dist);

		System.out
				.println("��� ����������� " + dist + " ����, ����-������� ��������� " + gallons + " �������� �������.");

		gallons = sportscar.fuelneeded(dist);

		System.out.println("��� ����������� " + dist + " ����, ����������� ���������� ����������� " + gallons
				+ " �������� �������.");
	}

}
