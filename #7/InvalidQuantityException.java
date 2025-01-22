package Lab;

public class InvalidQuantityException extends Exception{
	private static final long serialVersionUID = 1L;
	private int quantities;

	InvalidQuantityException (int quantities){
		this.setQuantities(quantities);
	}

	public static void InvalidQuantity(int quantities) throws InvalidQuantityException {
        try {
            if (quantities<=0) {
                throw new InvalidQuantityException(quantities);
            }
        } catch (InvalidQuantityException e) {
            System.err.println("Error: Quantity must be greater than 0. ");
        }
    }

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
}