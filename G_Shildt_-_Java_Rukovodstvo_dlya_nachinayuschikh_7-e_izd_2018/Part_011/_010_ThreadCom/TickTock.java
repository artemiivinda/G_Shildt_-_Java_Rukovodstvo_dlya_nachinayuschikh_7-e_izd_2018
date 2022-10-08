package _010_ThreadCom;

class TickTock {
	String state; // Содержит сведения о состоянии часов

	synchronized void tick(boolean running) {
		if (!running) { // Остановить часы
			state = "ticked";
			notify(); // Уведомить ожидающие потоки
			return;
		}

		System.out.print("Tick ");

		state = "ticked"; // Установить текущее состояние после такта "тик"
		notify(); // Позволить выполянтся методу tock()
		try {
			while (!state.equals("tocked"))
				wait(); // Ожидать до завершения метода tock()
		} catch (InterruptedException exc) {
			System.out.println("Прерывание потока");
		}
	}

	synchronized void tock(boolean running) {
		if (!running) { // Остановить часы
			state = "tocked";
			notify(); // Уведомить ожидающие потоки
			return;
		}

		System.out.println("Tock");
		state = "tocked"; // Установить текущее состояние после такта "так"
		notify(); // Позволить выполянтся методу tick()
		try {
			while (!state.equals("ticked"))
				wait(); // Ожидать до завершения метода tick()
		} catch (InterruptedException exc) {
			System.out.println("Прерывание потока");
		}
	}
}
