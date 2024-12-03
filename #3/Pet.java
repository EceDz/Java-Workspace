package Assignment5;

//SUPERCLASS
public class Pet {
	String name;
	int age;
	String color;
	
	public Pet(String name, int age , String color){
		this.name=name;
		this.age=age;
		this.color=color;		
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void displayInfo() {
		
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("color:" + color);
	}
}
