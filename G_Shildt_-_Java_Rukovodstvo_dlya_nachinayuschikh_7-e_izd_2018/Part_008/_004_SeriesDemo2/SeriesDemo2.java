package _004_SeriesDemo2;

class SeriesDemo2 {

	public static void main(String[] args) {
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		_003_SeriesDemo.Series ob;

		for (int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Следующее значение ByTwos: " + ob.getNext());

			ob = threeOb;
			System.out.println("Следующее значение Next ByThrees: " + ob.getNext());
		}

	}

}
