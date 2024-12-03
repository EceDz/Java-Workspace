package lab4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Numbers {
	
    public static void iterateList(List <Integer> list) {
    	Iterator<Integer>iterator=list.iterator();
    	while(iterator.hasNext()) {
    		 System.out.println(iterator.next());
    	}
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        Integer[] numbers = {10, 20, 30, 40, 50, 60};
        List<Integer> list= new ArrayList<Integer>( Arrays.asList(numbers)); 
      
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Add a Number");
            System.out.println("2 - Remove a Number");
            System.out.println("3 - Print Existing Number List");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: 
	               	System.out.println("Enter the number to add: ");               	
	               	int nnum = scanner.nextInt();
	               	scanner.nextLine();
	               	
	               	list.add(nnum);
	        
	            	System.out.println("New list: ");
	            	iterateList(list);
	            	
	            	break;
                    

                case 2: 
                	System.out.println("Enter the number to remove: ");
                	Integer rnum = scanner.nextInt();
                	scanner.nextLine();
                	
                	list.remove(rnum);                		
                	
                	System.out.println("New list: ");
                	iterateList(list);
                	break;
               	                  
                case 3: 
                	System.out.println("Existing number list: ");               	
                	iterateList(list);
                	
                case 4: 
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
    
}
