package _004_CallByValue;

public class CallByValue {

	public static void main(String[] args) {
		Test ob = new Test();

		int a = 15, b = 20;

		System.out.println("a и b перед вызовом: " + a + " " + b);

		ob.noChange(a, b);

		System.out.println("a и b полсе вызова: " + a + " " + b);
	}

}
