package _011_MethodRefDemo3;

// Данный класс хранит знаечние типа int и определяет метод isFactor(), который возвращает true,
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
