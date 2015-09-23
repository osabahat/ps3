package ps3;

/**
 * Throws insufficient funds exception
 */
//@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {

	private double amount;

	/**
	 * Create an instance of the InsufficientFundsException class, to be thrown
	 * to the caller
	 */
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}