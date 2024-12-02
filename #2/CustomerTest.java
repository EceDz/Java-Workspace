import java.util.Scanner;

public class CustomerTest {

	static Customer[] Customers = new Customer[10];

	static int customerCount = 0;



	public static void main(String[] args) {

		

		Customer newCustomer = new Customer(0, "", "", 0, 0, "");

		int choice=-1;

		Scanner customerScanner = new Scanner(System.in);	

		

		while ( choice!=0 ) {

			

			System.out.println("1. Enter Customer");

			System.out.println("2. Display All Customers");

			System.out.println("0. Exit");



			choice = customerScanner.nextInt();

			customerScanner.nextLine();

			

			switch(choice) {

			

			case 1:

				System.out.println("Enter id");

				newCustomer.setId(customerScanner.nextInt());				

				customerScanner.nextLine();

				

				System.out.println("Enter name");

				newCustomer.setName(customerScanner.nextLine());

				customerScanner.nextLine();

				

				System.out.println("Enter surname");

				newCustomer.setSurname(customerScanner.nextLine());

				customerScanner.nextLine();

				

				System.out.println("Enter age");

				newCustomer.setAge(customerScanner.nextInt());

				customerScanner.nextLine();

				

				System.out.println("Enter postal code");

				newCustomer.setPostCode(customerScanner.nextInt());				

				customerScanner.nextLine();

				

				System.out.println("Enter email");

				newCustomer.setEmail(customerScanner.nextLine());

				customerScanner.nextLine();

				

				Customers[customerCount] = newCustomer;

				customerCount++;

				

				break;

				

			case 2:

				for ( int i = 0 ; i < customerCount; i++ ) {

					if ( Customers[i] != null ) { 

			            Customers[i].displayInfo();

			        }

				}			

				break;	

				

			case 0:
				
				System.out.println("Exiting the system.");

					break;

					

			default:

				System.out.println("Invalid choice. Please enter again.");	

				break;

			

			}

			

		} 

				
	}
	customerScanner.close();

}

