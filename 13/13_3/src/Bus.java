import java.io.ObjectOutputStream;

/**
 * @author Walden
 * @create 2020-10-06 15:48
 */
public class Bus extends Vehicle {
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Bus() {
        super();
    }

    public double getSumRent(int days) {
        if (seats <= 16) {
            return 400 * days;
        } else {
            return 600 * days;
        }
    }
}
