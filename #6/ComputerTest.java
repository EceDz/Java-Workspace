package Lab;
import java.util.ArrayList;
import java.util.Collections;

public class ComputerTest {
    public static void main(String[] args) {

        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Dell", 2.5, 899.99));
        computers.add(new Computer("HP", 3.2, 1099.99));
        computers.add(new Computer("Lenovo", 2.8, 799.99));
        computers.add(new Computer("Apple", 3.5, 1299.99));
        computers.add(new Computer("Asus", 2.2, 699.99));

         System.out.println("Display computers before sorting");
    	 System.out.println(computers);

    	System.out.println("\nSort computers by price (using Comparable)");
        Collections.sort(computers);
        System.out.println(computers);
        
        System.out.println("\nSort computers by processor speed (using Comparator)");
        Collections.sort(computers,new ProcessorSpeedComparator());
        System.out.println(computers);
        
        
        
        
    }
}
