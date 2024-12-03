package lab5;

public class FullTimeEmployee implements Employee{
    private double salary;
    
    public FullTimeEmployee(double salary) {
		this.salary = salary;
	}
    
    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    @Override
    public String getRole() {
        return "Full-Time Employee";
    }

    @Override
    public double calculateSalary() {
        return salary;  
    }
}
	
	

