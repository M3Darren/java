package Stream_api;

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

    public static List<Person> getPersonList(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(1,"zhangsan","男","上海"));
        people.add(new Person(2,"lisi","男","北京"));
        people.add(new Person(31,"wngwu","男","广东"));
        people.add(new Person(4,"赵六","女","深圳"));
        return people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
