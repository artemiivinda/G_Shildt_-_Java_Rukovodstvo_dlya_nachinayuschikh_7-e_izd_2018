package _010_MethodRefDemo2;

// Данный класс хранит значения типа int и определяет метод isFactor(), который возвращает значения true,
// если его аргумент является делителем числа, хранящегося в классе

class MyIntNum {
	private int v;

	MyIntNum(int x) {
		v = x;
	}

	int getNum() {
		return v;
	}

	// Вернуть true, если n - делитель v
	boolean isFactor(int n) {
		return (v % n) == 0;
	}
}
