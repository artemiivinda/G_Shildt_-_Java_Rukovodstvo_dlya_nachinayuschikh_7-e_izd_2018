package _011_GenArrays;

// Обобщенные типы и массивы

class GenArrays {

	public static void main(String[] args) {
		Integer[] n = {1, 2, 3, 4, 5};
		
//		Gen<Integer>[] gens = new Gen<Integer>[10]; // Ошибка!
		
		// Следующее выражение допустимо
		Gen<?>[] gens = new Gen<?>[10];
	}

}
