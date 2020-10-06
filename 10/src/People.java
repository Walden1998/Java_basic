/**
 * @author Walden
 * @create 2020-09-30 20:12
 */
public class People {
    private String name;
    private boolean sex;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String _name){
        name=_name;
    }
    public boolean isSex(){
        return sex;
    }
    public void setSex(boolean _sex){
        sex=_sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int _age){
        if(_age<0||_age>100){
            throw new RuntimeException("illegal");
        }
        age=_age;
    }
}
