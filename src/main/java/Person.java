import java.util.Comparator;

public class Person implements Comparable<Person>{
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}
