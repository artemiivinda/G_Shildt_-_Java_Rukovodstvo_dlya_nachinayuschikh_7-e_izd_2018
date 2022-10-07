package StringArrays;
//������������ ������������� �������� �����
public class StringArrays {

	public static void main(String[] args) {
		String[] strs = { "���", "������", "��������", "������." };

		System.out.println("�������� ������: ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");

		// ��������� ������
		strs[2] = "����� ��������";
		strs[3] = "������!";

		System.out.println("���������� ������: ");
		for (String s : strs)
			System.out.print(s + " ");
	}

}
