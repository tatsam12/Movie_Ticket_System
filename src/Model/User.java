package Model;

public class User {
    String name;
    int age;


    public User(String name, int age, int phone_number) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getphone_number() {
        return phone_number;
    }

    public void setphone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    int phone_number;

}

