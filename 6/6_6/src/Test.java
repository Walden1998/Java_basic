/**
 * @author Walden
 * @create 2020-09-30 19:24
 */
public class Test {
    public static void main(String[] args) {
        double height = 5.0;
        int count = 0;
        while (height > 0.1) {
            height *= 0.3;
            count++;
        }
        System.out.println(count);
    }
}
