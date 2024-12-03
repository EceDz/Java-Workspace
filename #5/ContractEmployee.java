package lab5;

public class ContractEmployee implements Employee{
    private double contractAmount;
    
    public ContractEmployee (double contractAmount) {
    	this.contractAmount = contractAmount;
    }

    public double getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(double contractAmount) {
		this.contractAmount = contractAmount;
	}

    @Override
    public String getRole() {
        return "Contract Employee";
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}

