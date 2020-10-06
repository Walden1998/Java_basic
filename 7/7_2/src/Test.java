import java.util.Scanner;

/**
 * @author Walden
 * @create 2020-09-30 19:33
 */
public class Test {
    public static void main(String[] args) {
        initUI();
    }
    public static void login(String username,String password){
        if("admin".equals(username)&&"123".equals(password)){
            System.out.println("welcome  "+username);
        }else{
            System.out.println("error");
        }
    }
    public static void initUI(){
        Scanner s= new Scanner(System.in);
        System.out.println("请登录");
        System.out.print("用户名：");
        String username=s.next();
        System.out.print("密码：");
        String password=s.next();
        login(username,password);
    }
}
