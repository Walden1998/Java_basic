/**
 * @author Walden
 * @create 2020-09-30 19:39
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(getBigger(10,20));
        System.out.println(getBigger(5,6,4));
    }
    public static int getBigger(int a, int b){
        return Math.max(a, b);
    }
    public static int getBigger(int a, int b, int c){
        return getBigger(a,b) >c ? getBigger(a,b) : c;
    }
}
