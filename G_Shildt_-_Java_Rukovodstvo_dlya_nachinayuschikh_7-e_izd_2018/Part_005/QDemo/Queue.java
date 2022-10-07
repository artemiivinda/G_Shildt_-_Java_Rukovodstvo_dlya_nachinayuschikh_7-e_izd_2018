package QDemo;

//Усовершенствованный класс очереди, предназначенной
//дляхранения символьных значений

public class Queue {
	// Эти члены класса теперь являются закрытыми
	private char[] q; // ������ ��� �������� ��������� �������
	private int putloc, getloc; // ������� ��� ������ � ���������� ��������� �������

	Queue(int size) {
		q = new char[size]; // ���������� ������ ��� �������
		putloc = getloc = 0;
	}

	// ��������� ������� � �������
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Очередь заполнена.");
			return;
		}
		q[putloc++] = ch;
	}

	// ���������� ������� �� �������
	char get() {
		if (getloc == putloc) {
			System.out.println(" - ������� �����");
			return (char) 0;
		}
		return q[getloc++];
	}
}
