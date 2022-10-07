package _004_ShowFileEx;

/* В этой версии программы ShowFileEx инструкция try с ресурсами применяется
 * для автоматического закрытия файла, когда в нем больше нет необходимости.
 */

import java.io.*;

class ShowFileEx {

	public static void main(String[] args) {
		int i;

		// Прежде всего необходимо убедитсься в том, что программе
		// передаются имена обоих файлов
		if (args.length != 1) {
			System.out.println("Использование ShowFileEx TEST");
			return;
		}

		// Использование инструкции try с ресурсами для открытия файла
		// с последубщим его закрытием после того, как будет покинут блок try
		try (FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}

}
