package Assignment5;

public class Kitten extends Cat {
	boolean isHealthy;
	
	public Kitten (String name, int age , String color, boolean isIndoors, boolean isHealthy ){
		super(name, age, color, isIndoors);
		this.isHealthy =isHealthy;
	}
	
	
	public boolean isHealthy() {
		return isHealthy;
	}

	public void setIndoors(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}



	public void displayInfo() {
		
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("color:" + this.color);
		System.out.println("isIndoors:" + this.isIndoors);
		System.out.println("isHealthy:" + isHealthy);
		
	}
	public void scratch(){
		super.scratch(); 
	}	
	
	public void play(){
		System.out. println("The kitten is playing!");
		}
	}

