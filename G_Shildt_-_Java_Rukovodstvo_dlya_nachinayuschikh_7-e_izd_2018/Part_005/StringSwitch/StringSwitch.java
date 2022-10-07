package StringSwitch;
//������������� ����� ��� ���������� ���������� switch
public class StringSwitch {

	public static void main(String[] args) {
		String command = "cancel";

		switch (command) {
		case "connect":
			System.out.println("�����������");
			break;
		case "cancel":
			System.out.println("������");
			break;
		case "disconnect":
			System.out.println("����������");
			break;
		default:
			System.out.println("�������� �������!");
			break;
		}
	}

}
