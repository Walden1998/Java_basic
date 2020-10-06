/**
 * @author Walden
 * @create 2020-10-06 15:50
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("宝马");
        c.setLicensePlateNumber("12434234");
        c.setModels("三厢");
        System.out.println("品牌：" + c.getBrand() + "，车牌号：" + c.getLicensePlateNumber() + "，10天总租金：" + c.getSumRent(10));
    }
}
