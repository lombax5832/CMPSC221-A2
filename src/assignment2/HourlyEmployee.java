package assignment2;

/**
 *
 * @author aps5601
 */
public class HourlyEmployee extends Employee {

    private double wage;
    private double hoursWorked;

    HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hoursWorked) {
        super(EMPLOYEE_TYPE.HOURLY_EMPLOYEE, firstName, lastName, ssn);

        //Validation
        if (wage < 0) {
            throw new IllegalArgumentException("Wage must be a positive value!");
        }
        if (hoursWorked < 1 || hoursWorked > 168) {
            throw new IllegalArgumentException("Hours Worked must be between 1 and 168!");
        }

        //Initialization
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    //Getter Block
    public double getWage() {
        return wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    //SetterBlock
    public void setWage(double newWage) {
        if (newWage < 0) {
            throw new IllegalArgumentException("Wage must be a positive value!");
        }
        wage = newWage;
    }

    public void setHoursWorked(double newHoursWorked) {
        if (hoursWorked < 1 || hoursWorked > 168) {
            throw new IllegalArgumentException("Hours Worked must be between 1 and 168!");
        }
        hoursWorked = newHoursWorked;
    }

    //Abstract method override block
    @Override
    public String getEmployeeInfoString() {
        String str;

        str = String.format("\tHourly Wage: %.2f%n\tHours Worked: %.2f%n", getWage(), getHoursWorked());

        return str;
    }

    @Override
    public double earnings() {
        return getHoursWorked() * getWage();
    }

    @Override
    public void raise(double percent) {
        percent += 1.0;
        setWage(getWage() * percent);
    }
}
