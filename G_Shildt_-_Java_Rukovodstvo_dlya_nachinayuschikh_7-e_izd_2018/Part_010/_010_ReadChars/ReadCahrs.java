package _010_ReadChars;

// Использвоание класса BufferredReader для чтения символов с консоли

import java.io.*;

class ReadCahrs {

	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите символы; окончание ввода - символ точки");

		// Считываени символов
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != '.');
	}

}
