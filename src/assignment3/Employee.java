package assignment3;

/**
 *
 * @author aps5601
 */
public abstract class Employee {

    public static enum EMPLOYEE_TYPE {
        COMMISSION_EMPLOYEE("Commission Employee"),
        BASE_PLUS_COMMISSION_EMPLOYEE("Base Salary Plus Commissioned Employee"),
        SALARIED_EMPLOYEE("Salaried Employee"),
        HOURLY_EMPLOYEE("Hourly Employee");

        private final String str;

        EMPLOYEE_TYPE(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return str;
        }
    }

    //Private Data
    private final EMPLOYEE_TYPE empType;
    private final String firstName;
    private final String lastName;
    private final String ssn;

    //Constructor
    Employee(EMPLOYEE_TYPE empType, String firstName, String lastName, String ssn) {
        this.empType = empType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        String str;

        str = String.format("%s: %s with ssn: %s%n%s\tEarnings: $%.2f%n",
                empType.toString(),
                getFullName(),
                getSSN(),
                getEmployeeInfoString(),
                earnings());

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

    public EMPLOYEE_TYPE getEmployeeType() {
        return empType;
    }

    //Abstract method block
    public abstract String getEmployeeInfoString();

    public abstract double earnings();

    public abstract void raise(double percent);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("Fred", "Jones", "111-11-1111", 2000.0, .05);
        employees[1] = new BasePlusCommissionEmployee("Sue", "Smith", "222-22-2222", 3000.0, .05, 300);
        employees[2] = new SalariedEmployee("Sha", "Yang", "333-33-3333", 1150.0);
        employees[3] = new HourlyEmployee("Ian", "Tanning", "444-44-4444", 15.0, 50);
        employees[4] = new HourlyEmployee("Angela", "Domchek", "555-55-5555", 20.0, 40);

        for (Employee employee : employees) {
            switch (employee.getEmployeeType()){
                case SALARIED_EMPLOYEE:
                    employee.raise(0.04);
                    break;
                default:
                    employee.raise(0.02);
                    break;
            }
            System.out.print(employee);
        }
    }
}
