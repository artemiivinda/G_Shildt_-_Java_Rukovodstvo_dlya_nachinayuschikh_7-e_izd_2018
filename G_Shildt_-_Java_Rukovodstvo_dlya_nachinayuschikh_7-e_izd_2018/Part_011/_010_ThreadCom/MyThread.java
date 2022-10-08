package _010_ThreadCom;

class MyThread implements Runnable {
	Thread thrd;
	TickTock ttOb;

	// Конструктор нового потока
	MyThread(String name, TickTock tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
	}

	// Создание и запуск потока с помощью фабричного мметода
	public static MyThread createAndStart(String name, TickTock tt) {
		MyThread myThrd = new MyThread(name, tt);
		myThrd.thrd.start(); // Запуск потока
		return myThrd;
	}

	// Точка входа для потока
	public void run() {
		if (thrd.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++)
				ttOb.tick(true);
			ttOb.tick(false);
		} else {
			for (int i = 0; i < 5; i++)
				ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}
