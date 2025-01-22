package Lab;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the E-Commerce Order System!");
        System.out.println("Enter the product name:");
        String productName = scanner.nextLine();
        
        while(true) {
            try {
                System.out.println("Enter the quantity:");
                int quantity = scanner.nextInt();
                
                InvalidQuantityException.InvalidQuantity(quantity);
                OrderLimitExceededException.OrderLimitExceeded(quantity);
                
                System.out.printf("Order placed successfully: %s units of %s\n", quantity, productName);
                System.out.println("Thank you for using the E-Commerce Order System!");
                break; 
                
            } catch (InvalidQuantityException e) {
                System.err.println("Error: Quantity must be greater than 0.");
            } catch (OrderLimitExceededException e) {
                System.err.println("Error: Order size exceeds the limit of 1000 items.");
            }
        }
        
        scanner.close();
    }
}
