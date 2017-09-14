package assignment2;

/**
 *
 * @author aps5601
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    //Private Data
    private double baseSalary;

    //Constructor
    BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super("Base Salary Plus Commissioned Employee", firstName, lastName, ssn, grossSales, commissionRate);
        
        //Validation
        if(baseSalary < 0){
            throw new IllegalArgumentException("Salary must be a positive value!");
        }
        
        //Initialization
        this.baseSalary = baseSalary;
    }

    //Getter Block
    public double getSalary() {
        return baseSalary;
    }
   
    //Setter Block
    public void setSalary(double newSalary) {
        if(newSalary < 0){
            throw new IllegalArgumentException("Salary must be a positive value!");
        }
        baseSalary = newSalary;
    }

    //Abstract method override block
    @Override
    public String getEmployeeInfoString() {
        String str = super.getEmployeeInfoString();

        str += String.format("\twith Base Salary of: $%.2f%n", getSalary());

        return str;
    }
    @Override
    public double getEarnings() {
        return super.getEarnings() + getSalary();
    }
}
