/**
 * @author Walden
 * @create 2020-10-06 15:42
 */
public class Vehicle {
    private String brand;
    private String licensePlateNumber;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public Vehicle() {
        super();
    }

    public double getSumRent(int days) {
        return 0.0;
    }
}
