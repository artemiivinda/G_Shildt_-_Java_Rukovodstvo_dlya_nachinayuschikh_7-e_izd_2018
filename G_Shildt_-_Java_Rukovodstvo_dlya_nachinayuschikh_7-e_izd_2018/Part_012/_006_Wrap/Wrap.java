package _006_Wrap;

// Упаковка и распаковка значений вручную

class Wrap {

	public static void main(String[] args) {
		Integer iOb = new Integer(100);
		
		int i = iOb.intValue();
		
		System.out.println(i + " " + iOb); // отображает 100 100
	}

}
