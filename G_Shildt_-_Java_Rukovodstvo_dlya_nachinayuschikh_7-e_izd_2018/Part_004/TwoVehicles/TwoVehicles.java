package TwoVehicles;

//� ���� ������ ����������� ������ ���� Vehicle

public class TwoVehicles {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;

		// ������������ �������� ����� ������� minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// ������������ �������� ����� ������� sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		// ������ ��������� ������� � ������ ����� ��������
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;

		System.out.println(
				"����-������ ����� ��������� " + minivan.passengers + " ���������� �� ���������� " + range1 + " ����.");
		System.out.println("���������� ���������� ����� ��������� " + sportscar.passengers
				+ " ���������� �� ���������� " + range2 + " ����.");
	}

}
