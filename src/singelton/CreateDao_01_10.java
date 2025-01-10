package singelton;

/**
 * The {@code CreateDao_01_10} class demonstrates a Singleton Design Pattern. It
 * ensures that only one instance of the class is created and provides a global
 * point of access to that instance.
 *
 * <p>
 * This implementation includes lazy initialization and thread safety using a
 * synchronized block.
 * </p>
 */
public class CreateDao_01_10 {

	/**
	 * The single instance of the {@code CreateDao_01_10} class.
	 */
	private static CreateDao_01_10 createDao_01_10 = null;

	/**
	 * Private constructor to prevent external instantiation.
	 */
	private CreateDao_01_10() {
		// Private constructor to prevent instantiation
	}

	/**
	 * Returns the single instance of {@code CreateDao_01_10}. If the instance is
	 * {@code null}, it creates a new one. This method ensures thread safety with
	 * double-checked locking.
	 *
	 * @return The single instance of {@code CreateDao_01_10}.
	 */
	public static CreateDao_01_10 getInstance() {
		if (createDao_01_10 == null) {
			synchronized (CreateDao_01_10.class) {
				if (createDao_01_10 == null) {
					createDao_01_10 = new CreateDao_01_10();
				}
			}
		}
		return createDao_01_10;
	}

	/**
	 * The main method demonstrates the Singleton pattern by calling
	 * {@code getInstance()} and printing the hash code of the returned object.
	 *
	 * @param args Command-line arguments (not used).
	 */
	public static void main(String[] args) {
		CreateDao_01_10 obj1 = CreateDao_01_10.getInstance();
		System.out.println("HashCode of obj1: " + obj1.hashCode());

		CreateDao_01_10 obj2 = CreateDao_01_10.getInstance();
		System.out.println("HashCode of obj2: " + obj2.hashCode());
	}
}
