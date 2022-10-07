package ContDemo;
//���������� ���������� continue
public class ContDemo {

	public static void main(String[] args) {
		int i;

		// ����� ������ ����� � �������� �� 0 �� 100
		for (i = 0; i <= 100; i++) {
			if ((i % 2) != 0)
				continue; // ���������� ���� �������� �����
			System.out.println(i);
		}
	}

}
