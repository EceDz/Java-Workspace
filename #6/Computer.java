package Lab;
import java.util.Objects;

public class Computer implements Comparable<Computer> {
	String brand;
	double processorSpeed;
	double price;
	
	public Computer(String brand,double processorSpeed,double price) {
		this.brand=brand;
		this.processorSpeed=processorSpeed;
		this.price=price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Computer second) {
		return Double.compare(this.getPrice(),second.getPrice());
	}
   
	@Override
	public String toString() {
		return "\n Brand: "+ this.brand 
				+" Processor Speed: "+ this.processorSpeed + 
				" Price: "+ this.price;
	}
	
}

