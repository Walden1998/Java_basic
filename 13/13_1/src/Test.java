/**
 * @author Walden
 * @create 2020-10-06 15:12
 */
public class Test {
    public static void main(String[] args) {
        Bird redBird = new RedBird();
        Bird blueBird = new BlueBird();
        Bird yellowBird = new YellowBird();
        Slingshot ss = new Slingshot();
        ss.shot(redBird);
        ss.shot(blueBird);
        ss.shot(yellowBird);
    }
}
