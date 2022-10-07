package _007_RWData;

// Запись и чтение двоичных данных

import java.io.*;

class RWData {

	public static void main(String[] args) {
		int i = 10;
		double d = 1023.56;
		boolean b = true;

		// Запись ряда значений
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
			System.out.println("Записанно: " + i);
			dataOut.writeInt(i);

			System.out.println("Записанно: " + d);
			dataOut.writeDouble(d);

			System.out.println("Записанно: " + b);
			dataOut.writeBoolean(b);

			System.out.println("Записанно: " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);
		} catch (IOException exc) {
			System.out.println("Ошибка при записи");
			return;
		}

		// А теперь прочитать записанные значения
		try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {
			i = dataIn.readInt();
			System.out.println("Записанно: " + i);

			d = dataIn.readDouble();
			System.out.println("Записанно: " + d);

			b = dataIn.readBoolean();
			System.out.println("Записанно: " + b);

			d = dataIn.readDouble();
			System.out.println("Записанно: " + d);
		} catch (IOException exc) {
			System.out.println("Ошибка при чтении");
		}
	}

}
