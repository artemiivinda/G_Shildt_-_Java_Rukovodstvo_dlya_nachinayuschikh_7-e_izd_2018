package KbIn;
//������ ������� � ����������
public class KbIn {

	public static void main(String[] args) throws java.io.IOException {
		char ch;

		System.out.print("������� ������ �������, � ����� ������� ENTER: ");

		ch = (char) System.in.read(); // �������� �����

		System.out.println("�� ������ ������� " + ch);
	}

}
