package Help;
//������� ���������� �������
public class Help {

	public static void main(String[] args) throws java.io.IOException {
		char choice;

		System.out.println("�������:");
		System.out.println("	1. if");
		System.out.println("	2. switch");
		System.out.println("��������: ");
		choice = (char) System.in.read();

		switch (choice) {
		case '1':
			System.out.println("���������� if:\n");
			System.out.println("if(�������) ����������;");
			System.out.println("else ����������;");
			break;
		case '2':
			System.out.println("���������� switch:\n");
			System.out.println("switch(���������) {");
			System.out.println("	case ���������:");
			System.out.println("	������������������ ����������");
			System.out.println("	break;");
			System.out.println("	//...");
			System.out.println("}");
			break;
		default:
			System.out.println("������ �� ������.");
		}
	}

}
