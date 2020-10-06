/**
 * @author Walden
 * @create 2020-09-30 18:42
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int temp = i;
            for (int j = 1; j <= 4; j++) {
                System.out.println(temp + "");
                temp *= 10;
            }
            System.out.println();
        }
    }
}
