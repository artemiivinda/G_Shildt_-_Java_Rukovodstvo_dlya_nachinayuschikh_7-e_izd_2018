package _012_MultiCatch;

// Использование средства группового перехвата исключений.

class MultyCatch {

	public static void main(String[] args) {
		int a = 88, b = 0;
		int result;
		char[] chrs = { 'A', 'B', 'C' };

		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0)
					result = a / b; // Генерирование исключения ArithmeticException
				else
					chrs[5] = 'X'; // Генерирование исключения ArrayIndexOutOfBoundsException
			}
			// В этой инструкции catch организует перехват обоих исключений
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Перехваченное исключение: " + e);
			}
		}

		System.out.println("После группового перехватчика исключений");
	}

}
