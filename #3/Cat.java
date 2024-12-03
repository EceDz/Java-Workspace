package Assignment5;

public class Cat extends Pet{
	boolean isIndoors;
	
	public Cat (String name, int age , String color, boolean isIndoors ){
		super(name, age, color);
		this.isIndoors=isIndoors;
	}
	
	public boolean isIndoors() {
		return isIndoors;
	}

	public void setIndoors(boolean isIndoors) {
		this.isIndoors = isIndoors;
	}


	public void displayInfo() {
		
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("color:" + this.color);
		System.out.println("isIndoors:" + isIndoors);
		
		
	}

	public void scratch(){
		System.out.println("The cat is scratching the furniture!");
		}

}
