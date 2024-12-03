import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
	   ArrayList<Employee> employees= new ArrayList<>();
        
        FullTimeEmployee fulltimeemployee = new FullTimeEmployee(50000); 
        PartTimeEmployee parttimeemployee= new PartTimeEmployee(20,120);  
        ContractEmployee contractemployee = new ContractEmployee(30000);
        
        employees.add(fulltimeemployee);
        employees.add(parttimeemployee);
        employees.add(contractemployee);

        for (Employee employee : employees) {
            System.out.println("Role:" + employee.getRole());
            System.out.println(	"Salary:"+ employee.calculateSalary());
	        }
        /*for (Employee employee : employees) {
            System.out.printf("Role: %s\n Salary: %s\n",
            		employee.getRole(), employee.calculateSalary());
	        }
        */
	    }
	}

 
