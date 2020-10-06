/**
 * @author Walden
 * @create 2020-10-06 15:28
 */
public class HourlyEmployee extends Employee {
    private int hours;
    private double hourlySalary;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getSalary(int month) {
        double money = 0.0;
        if (hours <= 160) {
            money = hourlySalary * hours;
        } else {
            money = hourlySalary * 160 + hourlySalary * (hours - 160) * 1.5;
        }
        if (month == this.getBirthMonth()) {
            money += 250;
        }
        return money;
    }
}
