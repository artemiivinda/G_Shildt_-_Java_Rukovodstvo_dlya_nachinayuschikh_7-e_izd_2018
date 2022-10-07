package DWDemo;
//������������ ������������� ����� do-while
public class DWDemo {

	public static void main(String[] args) throws java.io.IOException {
		char ch;
		do {
			System.out.println("������� ������ �������, � ����� ������� ENTER: ");
			ch = (char) System.in.read(); // ������ ������� � ����������
		} while (ch != 'q');
	}

}
