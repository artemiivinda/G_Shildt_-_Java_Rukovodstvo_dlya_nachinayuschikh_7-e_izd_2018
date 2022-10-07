package _006_CopyFileEx;

/*Версия программы CopyFilEx, в которой используется инструкция try с ресурсами.
 * В ней демонстрируется управление двумя русурсами (в данном случае - файлами)
 * с помощью едитнственной инструкции try.
 */

import java.io.*;

class CopyFileEx {

	public static void main(String[] args) {
		int i;

		// Прежде всего необходимо убедиться в том, что программе
		// передаются имена обоих файлов
		if (args.length != 2) {
			System.out.println("ИСпользование: CopyFailEx - источник и значение ");
			return;
		}

		// Открытие двух файлов и управление ими с помощью инструкции try
		try (FileInputStream fin = new FileInputStream(args[0]);
				FileOutputStream fout = new FileOutputStream(args[1])) {
			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Ошибка ввода - вывода: " + exc);
		}
	}

}
