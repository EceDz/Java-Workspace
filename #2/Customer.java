package lab;



public class Customer {

	

	private int id;

	private String name;

	private String surname;

	private int age;

	private int postCode;

	private String email;

	

	public Customer(int id, String name, String surname, int age, int postCode, String email) {

		this.id = id;

		this.name = name;

		this.surname = surname;

		this.age = age;

		this.postCode = postCode;

		this.email = email;

	}

	

	public int getId() {

		return id;

	}



	public void setId(int id) {

		this.id = id;

	}



	public String getName() {

		return name;

	}



	public void setName(String name) {

		this.name = name;

	}



	public String getSurname() {

		return surname;

	}



	public void setSurname(String surname) {

		this.surname = surname;

	}



	public int getAge() {

		return age;

	}



	public void setAge(int age) {

		this.age = age;

	}



	public int getPostCode() {

		return postCode;

	}



	public void setPostCode(int postCode) {

		this.postCode = postCode;

	}



	public String getEmail() {

		return email;

	}



	public void setEmail(String email) {

		this.email = email;

	}



	public void displayInfo() {

		

		System.out.println("id:" + id);

		System.out.println("name:" + name);

		System.out.println("surname:" + surname);

		System.out.println("age:" + age);

		System.out.println("postal code:" + postCode);

		System.out.println("email:" + email);

		

	}

	

}