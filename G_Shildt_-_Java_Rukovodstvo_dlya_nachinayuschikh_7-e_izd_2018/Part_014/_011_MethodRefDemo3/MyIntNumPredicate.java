package _011_MethodRefDemo3;

// Функциональный интерфейс для числовых предикатов, которые воздействуют на объект типа MyIntNum
// и целочисленное значение.

interface MyIntNumPredicate {
	boolean test(MyIntNum mv, int n);
}
