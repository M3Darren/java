import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private String sex;
    private String city;

    public Person() {
    }

    public Person(int id, String name, String sex, String city) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.city = city;
    }

    public List getPersonList(){
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person(1,"zhangsan","男","上海"));
        people.add(new Person(2,"lisi","男","北京"));
        people.add(new Person(3,"wngwu","男","广东"));
        people.add(new Person(4,"赵六","女","深圳"));
        return people;
    }
}
