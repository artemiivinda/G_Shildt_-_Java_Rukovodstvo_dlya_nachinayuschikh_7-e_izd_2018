package _005_UseBoundedWildcard;

class UseBoundedWildcard {

	// Здесь шаблон ? устанавливает соответствие классу А или его подклассам
	static void test(Gen<? extends A> o) {
		// ...
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		Gen<A> w = new Gen<A>(a);
		Gen<B> w2 = new Gen<B>(b);
		Gen<C> w3 = new Gen<C>(c);
		Gen<D> w4 = new Gen<D>(d);
		
		// Эти вызовы метода test() допустимы
		test(w);
		test(w2);
		test(w3);
		
		//  этот вызов метода test() недопустим, так как объект w4 
		//  не относиться к подклассу А
//		test(w4); // Ошибка!
	}

}
