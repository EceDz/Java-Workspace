package lab;



public class DVDRental{

	

	private Customer customer;

	private String movieName;

	private int duration;

	

	public Customer getCustomer() {

		return customer;

	}



	public void setCustomer(Customer customer) {

		this.customer = customer;

	}



	public String getMovieName() {

		return movieName;

	}



	public void setMovieName(String movieName) {

		this.movieName = movieName;

	}



	public int getDuration() {

		return duration;

	}



	public void setDuration(int duration) {

		this.duration = duration;

	}

	

	public DVDRental(Customer customer, String movieName) {

		this.setCustomer(customer);

		this.setMovieName(movieName);

	}

	

	public DVDRental(Customer customer, String movieName, int duration) {

		this.setCustomer(customer);

		this.setMovieName(movieName);

		this.setDuration(duration);

	}



	

	public void displayInfo() {

		System.out.println("Customer ID: " + customer.getId());

		System.out.println("Customer Name: " + customer.getName());

		System.out.println("Movie Name: " + movieName);

		System.out.println("Duration: " + duration + " days");

	}

	

}