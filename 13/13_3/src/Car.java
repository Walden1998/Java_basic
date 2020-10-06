/**
 * @author Walden
 * @create 2020-10-06 15:45
 */
public class Car extends Vehicle {
    private String models;

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public Car() {
        super();
    }

    public double getSumRent(int days) {
        if ("两厢".equals(models)) {
            return 300 * days;
        } else if ("三厢".equals(models)) {
            return 350 * days;
        } else {
            return 500 * days;
        }
    }
}
