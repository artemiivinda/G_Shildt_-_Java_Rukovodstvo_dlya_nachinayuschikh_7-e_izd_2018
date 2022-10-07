package _005_CallByRef;

//Объекты передаются методам по ссылке

public class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	// Передача объекта методу. Теперь переменные ob.a и ob.b объекта,
	// используемого при вызове, также будут изменяться.
	void change(Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}
