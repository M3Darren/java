package pojo;

import java.util.Arrays;
import java.util.Map;

public class Person {
    private String name;
    private Integer age;
    private String[] telephone;
    private Map<String,Object> hobby;

    public Person() {
    }

    public Person(String name, Integer age, String[] telephone, Map<String, Object> hobby) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getTelephone() {
        return telephone;
    }

    public void setTelephone(String[] telephone) {
        this.telephone = telephone;
    }

    public Map<String, Object> getHobby() {
        return hobby;
    }

    public void setHobby(Map<String, Object> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", telephone=" + Arrays.toString(telephone) +
                ", hobby=" + hobby +
                '}';
    }
}
