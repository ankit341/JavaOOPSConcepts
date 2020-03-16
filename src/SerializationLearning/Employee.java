package SerializationLearning;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 25L;

    private String name;

    private String Address;

    private int age;

    private int group;

    public Employee(){

    }

    public Employee(String name, String address, int age, int group) {
        super();
        this.name = name;
        Address = address;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
