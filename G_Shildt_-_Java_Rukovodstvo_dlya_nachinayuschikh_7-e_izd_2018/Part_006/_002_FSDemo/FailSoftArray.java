package _002_FSDemo;

/*
 * 
 * В этом классе реализуется "отказоустойчивый массив",
 * 
 * предотвращающий ошибки времени выполнения.
 * 
 * */

public class FailSoftArray {
	private int[] a; 		// Ссылка на массив
	private int errval;		// Значение, возвращаемое в случае возникновения ошибки
							// при выполнении метода get()
	public int length; 		// Открыта переменная length
	
	// Конструктору данного класса передаются размер массива и значение, которое
	// должен возвращать метод get() при возникновении ошибки
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}
	
	// Возврат значения элемента массива с заданным индексом
	public int get(int index) {
		if(indexOK(index)) return a[index];
		return errval;
	}
	
	// Возврат логического значения true , если индекс не выходит за пределы массива
	private boolean indexOK(int index) {
		if(index >= 0 & index < length) return true;
		return false;
	}
	
	// Установка значения элемента с заданным индексом.
	// Если возникнет ошибка, вернуть логическое значение false.
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
}