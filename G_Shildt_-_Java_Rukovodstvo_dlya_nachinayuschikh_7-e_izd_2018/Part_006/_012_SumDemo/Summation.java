package _012_SumDemo;

//Инициализация одного объекта посредством другого

public class Summation {
	int sum;
	
	// Создание одного объекта на основе целочисленного знаечения
	Summation(int num){
		sum = 0;
		for(int i = 1; i <= num; i++)
			sum += i;
	}
	
	// Создание одного объекта на основе другого
	Summation(Summation ob){
		sum = ob.sum;
	}
}
