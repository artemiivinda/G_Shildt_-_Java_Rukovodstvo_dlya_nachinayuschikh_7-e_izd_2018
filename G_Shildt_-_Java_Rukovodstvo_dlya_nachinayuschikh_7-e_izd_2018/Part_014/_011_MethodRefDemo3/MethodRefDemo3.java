package _011_MethodRefDemo3;

// Использование ссылки на метод экземпляра для обращению к любому интерфейсу.

class MethodRefDemo3 {

	public static void main(String[] args) {
		boolean result;
		
		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);
		
		// Создать ссылку inp на метод экземпляра isFactor()
		MyIntNumPredicate inp = MyIntNum :: isFactor;
		
		// Вызвать метод isFactor() для объекта myNum
		result = inp.test(myNum, 3);
		if(result)
			System.out.println("3 является делителем " +myNum.getNum());
		
		// Вызвать метод isFactor() для объекта myNum2
		result = inp.test(myNum2, 3);
		if(!result)
			System.out.println("3 не является делителем " + myNum2.getNum());
	}

}
