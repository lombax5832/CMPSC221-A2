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
        super(EMPLOYEE_TYPE.BASE_PLUS_COMMISSION_EMPLOYEE, firstName, lastName, ssn, grossSales, commissionRate);

        //Validation
        if (baseSalary < 0) {
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
        if (newSalary < 0) {
            throw new IllegalArgumentException("Salary must be a positive value!");
        }
        baseSalary = newSalary;
    }

    //Abstract method override block
    @Override
    public String getEmployeeInfoString() {
        String str = super.getEmployeeInfoString();

        str += String.format("    with Base Salary of: $%.4f%n", getSalary());

        return str;
    }

    @Override
    public double earnings() {
        return super.earnings() + getSalary();
    }

    @Override
    public void raise(double percent) {
        percent += 1.0;
        setCommissionRate(getCommissionRate() * percent);
        setSalary(getSalary() * percent);
    }
}
