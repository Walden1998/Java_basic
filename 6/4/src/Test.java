import java.util.Scanner;

/**
 * @author Walden
 * @create 2020-09-30 19:02
 */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = s.nextInt();
        if (age < 0 || age > 150) {
            throw new RuntimeException("不合法");
        }
        String grade = "老年人";
        if (age < 5) {
            grade = "baby";
        } else if (age < 10) {
            grade = "small baby";
        } else if (age < 15) {
            grade = "3";
        }
        System.out.println(grade);
    }
}
