package _008_DefaultMethodDemo;

public interface MyIF {
	// Объявление обычного метода интерфейса, который НЕ включает
	// опрделение реализации по умолчанию
	int getUserID();

	// Объявление метода по умолчанию, включающее его реализацию
	default int getAdminID() {
		return 1;
	};
}
