package AddMeth;

public class Vehicle {
	int passengers; // ���������� ����������
	int fuelcap; // ������� ���������� ����
	int mpg; // ����������� ������� � ����� �� ������

	// ����������� ��������� ������� ������������� ��������
	void range() {
		System.out.println(" ���������� - " + fuelcap * mpg + " ����.");
	}
}
