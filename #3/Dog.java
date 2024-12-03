package Assignment5;

public class Dog extends Pet {
	String breed;
	
	public Dog (String name, int age , String color, String breed ){
		super(name, age, color);
		this.breed=breed;
	}
	
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void displayInfo() {
		
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("color:" + this.color);
		System.out.println("breed:" + breed);
		
		
	}
	
	public void fetch(){
		System.out. println("The dog is fetching the ball!");		
	}

}
