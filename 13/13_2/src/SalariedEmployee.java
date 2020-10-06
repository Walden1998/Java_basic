/**
 * @author Walden
 * @create 2020-10-06 15:25
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getSalary(int month) {
        if (month == this.getBirthMonth()) {
            return monthlySalary + 250;
        }
        return monthlySalary;
    }
}
