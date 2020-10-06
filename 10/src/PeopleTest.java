/**
 * @author Walden
 * @create 2020-09-30 20:16
 */
public class PeopleTest {
    public static void main(String[] args) {
        People p=new People();
        p.setName("zhangsan");
        p.setAge(20);
        p.setSex(true);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println("性别"+(p.isSex()? "男" : "女"));
    }
}
