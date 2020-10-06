import java.net.PortUnreachableException;
import java.security.PublicKey;

/**
 * @author Walden
 * @create 2020-10-06 15:33
 */
public class SalesEmployee extends Employee {
    private double sales;
    private double comm;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getSalary(int month) {
        if (month == this.getBirthMonth()) {
            return sales * comm + 250;
        }
        return sales * comm;
    }
}
