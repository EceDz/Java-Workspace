import java.util.Scanner;



public class DVDRentalTest {

	

	static DVDRental[] Rentals = new DVDRental[10]; 

	static Customer[] Customers = new Customer[10]; 

	static int customerCount = 0; 

	static int rentalCount = 0; 

	static int id = 0; 

	

	public static void main(String[] args) {

		

		int choice=-1;	

		Scanner DVDScanner = new Scanner(System.in);

			

		while ( choice!=0 ) {

			System.out.println("1. Enter Customer");

			System.out.println("2. Display all customers");

			System.out.println("3. Rent a movie");

			System.out.println("4. Rent a movie (custom duration)");

			System.out.println("5. Display all rentals");

			System.out.println("0. Exit");		

			System.out.print("Enter your choice: "); 

			

			choice = DVDScanner.nextInt();

			DVDScanner.nextLine(); 

			

			switch (choice) {

						

			case 1:

				Customer newCustomer = new Customer(0, "", "", 0, 0, "" );

				

				System.out.println("Enter your name: ");

				newCustomer.setName(DVDScanner.nextLine());

				

				System.out.println("Enter your surname: ");

				newCustomer.setSurname(DVDScanner.nextLine());

				

				System.out.println("Enter your age: ");

				newCustomer.setAge(DVDScanner.nextInt());

				DVDScanner.nextLine();  

				

				System.out.println("Enter your post code: ");

				newCustomer.setPostCode(DVDScanner.nextInt());

				DVDScanner.nextLine();  

				

				System.out.println("Enter your email: ");

				newCustomer.setEmail(DVDScanner.nextLine());



				

				newCustomer.setId(++id);

				Customers[customerCount++] = newCustomer; 

				System.out.println("Customer is saved!");

				

				break;

				

			case 2:

				System.out.println("Display all customers:");

				for (int i = 0; i < customerCount; i++) {

					Customers[i].displayInfo();

					System.out.println("---------------------------------");

				}

				break;

				

			case 3:

				System.out.println("Enter customer ID: ");

				

                int customerId = DVDScanner.nextInt();

                DVDScanner.nextLine();

                Customer unknownCustomer = checkId(customerId);

                

                if (unknownCustomer != null) {

                    System.out.println("Enter movie name: ");

                    String movieName = DVDScanner.nextLine();

                    

                    Rentals[rentalCount++] = new DVDRental(unknownCustomer, movieName);

                    System.out.println("Movie rented successfully for a default duration (7 days).");

                    

                } else {

                    System.out.println("Customer not found.");

                    

                }

                break;

				

			case 4:

				System.out.println("Enter customer ID: ");

				customerId = DVDScanner.nextInt();

				DVDScanner.nextLine();  			



				unknownCustomer = checkId(customerId);

                if (unknownCustomer != null) {

                	

                    System.out.println("Enter movie name: ");

                    String movie = DVDScanner.nextLine();



                    System.out.println("Enter duration in days: ");

                    int duration = DVDScanner.nextInt();

                    DVDScanner.nextLine();	

                    

	                if (duration >= 7) {

	                        Rentals[rentalCount++] = new DVDRental(unknownCustomer, movie, duration);

	                        System.out.println("Movie rented for a custom duration (7 days or more).");

	                    	} 

	                else {

	                    System.out.println("Duration must be 7 or more for this option.");

	                    }

	                } 

                else {

	                 System.out.println("Customer not found!");

	                }

	                break;

				

			

			case 5:

				System.out.println("Display all rentals:");

				for (int i = 0; i < rentalCount; i++) {

					Rentals[i].displayInfo();

					System.out.println("---------------------------------");

				}

				break;

				

			case 0:

				System.out.println("Exiting the system.");

				break;

				

			default:

				System.out.println("Invalid choice. Please try again.");
				
				break;

			}

		} 

	
}
	

    private static Customer checkId(int customerId) {

        for (int i = 0; i < customerCount; i++) {

            if (Customers[i] != null && Customers[i].getId() == customerId) {

                return Customers[i];

            }

            System.out.println("Customer not found!");

        }

        return null;

    }
    DVDScanner.close();
}
