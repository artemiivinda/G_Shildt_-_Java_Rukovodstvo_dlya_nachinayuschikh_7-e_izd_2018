package SubStr;
//���������� ������ substring()
public class SubStr {

	public static void main(String[] args) {
		String orgstr = "Java - ��������� ���������.";

		// ������������ ���������
		String substr = orgstr.substring(7, 26);

		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);
	}

}