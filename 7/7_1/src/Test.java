/**
 * @author Walden
 * @create 2020-09-30 19:28
 */
public class Test {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(n + "的阶乘" + result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
