/**
 * @author Walden
 * @create 2020-09-30 20:05
 */
public class Wife {
    String idCard;
    String name;
    String birth;
    Husband h;

    public Wife() {
        super();
    }

    public Wife(String _idCard, String _name, String _birth) {
        super();
        this.birth = _birth;
        this.idCard = _idCard;
        this.name = _name;
    }
}
