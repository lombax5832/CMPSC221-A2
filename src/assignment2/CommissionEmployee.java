package assignment2;

/**
 *
 * @author aps5601
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        this("Commissioned Employee", firstName, lastName, ssn, grossSales, commissionRate);
    }
    
    CommissionEmployee(String empType, String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(empType, firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String getEmployeeInfoString() {
        String str;
        
        str = String.format("    Gross Sales: %f.2%n    Commission Rate: %f.2%n",
                getGrossSales(),
                getCommissionRate());

        return str;
    }

    @Override
    public double getEarnings() {
        return getGrossSales() + getCommissionRate();
    }

}
