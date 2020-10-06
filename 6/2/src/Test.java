import static java.lang.StrictMath.sqrt;

/**
 * @author Walden
 * @create 2020-09-30 18:48
 */

/*
求2到10000的素数
*/

public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            boolean isPrimeNum = true;
            for (int j = 2; j <= sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                System.out.println(i + " ");
                count++;
                if (count == 8) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
