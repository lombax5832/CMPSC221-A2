package assignment2;

/**
 *
 * @author aps5601
 */
public abstract class Employee {

    private final String EMPLOYEE_TYPE;
    private String firstName;
    private String lastName;
    private String ssn;
    
    public Employee(String empType, String firstName, String lastName, String ssn){
        this.EMPLOYEE_TYPE = empType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    @Override
    public String toString(){
        String str;
        
        str = String.format("%s: %s with ssn: %s%n%s    Earnings: $%f.2%n%s    Earnings: $s%n", 
                getEmployeeType(), 
                getFullName(), 
                getSSN(),
                getEmployeeInfoString(),
                getEarnings());
        
        return str;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    public String getSSN(){
        return ssn;
    }
    
    public String getEmployeeType(){
        return EMPLOYEE_TYPE;
    }
    
    abstract String getEmployeeInfoString();
    abstract double getEarnings();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
