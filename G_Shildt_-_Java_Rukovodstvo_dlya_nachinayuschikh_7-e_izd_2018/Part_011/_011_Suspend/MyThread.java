package _011_Suspend;

class MyThread implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean stopped;

	MyThread(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
	}

	// Создание и запуск потока с помощью фабричного метода
	public static MyThread createAndStart(String name) {
		MyThread myThrd = new MyThread(name);
		myThrd.thrd.start();
		return myThrd;
	}

	// Точка входа для потока
	public void run() {
		System.out.println(thrd.getName() + " - запуск.");
		try {
			for (int i = 0; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}

				// Исползование синхронизированного блока для проерки значения
				// переменных suspended и stoped
				synchronized (this) {
					while (suspended) {
						wait();
					}
					if (stopped)
						break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " - прерван.");
		}
		System.out.println(thrd.getName() + " - выход.");
	}

	// Остановить поток
	synchronized void mystop() {
		stopped = true;

		// Следующие инструкции полностью останавливают приостановленный поток
		suspended = false;
		notify();
	}

	// Приостановить поток
	synchronized void mysuspend() {
		suspended = true;
	}

	// Возобновить поток
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}
