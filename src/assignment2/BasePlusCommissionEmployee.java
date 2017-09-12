package assignment2;

/**
 *
 * @author aps5601
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private final double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super("Base Salary Plus Commissioned Employee", firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String getEmployeeInfoString() {
        String str = super.getEmployeeInfoString();

        str += String.format("    with Base Salary of: $%f.2%n", getBaseSalary());

        return str;
    }

    @Override
    public double getEarnings() {
        return super.getEarnings() + getBaseSalary();
    }
}
