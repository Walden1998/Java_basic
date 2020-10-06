/**
 * @author Walden
 * @create 2020-09-30 19:55
 */

public class Test {
    public static void main(String[] args) {
        Husband zhangsan = new Husband("11111", "zhangsan", "2020-10-01");
        Wife lisi = new Wife("22222", "lisi", "2020-10-02");
        zhangsan.w = lisi;
        lisi.h = zhangsan;
        System.out.println(zhangsan.name + "的妻子是" + lisi.name);
        System.out.println(lisi.name + "的丈夫是" + zhangsan.name);
        zhangsan.w = null;
        lisi.h = null;
        System.out.println(zhangsan.name + "的妻子是" + lisi.name);
        System.out.println(lisi.name + "的丈夫是" + zhangsan.name);
    }
}
