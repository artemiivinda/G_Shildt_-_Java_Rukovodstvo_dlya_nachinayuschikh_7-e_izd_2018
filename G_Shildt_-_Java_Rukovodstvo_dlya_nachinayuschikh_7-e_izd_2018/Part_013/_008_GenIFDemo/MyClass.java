package _008_GenIFDemo;

// Реализовать интерфей Containment с помощью массива, предназначенного для 
// хранения значений

class MyClass<T> implements Containment<T> {
	T[] arrayRef;

	MyClass(T[] o) {
		arrayRef = o;
	}

	// Реализовать метод contains()
	public boolean contains(T o) {
		for (T x : arrayRef)
			if (x.equals(o))
				return true;
		return false;
	}
}
