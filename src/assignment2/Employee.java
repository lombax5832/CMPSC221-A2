package assignment2;

/**
 *
 * @author aps5601
 */
public abstract class Employee {

    //Private Data
    private final String EMPLOYEE_TYPE;
    private String firstName;
    private String lastName;
    private String ssn;

    //Constructor
    Employee(String empType, String firstName, String lastName, String ssn) {
        this.EMPLOYEE_TYPE = empType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        String str;

        str = String.format("%s: %s with ssn: %s%n%s    Earnings: $%.2f%n",
                getEmployeeType(),
                getFullName(),
                getSSN(),
                getEmployeeInfoString(),
                getEarnings());

        return str;
    }

    //Getter Block
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getSSN() {
        return ssn;
    }

    public String getEmployeeType() {
        return EMPLOYEE_TYPE;
    }

    //Abstract method block
    protected abstract String getEmployeeInfoString();

    public abstract double getEarnings();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CommissionEmployee employee1 = new CommissionEmployee("Fred", "Jones", "111-11-1111", 2000.0, .05);
        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Sue", "Smith", "222-22-2222", 3000.0, .05, 300);
        SalariedEmployee employee3 = new SalariedEmployee("Sha", "Yang", "333-33-3333", 1150.0);
        HourlyEmployee employee4 = new HourlyEmployee("Ian", "Tanning", "444-44-4444", 15.0, 50);
        HourlyEmployee employee5 = new HourlyEmployee("Angela", "Domchek", "555-55-5555", 20.0, 40);
        System.out.printf("%s%s%s%s%s", employee1, employee2, employee3, employee4, employee5);
    }

}
