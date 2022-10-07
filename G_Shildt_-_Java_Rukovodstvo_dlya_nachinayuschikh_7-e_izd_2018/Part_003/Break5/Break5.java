package Break5;
//��� ���� ������ ���������� ���������� break � ������
public class Break5 {

	public static void main(String[] args) {
		done: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.println(k + " ");
					if (k == 5)
						break done; // ������� �� ����� done
				}
				System.out.println("����� ����� �� k"); // �� ����������
			}
			System.out.println("����� ����� �� j"); // �� ����������
		}
		System.out.println("����� ����� �� i");
	}
}
