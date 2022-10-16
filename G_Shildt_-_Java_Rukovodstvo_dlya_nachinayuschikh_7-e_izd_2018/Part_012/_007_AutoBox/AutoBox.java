package _007_AutoBox;

// Демонстрация автоупаковки и автораспаковки

class AutoBox {

	public static void main(String[] args) {
		Integer iOb = 100; // Автоупаковка целого числа
		
		int i = iOb; // Автораспаковка
		
		System.out.println(i + " " + iOb); // Отображает 100
	}

}
