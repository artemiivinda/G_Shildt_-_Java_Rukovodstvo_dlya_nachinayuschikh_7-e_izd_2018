package _003_ShowFile;

import java.io.*;

class ShowFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin;

		// Сначала нужно убедиться в том, что программе передается имя файла
		if (args.length != 1) {
			System.out.println("Использование: ShowFile TEST.txt");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException exc) {
			System.out.println("Файл не найден!!!");
			return;
		}

		try {
			// Чтение байтов, пока не встретился символ EOF
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Ошибка при четнии файла!!!");
			// Для закрытия файла используется блок finally
		}

		finally {
			// Закрыть файл при выходе из блока try
			try {
				fin.close();
			} catch (IOException exc) {
				System.out.println("Ошибка при закрытии файла!!!");
			}
		}
	}

}
