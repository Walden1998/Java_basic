/**
 * @author Walden
 * @create 2020-10-06 15:37
 */
public class Test {
    public static void main(String[] args) {
        HourlyEmployee e2 = new HourlyEmployee();
        e2.setName("李四");
        e2.setBirthMonth(2);
        e2.setHourlySalary(50);
        e2.setHours(170);
        System.out.println(e2.getName() + "的2月份工资是" + e2.getSalary(2));
    }
}
