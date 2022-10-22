package _005_GenericFunctionalInterfaceDemo;

// Обобщенный функциональный интерфейс с двумяпараметрами, который возвращает результат
// тпа boolean

interface SomeTest<T> {
	boolean test(T n, T m);
}
