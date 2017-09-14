package assignment2;

/**
 *
 * @author aps5601
 */
public class CommissionEmployee extends Employee {

    //Private Data
    private double grossSales;
    private double commissionRate;

    //Constructors
    CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        this("Commissioned Employee", firstName, lastName, ssn, grossSales, commissionRate);
    }

    CommissionEmployee(String empType, String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(empType, firstName, lastName, ssn);

        //Validation
        if (commissionRate < 0.0) {
            throw new IllegalArgumentException("Commission Rate must be a positive value!");
        }

        //Initialization
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    //Getter Block
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    //Setter Block
    public void setGrossSales(double newGrossSales) {
        grossSales = newGrossSales;
    }

    public void setCommissionRate(double newCommissionRate) {
        if (newCommissionRate < 0.0) {
            throw new IllegalArgumentException("Commission Rate must be a positive value!");
        }
        commissionRate = newCommissionRate;
    }

    //Abstract method override block
    @Override
    public String getEmployeeInfoString() {
        String str;

        str = String.format("    Gross Sales: %.2f%n    Commission Rate: %.2f%n",
                getGrossSales(),
                getCommissionRate());

        return str;
    }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

}
