package Lab;

public class OrderLimitExceededException extends Exception {
	private static final long serialVersionUID = 1L;
	private int quantities;

	OrderLimitExceededException (int quantities){
		this.setQuantities(quantities);
	}
	
	public static void OrderLimitExceeded(int quantities) throws OrderLimitExceededException {
        try {
            if (quantities>1000) {
                throw new OrderLimitExceededException(quantities);
            }
        } catch (OrderLimitExceededException e) {
            System.err.println("Error: Quantity must be greater than 1000. ");
        }
    }

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
}