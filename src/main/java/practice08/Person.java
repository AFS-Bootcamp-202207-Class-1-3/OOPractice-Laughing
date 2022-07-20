package practice08;

import java.util.Objects;

public class Person {
    protected String name;
    protected int age;
    protected int id;
    public Person(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        Person person = (Person) object;
        return id==person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
