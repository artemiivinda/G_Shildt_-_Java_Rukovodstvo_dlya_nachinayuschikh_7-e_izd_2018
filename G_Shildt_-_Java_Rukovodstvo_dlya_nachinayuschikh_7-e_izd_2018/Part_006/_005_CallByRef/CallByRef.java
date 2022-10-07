package _005_CallByRef;

public class CallByRef {

	public static void main(String[] args) {
		Test ob = new Test(15, 20);
		System.out.println("ob.a и ob.b перед вывозом: " + ob.a + " " + ob.b);
		
		ob.change(ob);
		
		System.out.println("ob.a и ob.b после вывоза: " + ob.a + " " + ob.b);

	}

}
