package _008_LambdaExceptionDemo;

class LambdaExceptionDemo {

	public static void main(String[] args) {
		double[] values = { 1.0, 2.0, 3.0, 4.0 };

		// Данное блочное лямюда выражение может генерировать исключение IOException.
		// Следовательно,
		// это исключение должно быть указанов спецификации throws метода ioAction()
		// функционального интерфейса MyIOAction.
		MyIOAction myIO = (rdr) -> {
			int ch = rdr.read(); // Может генерировать исключение IOException

			// ...
			return true;
		};
	}

}
