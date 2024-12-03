package lab5;

public class PartTimeEmployee implements Employee{
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeEmployee(double hourlyRate,int hoursWorked) {
    	this.hourlyRate = hourlyRate;
    	this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
    public String getRole() {
        return "Part-Time Employee";
    }

    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;  
    }
}

