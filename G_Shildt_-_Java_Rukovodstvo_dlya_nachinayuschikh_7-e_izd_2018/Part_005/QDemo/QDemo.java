package QDemo;

public class QDemo {

	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("������������� ������� bigQ ��� ���������� ��������");
		// ��������� ��������� �������� � ������� bigQ
		for (i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		// ���������� � ����������� ��������� �������� �� ������� bigQ
		System.out.print("���������� ������� bigQ: ");
		for (i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		System.out.println("������������� ������� smallQ ��� ��������� ������");
		// ������������� ������� smallQ ��� ��������� ������
		for (i = 0; i < 5; i++) {
			System.out.print("������� ���������� " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();

		// �������������� ������ ��� ��������� � ������� smallQ
		System.out.print("���������� ������� smallQ: ");
		for (i = 0; i < 5; i++) {
			ch = smallQ.get();
			if (ch != (char) 0)
				System.out.print(ch);
		}
	}

}
