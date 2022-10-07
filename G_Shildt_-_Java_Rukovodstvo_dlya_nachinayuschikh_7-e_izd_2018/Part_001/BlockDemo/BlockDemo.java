package BlockDemo;
/*
 * 
 *Демонстрация применения блоков кода.
 *
 *Присвойте файлу с исходным кодом имя BlockDemo.javag
 *
 * */

class BlockDemo {

	public static void main(String[] args) {
		double i, j, d;

		i = 5;
		j = 10;

		// Телом этой инструкции if является целый блок кода
		if (i != 0) {
			System.out.println("i не равно нулю");
			d = j / i;
			System.out.println("j / i равно " + d);
		}
	}
}
