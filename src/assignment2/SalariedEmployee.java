package assignment2;

/**
 *
 * @author aps5601
 */
public class SalariedEmployee extends Employee{

    //Private Data
    private double salary;
    
    //Constructor
    SalariedEmployee(String firstName, String lastName, String ssn, double salary){
        super("Salaried Employee", firstName, lastName, ssn);
        
        //Validation
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be a positive value!");
        }
        
        //Initialization
        this.salary = salary;
    }
    
    //Getter Block
    public double getSalary(){
        return salary;
    }
    
    //Setter Block
    public void setSalary(double newSalary){
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be a positive value!");
        }
        salary = newSalary;
    }    
    
    //Abstract method override block
    @Override
    public String getEmployeeInfoString() {
        String str;
        
        str = String.format("\tSalary: $%.2f%n", getSalary());
        
        return str;
    }
    @Override
    public double getEarnings() {
        return getSalary();
    }
    
}
