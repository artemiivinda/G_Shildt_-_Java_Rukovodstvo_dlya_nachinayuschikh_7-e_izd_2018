package Break3;
//���������� ���������� break �� ��������� ������
public class Break3 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("������� �������� �����: " + i);
			System.out.print("	������� ����������� �����: ");

			int t = 0;
			while (t < 100) {
				if (t == 0)
					break; // ���������� �����, ���� t = 10
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}
		System.out.println("����� ���������.");
	}

}
