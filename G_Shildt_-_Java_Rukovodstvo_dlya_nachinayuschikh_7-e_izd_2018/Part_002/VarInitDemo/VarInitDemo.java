package VarInitDemo;

//������������ ������� ����� ����������
public class VarInitDemo {

	public static void main(String[] args) {
		int x;

		for (x = 0; x < 3; x++) {
			int y = -1; // ���������� ���������������� ��� ������ ����� � ���� ����

			System.out.println("y: " + y); // ������ ��������� �������� -1

			y = 100;
			System.out.println("���������� �������� y: " + y);
		}
	}

}
