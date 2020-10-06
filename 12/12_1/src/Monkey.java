/**
 * @author Walden
 * @create 2020-10-06 14:47
 */
public class Monkey {
    private String name;
    private boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Monkey() {
        super();
    }

    public Monkey(String name, boolean sex) {
        super();
        this.name = name;
        this.sex = sex;
    }

    public void speak() {
        System.out.println(name + "wawa");
    }
}
