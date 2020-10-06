import java.io.ObjectOutputStream;

/**
 * @author Walden
 * @create 2020-10-06 14:59
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        super();
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public void move() {
        System.out.println(name + "is moving!");
    }
}
