package Lab;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ECommerceSystem {
    public void placeOrder(String productName, int quantity) {
    	
        BufferedReader reader = null;
		try{
            reader = new BufferedReader(new FileReader("orders.txt"));
        }catch (IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }finally {
            if(reader != null){
                try{
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Exception: " + e);
                }
            }
        }
    } 
   
}
