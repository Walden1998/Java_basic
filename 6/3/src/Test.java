/**
 * @author Walden
 * @create 2020-09-30 18:58
 */
public class Test {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 5; i >= 1; i--) {
            result *= i;
        }
        System.out.println("5的阶乘=" + result);
    }
}
