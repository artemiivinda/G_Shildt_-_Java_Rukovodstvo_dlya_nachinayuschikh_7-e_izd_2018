package GalToLitTable;
/*
 * Упражнение 1.2
 * 
 * Эта программа отражает таблицу перевода галлонов в литры.
 * 
 * Присвойте файлу с исходным кодом имя GalToLItTable.java.
 * 
 * */

class GalToLitTable {

	public static void main(String[] args) {
		double gallons, liters;
		int counter;

		counter = 0;
		for (gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; // Преобразование в литры
			System.out.println(gallons + " галлонам соответствует " + liters + " литра.");

			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 0; // Сбросить счетчик строк
			}
		}
	}

}
